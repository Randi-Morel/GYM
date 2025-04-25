package Controlers;

import Models.ArchivoLocalizaciones;
import Models.ArchivoSalas;
import View.Consultas;
import View.ConsultasSalas;
import View.Home;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ControlConsultasSalas {
    private final ConsultasSalas vista;
    private final Home vistaPrincipal;
    private final ControlHome controladorHome;
    private JPanel contenedor;
    
    public ControlConsultasSalas(ConsultasSalas vista, Home vistaPrincipal, ControlHome controladorHome) {
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

                List<String> salas = new ArchivoSalas().leerTodo();
                List<String> localizaciones = new ArchivoLocalizaciones().leerTodo();

                for (String linea : salas) {
                    String[] partes = linea.split(";", -1);
                    if (partes.length >= 4) {
                        String id = partes[0].trim();
                        String nombre = partes[1].trim();
                        String descripcion = partes[2].trim();
                        String idLocalizacion = partes[3].trim();

                        String descLocalizacion = "";
                        for (String loc : localizaciones) {
                            String[] l = loc.split(";", -1);
                            if (l.length >= 2 && l[0].trim().equals(idLocalizacion)) {
                                descLocalizacion = l[1].trim();
                                break;
                            }
                        }

                        String campoFiltrado;
                        switch (filtroSeleccionado) {
                            case "Nombre de Sala":
                                campoFiltrado = nombre;
                                break;
                            case "Descripcion de Sala":
                                campoFiltrado = descripcion;
                                break;
                            case "Localización":
                                campoFiltrado = descLocalizacion;
                                break;
                            default: // ID
                                campoFiltrado = id;
                                break;
                        }

                        if (campoFiltrado.toLowerCase().contains(textoBusqueda)) {
                            modelo.addRow(new Object[] {
                                id,
                                nombre,
                                descripcion,
                                descLocalizacion
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
        llenarTablaSalas();
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
        llenarTablaSalas();
    }
    
    private void llenarTablaSalas() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getGRD().getModel();
        modelo.setRowCount(0);

        ArchivoSalas archivoSalas = new ArchivoSalas();
        ArchivoLocalizaciones archivoLoc = new ArchivoLocalizaciones();

        List<String> salas = archivoSalas.leerTodo();
        List<String> localizaciones = archivoLoc.leerTodo();

        for (String linea : salas) {
            String[] partes = linea.split(";", -1);
            if (partes.length >= 4) {
                String id = partes[0].trim();
                String nombre = partes[1].trim();
                String descripcion = partes[2].trim();
                String idLocalizacion = partes[3].trim();

                String descLocalizacion = "";
                for (String loc : localizaciones) {
                    String[] l = loc.split(";", -1);
                    if (l.length >= 2 && l[0].trim().equals(idLocalizacion)) {
                        descLocalizacion = l[1].trim();
                        break;
                    }
                }

                modelo.addRow(new Object[] {
                    id,
                    nombre,
                    descripcion,
                    descLocalizacion
                });
            }
        }

        vista.getGRD().revalidate();
        vista.getGRD().repaint();
    }
}
