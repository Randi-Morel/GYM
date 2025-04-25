package Controlers;

import Models.ArchivoEntrenadores;
import View.Consultas;
import View.ConsultasEntrenadores;
import View.Home;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ControlConsultasEntrenadores {
    private final ConsultasEntrenadores vista;
    private final Home vistaPrincipal;
    private final ControlHome controladorHome;
    private JPanel contenedor;
    
    public ControlConsultasEntrenadores(ConsultasEntrenadores vista, Home vistaPrincipal, ControlHome controladorHome) {
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

                List<String> entrenadores = new ArchivoEntrenadores().leerTodo();

                for (String linea : entrenadores) {
                    String[] partes = linea.split(";", -1);
                    if (partes.length >= 3) {
                        String id = partes[0].trim();
                        String nombre = partes[1].trim();
                        String apellido = partes[2].trim();
                        String telefono = (partes.length >= 4) ? partes[3].trim() : "";
                        String correo = (partes.length >= 5) ? partes[4].trim() : "";

                        String campoFiltrado;
                        if (filtroSeleccionado.equals("Nombre")) {
                            campoFiltrado = nombre;
                        } else if (filtroSeleccionado.equals("Apellido")) {
                            campoFiltrado = apellido;
                        } else if (filtroSeleccionado.equals("Telefono")) {
                            campoFiltrado = telefono;
                        } else if (filtroSeleccionado.equals("Correo")) {
                        campoFiltrado = correo;
                        } else {
                            campoFiltrado = id;
                        }

                        if (campoFiltrado.toLowerCase().contains(textoBusqueda)) {
                            modelo.addRow(new Object[] {
                                id,
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
        llenarTablaEntrenadores();
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
        llenarTablaEntrenadores();
    }
    
    private void llenarTablaEntrenadores() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getGRD().getModel();
        modelo.setRowCount(0);

        ArchivoEntrenadores archivo = new ArchivoEntrenadores();
        List<String> entrenadores = archivo.leerTodo();

        for (String linea : entrenadores) {
            String[] partes = linea.split(";", -1);
            if (partes.length >= 3) {
                String id = partes[0].trim();
                String nombre = partes[1].trim();
                String apellido = partes[2].trim();
                String telefono = (partes.length >= 4) ? partes[3].trim() : "";
                String correo = (partes.length >= 5) ? partes[4].trim() : "";

                modelo.addRow(new Object[] {
                    id,
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
