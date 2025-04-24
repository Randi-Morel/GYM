package Controlers;

import Models.ArchivoUsuarios;
import View.Consultas;
import View.ConsultasUsuarios;
import View.Home;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ControlConsultasUsuarios {
    private final ConsultasUsuarios vista;
    private final Home vistaPrincipal;
    private final ControlHome controladorHome;
    private JPanel contenedor;
    
    public ControlConsultasUsuarios(ConsultasUsuarios vista, Home vistaPrincipal, ControlHome controladorHome) {
        this.vista = vista;
        this.vistaPrincipal = vistaPrincipal;
        this.controladorHome = controladorHome;
        iniciarEventos();
        establecerValoresPorDefecto();
    }
     
    private void iniciarEventos() {
        vista.getLabel_Limpiar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarCampos();
            }
        });

        vista.getPanel_Limpiar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarCampos();
            }
        });
        
        vista.getT_Buscar().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String textoBusqueda = vista.getT_Buscar().getText().trim().toLowerCase();
                String filtroSeleccionado = vista.getC_Filtro().getSelectedItem().toString();

                DefaultTableModel modelo = (DefaultTableModel) vista.getGRD().getModel();
                modelo.setRowCount(0);

                List<String> usuarios = new ArchivoUsuarios().leerTodo();

                for (String linea : usuarios) {
                    String[] partes = linea.split(";", -1);
                    if (partes.length >= 6) {
                        String usuario = partes[0].trim();
                        String nombre = partes[3].trim();
                        String apellido = partes[4].trim();
                        String correo = (partes.length >= 6) ? partes[5].trim() : "";

                        String campoFiltrado;
                        if (filtroSeleccionado.equals("Nombre")) {
                            campoFiltrado = nombre;
                        } else if (filtroSeleccionado.equals("Apellido")) {
                            campoFiltrado = apellido;
                        } else if (filtroSeleccionado.equals("Correo")) {
                            campoFiltrado = correo;
                        } else {
                            campoFiltrado = usuario;
                        }

                        if (campoFiltrado.toLowerCase().contains(textoBusqueda)) {
                            modelo.addRow(new Object[] {
                                usuario,
                                nombre,
                                apellido,
                                correo
                            });
                        }
                    }
                }

                vista.getGRD().revalidate();
                vista.getGRD().repaint();
            }
        });
        
        vista.getPanel_Salir().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                cerrarPanel();
            }
        });
    }
    
    private void establecerValoresPorDefecto() {
        llenarTablaUsuarios();
    }
    
    private void cerrarPanel() {
        Consultas panelConsultas = new Consultas();
        new ControlConsultas(panelConsultas, vistaPrincipal, controladorHome);

        JPanel contenedor = vistaPrincipal.getPanel_ControlPantallas();

        contenedor.removeAll();
        contenedor.setLayout(new BorderLayout());
        contenedor.add(panelConsultas, BorderLayout.CENTER);

        contenedor.revalidate();
        contenedor.repaint();
    }
     
    private void limpiarCampos() {
        vista.getT_Buscar().setText("");
        llenarTablaUsuarios();
    }
    
    private void llenarTablaUsuarios() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getGRD().getModel();
        modelo.setRowCount(0);

        ArchivoUsuarios archivo = new ArchivoUsuarios();
        List<String> usuarios = archivo.leerTodo();

        for (String linea : usuarios) {
            String[] partes = linea.split(";", -1);
            if (partes.length >= 6) {
                String usuario = partes[0].trim();
                String nombre = partes[3].trim();
                String apellido = partes[4].trim();
                String correo = (partes.length >= 6) ? partes[5].trim() : "";

                modelo.addRow(new Object[] {
                    usuario,
                    nombre,
                    apellido,
                    correo
                });
            }
        }

        vista.getGRD().revalidate();
        vista.getGRD().repaint();
    }
}
