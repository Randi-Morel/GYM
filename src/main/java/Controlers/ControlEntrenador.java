package Controlers;

import Models.ArchivoEntrenadores;
import View.Entrenador;
import View.Home;
import View.Mantenimientos;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ControlEntrenador {
    private final Entrenador vista;
    private final Home vistaPrincipal;
    private final ControlHome controlHome;
    private JPanel contenedor;
    private ControlMantenimientos controladorMantenimiento;
    
     public ControlEntrenador(Entrenador vista, Home vistaPrincipal, ControlHome controlHome) {
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
                    String id = vista.getTID_Entrenador().getText().trim();
                    String linea = construirLineaEntrenador();

                    new ArchivoEntrenadores().guardarOEditarPorID(linea, id);

                    JOptionPane.showMessageDialog(null, "✅ Entrenador guardado o actualizado correctamente.");
                    limpiarCamposConID();
                }
            }
        });
        
        vista.getPanel_Eliminar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                String id = vista.getTID_Entrenador().getText().trim();

                if (id.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "⚠️ Debes ingresar un ID para eliminar el entrenador.");
                    return;
                }

                new ArchivoEntrenadores().eliminarPorIDEntrenador(id);
                JOptionPane.showMessageDialog(null, "🗑️ Entrenador eliminado (si existía).");
                limpiarCamposConID();
            }
        });
        
        vista.getTID_Entrenador().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String idTexto = vista.getTID_Entrenador().getText().trim();

                if (idTexto.isEmpty()) {
                    limpiarCampos();
                    vista.getLabel_Estado().setText("Creando");
                    return;
                }

                SwingUtilities.invokeLater(() -> {
                    String linea = new ArchivoEntrenadores().buscarPorIDEntrenador(idTexto);

                    if (linea != null) {
                        String[] partes = linea.split(";", -1);
                        if (partes.length >= 3) {
                            vista.getLabel_Estado().setText("Modificando");
                            vista.getT_Nombre().setText(partes[1]);
                            vista.getT_Apellidos().setText(partes[2]);
                            vista.getT_Telefono().setText(partes.length >= 4 ? partes[3] : "");
                            vista.getT_Correo().setText(partes.length >= 5 ? partes[4] : "");
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
        String id = vista.getTID_Entrenador().getText().trim();
        String nombre = vista.getT_Nombre().getText().trim();
        String apellidos = vista.getT_Apellidos().getText().trim();

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ El campo ID del entrenador es obligatorio.");
            return false;
        }
        if (!id.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "❌ El ID debe contener solo números.");
            return false;
        }
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ El campo Nombre es obligatorio.");
            return false;
        }
        if (apellidos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ El campo Apellidos es obligatorio.");
            return false;
        }
        
        return true;
    }
     
    private String construirLineaEntrenador() {
        String id = vista.getTID_Entrenador().getText().trim();
        String nombre = vista.getT_Nombre().getText().trim();
        String apellidos = vista.getT_Apellidos().getText().trim();
        String telefono = vista.getT_Telefono().getText().trim();
        String correo = vista.getT_Correo().getText().trim();

        return id + ";" + nombre + ";" + apellidos + ";" + telefono + ";" + correo;
    }
    
    private void limpiarCampos() {
        vista.getT_Nombre().setText("");
        vista.getT_Telefono().setText("");
        vista.getT_Apellidos().setText("");
        vista.getT_Correo().setText("");
    }
    
    private void limpiarCamposConID() {
        vista.getTID_Entrenador().setText("");
        vista.getT_Nombre().setText("");
        vista.getT_Telefono().setText("");
        vista.getT_Apellidos().setText("");
        vista.getT_Correo().setText("");
    }
    
}
