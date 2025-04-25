package Controlers;

import View.Login;
import Models.ArchivoUsuarios;
import View.Home;
import javax.swing.JOptionPane;


public class ControlLogin {
    private final Login login;
    
    public ControlLogin(Login login) {
        this.login = login;
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        iniciarEventos();
    }
    
    public static void main(String[] args) {
        new ControlLogin(new Login());
    }
    
    private void iniciarEventos() {
        login.getT_Usuario().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    login.getTP_Contrasena().requestFocus();
                }
            }
        });

        login.getTP_Contrasena().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    login.getLabel_IniciarSesion().dispatchEvent(
                        new java.awt.event.MouseEvent(
                            login.getLabel_IniciarSesion(),
                            java.awt.event.MouseEvent.MOUSE_CLICKED,
                            System.currentTimeMillis(),
                            0, 0, 0, 1, false
                        )
                    );
                }
            }
        });

        login.getLabel_IniciarSesion().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String usuario = login.getT_Usuario().getText().toLowerCase();
                String contrasena = new String(login.getTP_Contrasena().getPassword());
                String lineaEncontrada = null;

                ArchivoUsuarios archivo = new ArchivoUsuarios();
                boolean encontrado = false;

                for (String linea : archivo.leerTodo()) {
                    System.out.println("Leyendo línea: " + linea);

                    String[] partes = linea.split(";");
                    if (partes.length >= 3 &&
                        partes[0].trim().equalsIgnoreCase(usuario) &&
                        partes[1].trim().equals(contrasena)) {
                        lineaEncontrada = linea;
                        encontrado = true;
                        break;
                    }
                }

                if (encontrado) {
                    String[] partes = lineaEncontrada.split(";");
                    int nivelAcceso = Integer.parseInt(partes[2].trim());

                    Home home = new Home();
                    new ControlHome(home, nivelAcceso);

                    home.setVisible(true);
                    home.setLocationRelativeTo(null);
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
