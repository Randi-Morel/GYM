package Controlers;

import Models.ArchivoEstadoReserva;
import View.EstadoReserva;
import View.Home;
import View.Mantenimientos;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ControlEstadoReserva {
    private final EstadoReserva vista;
    private final Home vistaPrincipal;
    private final ControlHome controlHome;
    private JPanel contenedor;
    private ControlMantenimientos controladorMantenimiento;
    
    public ControlEstadoReserva(EstadoReserva vista, Home vistaPrincipal, ControlHome controlHome) {
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
                    String id = vista.getTID_EstadoReserva().getText().trim().toLowerCase();
                    String linea = construirLineaLocalizacion();

                    new ArchivoEstadoReserva().guardarOEditarPorID(linea, id);

                    JOptionPane.showMessageDialog(null, "✅ Estado de reserva guardado o actualizado correctamente.");
                    limpiarCamposConID();
                }
            }
        });
        
        vista.getPanel_Eliminar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                String id = vista.getTID_EstadoReserva().getText().trim().toLowerCase();

                if (id.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "⚠️ Debes ingresar un ID para eliminar el localizacion.");
                    return;
                }

                new ArchivoEstadoReserva().eliminarPorID(id);
                JOptionPane.showMessageDialog(null, "🗑 ️Estado de reserva eliminado (si existía).");
                limpiarCamposConID();
            }
        });
        
        vista.getTID_EstadoReserva().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String idTexto = vista.getTID_EstadoReserva().getText().trim().toLowerCase();

                if (idTexto.isEmpty()) {
                    limpiarCampos();
                    vista.getLabel_Estado().setText("Creando");
                    return;
                }

                SwingUtilities.invokeLater(() -> {
                    String linea = new ArchivoEstadoReserva().buscarPorID(idTexto);

                    if (linea != null) {
                        String[] partes = linea.split(";", -1);
                        if (partes.length >= 1) {
                            vista.getLabel_Estado().setText("Modificando");
                            try {
                                vista.getC_Estado().setSelectedIndex(Integer.parseInt(partes[1]));
                            } catch (NumberFormatException ex) {
                                vista.getC_Estado().setSelectedIndex(0);
                            }
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
        String id = vista.getTID_EstadoReserva().getText().trim();
        int estado = vista.getC_Estado().getSelectedIndex();

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ El campo ID del estado es obligatorio.");
            return false;
        }
        if (estado < 0) {
            JOptionPane.showMessageDialog(null, "⚠️ El campo estado es obligatorio.");
            return false;
        }
        
        return true;
    }
     
    private String construirLineaLocalizacion() {
        String id = vista.getTID_EstadoReserva().getText().trim();
        int estado = vista.getC_Estado().getSelectedIndex();

        return id + ";" + estado;
    }
    
    private void limpiarCampos() {
        vista.getC_Estado().setSelectedIndex(0);
    }
    
    private void limpiarCamposConID() {
        vista.getTID_EstadoReserva().setText("");
        vista.getC_Estado().setSelectedIndex(0);
    }
}
