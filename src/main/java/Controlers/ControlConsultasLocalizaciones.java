package Controlers;

import Models.ArchivoLocalizaciones;
import View.Consultas;
import View.ConsultasLocalizaciones;
import View.Home;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ControlConsultasLocalizaciones {
    private final ConsultasLocalizaciones vista;
    private final Home vistaPrincipal;
    private final ControlHome controladorHome;
    private JPanel contenedor;
    
    public ControlConsultasLocalizaciones(ConsultasLocalizaciones vista, Home vistaPrincipal, ControlHome controladorHome) {
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

                List<String> localizaciones = new ArchivoLocalizaciones().leerTodo();

                for (String linea : localizaciones) {
                    String[] partes = linea.split(";", -1);
                    if (partes.length >= 2) {
                        String id = partes[0].trim();
                        String descripcion = partes[1].trim();

                        String campoFiltrado;
                        if (filtroSeleccionado.equals("Descripcion")) {
                            campoFiltrado = descripcion;
                        } else {
                            campoFiltrado = id;
                        }

                        if (campoFiltrado.toLowerCase().contains(textoBusqueda)) {
                            modelo.addRow(new Object[] {
                                id,
                                descripcion
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
        llenarTablaLocalizaciones();
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
        llenarTablaLocalizaciones();
    }
    
    private void llenarTablaLocalizaciones() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getGRD().getModel();
        modelo.setRowCount(0);

        ArchivoLocalizaciones archivo = new ArchivoLocalizaciones();
        List<String> localizaciones = archivo.leerTodo();

        for (String linea : localizaciones) {
            String[] partes = linea.split(";", -1);
            if (partes.length >= 2) {
                String id = partes[0].trim();
                String descripcion = partes[1].trim();

                modelo.addRow(new Object[] {
                    id,
                    descripcion
                });
            }
        }

        vista.getGRD().revalidate();
        vista.getGRD().repaint();
    }
}
