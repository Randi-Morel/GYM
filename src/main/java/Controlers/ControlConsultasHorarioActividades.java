package Controlers;

import Models.ArchivoActividades;
import Models.ArchivoHorarioActividades;
import View.Consultas;
import View.ConsultasHorarioActividades;
import View.Home;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ControlConsultasHorarioActividades {
    private final ConsultasHorarioActividades vista;
    private final Home vistaPrincipal;
    private final ControlHome controladorHome;
    private JPanel contenedor;
    
    public ControlConsultasHorarioActividades(ConsultasHorarioActividades vista, Home vistaPrincipal, ControlHome controladorHome) {
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

                List<String> horarios = new ArchivoHorarioActividades().leerTodo();
                List<String> actividades = new ArchivoActividades().leerTodo();

                for (String linea : horarios) {
                    String[] partes = linea.split(";", -1);
                    if (partes.length >= 4) {
                        String id = partes[0].trim();
                        String idDia = partes[1].trim();
                        String hora = partes[2].trim();
                        String idActividad = partes[3].trim();

                        String diaTexto;
                        switch (idDia) {
                            case "1":
                                diaTexto = "Lunes";
                                break;
                            case "2":
                                diaTexto = "Martes";
                                break;
                            case "3":
                                diaTexto = "Miércoles";
                                break;
                            case "4":
                                diaTexto = "Jueves";
                                break;
                            case "5":
                                diaTexto = "Viernes";
                                break;
                            case "6":
                                diaTexto = "Sábado";
                                break;
                            default:
                                diaTexto = "Desconocido";
                                break;
                        }

                        String nombreActividad = "";
                        for (String act : actividades) {
                            String[] a = act.split(";", -1);
                            if (a.length >= 2 && a[0].trim().equals(idActividad)) {
                                nombreActividad = a[1].trim();
                                break;
                            }
                        }

                        String campoFiltrado;
                        switch (filtroSeleccionado) {
                            case "Día":
                                campoFiltrado = diaTexto;
                                break;
                            case "Hora":
                                campoFiltrado = hora;
                                break;
                            case "Actividad":
                                campoFiltrado = nombreActividad;
                                break;
                            default: // ID
                                campoFiltrado = id;
                                break;
                        }

                        if (campoFiltrado.toLowerCase().contains(textoBusqueda)) {
                            modelo.addRow(new Object[] {
                                id,
                                diaTexto,
                                hora,
                                nombreActividad
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

        List<String> horarios = new ArchivoHorarioActividades().leerTodo();
        List<String> actividades = new ArchivoActividades().leerTodo();

        for (String linea : horarios) {
            String[] partes = linea.split(";", -1);
            if (partes.length >= 4) {
                String id = partes[0].trim();
                String idDia = partes[1].trim();
                String hora = partes[2].trim();
                String idActividad = partes[3].trim();

                String diaTexto;
                switch (idDia) {
                    case "1":
                        diaTexto = "Lunes";
                        break;
                    case "2":
                        diaTexto = "Martes";
                        break;
                    case "3":
                        diaTexto = "Miércoles";
                        break;
                    case "4":
                        diaTexto = "Jueves";
                        break;
                    case "5":
                        diaTexto = "Viernes";
                        break;
                    case "6":
                        diaTexto = "Sábado";
                        break;
                    default:
                        diaTexto = "Desconocido";
                        break;
                }

                String nombreActividad = "";
                for (String act : actividades) {
                    String[] a = act.split(";", -1);
                    if (a.length >= 2 && a[0].trim().equals(idActividad)) {
                        nombreActividad = a[1].trim();
                        break;
                    }
                }

                modelo.addRow(new Object[] {
                    id,
                    diaTexto,
                    hora,
                    nombreActividad
                });
            }
        }

        vista.getGRD().revalidate();
        vista.getGRD().repaint();
    }
}
