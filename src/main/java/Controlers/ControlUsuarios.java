package Controlers;

import Models.ArchivoUsuarios;
import View.Usuario;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ControlUsuarios {
    private final Usuario vista;
    
     public ControlUsuarios(Usuario vista) {
        this.vista = vista;
        
        vista.getBtnGuardar().addActionListener(e -> {
            if (validarCampos()) {
                int id = Integer.parseInt(vista.getTID_Usuario().getText().trim());
                String linea = construirLineaUsuario();

                new ArchivoUsuarios().guardarOEditarPorID(linea, id);

                JOptionPane.showMessageDialog(null, "✅ Usuario guardado o actualizado correctamente.");
            }
        });
        
        vista.getBtnEliminar().addActionListener(e -> {
            String idTexto = vista.getTID_Usuario().getText().trim();

            if (idTexto.isEmpty()) {
                JOptionPane.showMessageDialog(null, "⚠️ Debes ingresar un ID para eliminar el usuario.");
                return;
            }

            if (!idTexto.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "❌ El ID debe ser un número entero.");
                return;
            }

            int id = Integer.parseInt(idTexto);
            new ArchivoUsuarios().eliminarPorID(id);
            JOptionPane.showMessageDialog(null, "🗑️ Usuario eliminado (si existía).");
            limpiarCampos();
        });
        
        vista.getTID_Usuario().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String idTexto = vista.getTID_Usuario().getText().trim();

                if (idTexto.isEmpty()) {
                    // Opcional
                    limpiarCampos();
                    return;
                }

                if (!idTexto.matches("\\d+")) {
                    return;
                }

                int id = Integer.parseInt(idTexto);
                String linea = new Models.ArchivoUsuarios().buscarPorID(id);

                if (linea != null) {
                    String[] partes = linea.split(";");
                    if (partes.length >= 6) {
                        vista.getT_Nombre().setText(partes[1]);
                        vista.getT_Contrasena().setText(partes[2]);
                        vista.getT_NivelAcceso().setText(partes[3]);
                        vista.getT_Apellidos().setText(partes[4]);
                        vista.getT_Correo().setText(partes[5]);
                    }
                } else {
                    limpiarCampos();
                }
            }
        });
        
        vista.getBtnSalir().addActionListener(e -> {
            java.awt.Container contenedor = vista.getParent();
            if (contenedor instanceof JPanel) {
                contenedor.remove(vista);
                contenedor.revalidate();
                contenedor.repaint();
            }
        });
    }
     
     public boolean validarCampos() {
        String id = vista.getTID_Usuario().getText().trim();
        String nombre = vista.getT_Nombre().getText().trim();
        String apellidos = vista.getT_Apellidos().getText().trim();
        String contrasena = new String(vista.getT_Contrasena().getPassword()).trim();
        String nivelAcceso = vista.getT_NivelAcceso().getText().trim();

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ El campo ID de usuario es obligatorio.");
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
        if (nivelAcceso.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ El campo Nivel de Acceso es obligatorio.");
            return false;
        }

        if (!id.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "❌ El campo ID solo debe contener números.");
            return false;
        }
        if (!nivelAcceso.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "❌ El campo Nivel de Acceso solo debe contener números.");
            return false;
        }
        return true;
    }
     
    private String construirLineaUsuario() {
        String id = vista.getTID_Usuario().getText().trim();
        String nombre = vista.getT_Nombre().getText().trim();
        String contrasena = new String(vista.getT_Contrasena().getPassword()).trim();
        String nivelAcceso = vista.getT_NivelAcceso().getText().trim();
        String apellidos = vista.getT_Apellidos().getText().trim();
        String correo = vista.getT_Correo().getText().trim();

        return id + ";" + nombre + ";" + contrasena + ";" + nivelAcceso + ";" + apellidos + ";" + correo;
    }
    
    private void limpiarCampos() {
        vista.getT_Nombre().setText("");
        vista.getT_Contrasena().setText("");
        vista.getT_NivelAcceso().setText("");
        vista.getT_Apellidos().setText("");
        vista.getT_Correo().setText("");
    }
    
}
