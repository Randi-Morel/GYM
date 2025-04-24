package Controlers;

import Models.ArchivoActividades;
import Models.ArchivoEntrenadores;
import Models.ArchivoLocalizaciones;
import View.Consultas;
import View.ConsultasActividades;
import View.Home;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ControlConsultasActividades {
    private final ConsultasActividades vista;
    private final Home vistaPrincipal;
    private final ControlHome controladorHome;
    private JPanel contenedor;
    
    public ControlConsultasActividades(ConsultasActividades vista, Home vistaPrincipal, ControlHome controladorHome) {
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

                List<String> actividades = new ArchivoActividades().leerTodo();
                List<String> localizaciones = new ArchivoLocalizaciones().leerTodo();
                List<String> entrenadores = new ArchivoEntrenadores().leerTodo();

                for (String linea : actividades) {
                    String[] partes = linea.split(";", -1);
                    if (partes.length >= 5) {
                        String id = partes[0].trim();
                        String nombre = partes[1].trim();
                        String descripcion = partes[2].trim();
                        String idLocalizacion = partes[3].trim();
                        String idEntrenador = partes[4].trim();

                        String descLocalizacion = "";
                        for (String loc : localizaciones) {
                            String[] l = loc.split(";", -1);
                            if (l.length >= 2 && l[0].trim().equals(idLocalizacion)) {
                                descLocalizacion = l[1].trim();
                                break;
                            }
                        }

                        String nombreEntrenador = "";
                        for (String ent : entrenadores) {
                            String[] e = ent.split(";", -1);
                            if (e.length >= 3 && e[0].trim().equals(idEntrenador)) {
                                nombreEntrenador = e[1].trim() + " " + e[2].trim();
                                break;
                            }
                        }

                        String campoFiltrado;
                        switch (filtroSeleccionado) {
                            case "Nombre de Actividad":
                                campoFiltrado = nombre;
                                break;
                            case "Descripcion de Actividad":
                                campoFiltrado = descripcion;
                                break;
                            case "Localización":
                                campoFiltrado = descLocalizacion;
                                break;
                            case "Entrenador":
                                campoFiltrado = nombreEntrenador;
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
                                descLocalizacion,
                                nombreEntrenador
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
        llenarTablaActividades();
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
        llenarTablaActividades();
    }
    
    private void llenarTablaActividades() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getGRD().getModel();
        modelo.setRowCount(0);

        List<String> actividades = new ArchivoActividades().leerTodo();
        List<String> localizaciones = new ArchivoLocalizaciones().leerTodo();
        List<String> entrenadores = new ArchivoEntrenadores().leerTodo();

        for (String linea : actividades) {
            String[] partes = linea.split(";", -1);
            if (partes.length >= 5) {
                String id = partes[0].trim();
                String nombre = partes[1].trim();
                String descripcion = partes[2].trim();
                String idLocalizacion = partes[3].trim();
                String idEntrenador = partes[4].trim();

                String descLocalizacion = "";
                for (String loc : localizaciones) {
                    String[] l = loc.split(";", -1);
                    if (l.length >= 2 && l[0].trim().equals(idLocalizacion)) {
                        descLocalizacion = l[1].trim();
                        break;
                    }
                }

                String nombreEntrenador = "";
                for (String ent : entrenadores) {
                    String[] e = ent.split(";", -1);
                    if (e.length >= 3 && e[0].trim().equals(idEntrenador)) {
                        nombreEntrenador = e[1].trim() + " " + e[2].trim();
                        break;
                    }
                }

                modelo.addRow(new Object[] {
                    id,
                    nombre,
                    descripcion,
                    descLocalizacion,
                    nombreEntrenador
                });
            }
        }

        vista.getGRD().revalidate();
        vista.getGRD().repaint();
    }
}
