package Controlers;

import Models.ArchivoUsuarios;
import View.Home;
import View.Mantenimientos;
import View.Usuario;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ControlUsuarios {
    private final Usuario vista;
    private final Home vistaPrincipal;
    private final ControlHome controlHome;
    private JPanel contenedor;
    private ControlMantenimientos controladorMantenimiento;
    
     public ControlUsuarios(Usuario vista, Home vistaPrincipal, ControlHome controlHome) {
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
                    String usuario = vista.getT_Usuario().getText().trim();
                    String linea = construirLineaUsuario();

                    new ArchivoUsuarios().guardarOEditarPorID(linea, usuario);

                    JOptionPane.showMessageDialog(null, "✅ Usuario guardado o actualizado correctamente.");
                    limpiarCamposConUsuario();
                }
            }
        });
        
        vista.getPanel_Eliminar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                String usuario = vista.getT_Usuario().getText().trim().toLowerCase();

                if (usuario.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "⚠️ Debes ingresar un usuario para eliminar.");
                    return;
                }

                new ArchivoUsuarios().eliminarPorUsuario(usuario);
                JOptionPane.showMessageDialog(null, "🗑️ Usuario eliminado (si existía).");
                limpiarCamposConUsuario();
            }
        });
        
        vista.getT_Usuario().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String usuarioTexto = vista.getT_Usuario().getText().trim();

                if (usuarioTexto.isEmpty()) {
                    limpiarCampos();
                    vista.getLabel_Estado().setText("Creando");
                    return;
                }

                SwingUtilities.invokeLater(() -> {
                    String linea = new ArchivoUsuarios().buscarPorUsuario(usuarioTexto);

                    if (linea != null) {
                        String[] partes = linea.split(";");
                        if (partes.length >= 5) {
                            vista.getLabel_Estado().setText("Modificando");
                            vista.getT_Contrasena().setText(partes[1]);
                            vista.getC_NivelAcceso().setSelectedIndex(Integer.parseInt(partes[2]));
                            vista.getT_Nombre().setText(partes[3]);
                            vista.getT_Apellidos().setText(partes[4]);
                            if (partes.length >= 6) {
                                vista.getT_Correo().setText(partes[5]);
                            } else {
                                vista.getT_Correo().setText("");
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
        String usuario = vista.getT_Usuario().getText().trim();
        String nombre = vista.getT_Nombre().getText().trim();
        String apellidos = vista.getT_Apellidos().getText().trim();
        String contrasena = new String(vista.getT_Contrasena().getPassword()).trim();
        int nivelAcceso = vista.getC_NivelAcceso().getSelectedIndex();

        if (usuario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ El campo usuario es obligatorio.");
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
        if (contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ El campo Contraseña es obligatorio.");
            return false;
        }
        if (contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ El campo Contraseña es obligatorio.");
            return false;
        }
        if (nivelAcceso < 0) {
            JOptionPane.showMessageDialog(null, "⚠️ Debes seleccionar un Nivel de Acceso válido.");
            return false;
        }
        
        return true;
    }
     
    private String construirLineaUsuario() {
        String usuario = vista.getT_Usuario().getText().trim().toLowerCase();
        String nombre = vista.getT_Nombre().getText().trim();
        String contrasena = new String(vista.getT_Contrasena().getPassword()).trim();
        int nivelAcceso = vista.getC_NivelAcceso().getSelectedIndex();
        String apellidos = vista.getT_Apellidos().getText().trim();
        String correo = vista.getT_Correo().getText().trim();

        return usuario + ";" + contrasena + ";" + nivelAcceso + ";" + nombre + ";" + apellidos + ";" + correo;
    }
    
    private void limpiarCampos() {
        vista.getT_Nombre().setText("");
        vista.getT_Contrasena().setText("");
        vista.getC_NivelAcceso().setSelectedIndex(0);
        vista.getT_Apellidos().setText("");
        vista.getT_Correo().setText("");
    }
    
    private void limpiarCamposConUsuario() {
        vista.getT_Usuario().setText("");
        vista.getT_Nombre().setText("");
        vista.getT_Contrasena().setText("");
        vista.getC_NivelAcceso().setSelectedIndex(0);
        vista.getT_Apellidos().setText("");
        vista.getT_Correo().setText("");
    }
    
}
