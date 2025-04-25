package Controlers;

import Models.ArchivoLocalizaciones;
import View.Home;
import View.Localizacion;
import View.Mantenimientos;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ControlLocalizacion {
    private final Localizacion vista;
    private final Home vistaPrincipal;
    private final ControlHome controlHome;
    private JPanel contenedor;
    private ControlMantenimientos controladorMantenimiento;
    
     public ControlLocalizacion(Localizacion vista, Home vistaPrincipal, ControlHome controlHome) {
        this.vista = vista;
        this.vistaPrincipal = vistaPrincipal;
        this.controlHome = controlHome;
        iniciarEventos();
    }
     
    private void iniciarEventos() {
        vista.getPanel_Guardar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (validarCampos()) {
                    String id = vista.getTID_Localizacion().getText().trim();
                    String linea = construirLineaLocalizacion();

                    new ArchivoLocalizaciones().guardarOEditarPorID(linea, id);

                    JOptionPane.showMessageDialog(null, "✅ Localizacion guardado o actualizado correctamente.");
                    limpiarCamposConID();
                }
            }
        });
        
        vista.getPanel_Eliminar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                String id = vista.getTID_Localizacion().getText().trim();

                if (id.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "⚠️ Debes ingresar un ID para eliminar el localizacion.");
                    return;
                }

                new ArchivoLocalizaciones().eliminarPorID(id);
                JOptionPane.showMessageDialog(null, "🗑 ️Localizacion eliminado (si existía).");
                limpiarCamposConID();
            }
        });
        
        vista.getTID_Localizacion().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String idTexto = vista.getTID_Localizacion().getText().trim();

                if (idTexto.isEmpty()) {
                    limpiarCampos();
                    vista.getLabel_Estado().setText("Creando");
                    return;
                }

                SwingUtilities.invokeLater(() -> {
                    String linea = new ArchivoLocalizaciones().buscarPorID(idTexto);

                    if (linea != null) {
                        String[] partes = linea.split(";", -1);
                        if (partes.length >= 1) {
                            vista.getLabel_Estado().setText("Modificando");
                            vista.getT_Tipo().setText(partes[1]);
                        }
                    } else {
                        limpiarCampos();
                        vista.getLabel_Estado().setText("Creando");
                    }
                });
            }
        });
        
        vista.getPanel_Salir().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                cerrarPanel();
            }
        });
    }
     
    private void cerrarPanel() {
        Mantenimientos panelMantenimientos = new Mantenimientos();
        new ControlMantenimientos(panelMantenimientos, vistaPrincipal, controlHome);

        JPanel contenedor = vistaPrincipal.getPanel_ControlPantallas();

        contenedor.removeAll();
        contenedor.setLayout(new BorderLayout()); // o el layout original del panel si ya tiene uno
        contenedor.add(panelMantenimientos, BorderLayout.CENTER);

        contenedor.revalidate();
        contenedor.repaint();
    }
     
    public boolean validarCampos() {
        String id = vista.getTID_Localizacion().getText().trim();
        String tipo = vista.getT_Tipo().getText().trim();

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ El campo ID del entrenador es obligatorio.");
            return false;
        }
        if (!id.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "❌ El ID debe contener solo números.");
            return false;
        }
        if (tipo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ El campo Tipo es obligatorio.");
            return false;
        }
        
        return true;
    }
     
    private String construirLineaLocalizacion() {
        String id = vista.getTID_Localizacion().getText().trim();
        String tipo = vista.getT_Tipo().getText().trim();

        return id + ";" + tipo;
    }
    
    private void limpiarCampos() {
        vista.getT_Tipo().setText("");
    }
    
    private void limpiarCamposConID() {
        vista.getTID_Localizacion().setText("");
        vista.getT_Tipo().setText("");
    }
}
