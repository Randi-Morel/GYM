package Controlers;

import View.Login;
import Models.ArchivoUsuarios;
import View.Home;
import javax.swing.JOptionPane;


public class ControlLogin {
    public static void main(String[] args) {
        Login login = new Login();
        try {
            login.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         
        login.getT_Usuario().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if ("Ingrese el nombre de usuario".equals(login.getT_Usuario().getText())) {
                    login.getT_Usuario().setText("");
                }
            }
        });
         
        login.getTP_Contrasena().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Obtener el contenido del JPasswordField como String
                char[] password = login.getTP_Contrasena().getPassword();
                String passwordText = new String(password);

                if ("S1S2S3S4".equals(passwordText)) {
                    login.getTP_Contrasena().setText("");
                }
            }
        });
        
        login.getLabel_IniciarSesion().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String usuario = login.getT_Usuario().getText();
                String contrasena = new String(login.getTP_Contrasena().getPassword());
                String lineaEncontrada = null;
                
                ArchivoUsuarios archivo = new ArchivoUsuarios();
                boolean encontrado = false;

                for (String linea : archivo.leerTodo()) {
                    System.out.println("Leyendo línea: " + linea); // debug

                    String[] partes = linea.split(";");
                    if (partes.length >= 3 &&
                        partes[1].trim().equalsIgnoreCase(usuario) &&
                        partes[2].trim().equals(contrasena)) {
                        lineaEncontrada = linea;
                        encontrado = true;
                        break;
                    }
                }

                if (encontrado) {
                    String[] partes = lineaEncontrada.split(";");
                    int nivelAcceso = Integer.parseInt(partes[3].trim());
                    
                    Home home = new Home();
                    new ControlHome(home, nivelAcceso);

                    home.setVisible(true);
                    home.setLocationRelativeTo(null);
                    //home.setExtendedState(home.MAXIMIZED_BOTH);
                    
                    login.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                }
            }
        });
        
        login.getLabel_Salir().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas salir de la aplicación?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }
}
