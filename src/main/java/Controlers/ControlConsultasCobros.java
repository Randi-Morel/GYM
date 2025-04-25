package Controlers;

import Models.ArchivoClientes;
import Models.ArchivoCobro;
import View.Consultas;
import View.ConsultasCobro;
import View.Home;
import java.awt.BorderLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;

public class ControlConsultasCobros {
    private final ConsultasCobro vista;
    private final Home vistaPrincipal;
    private final ControlHome controladorHome;
    private JPanel contenedor;
    
    public ControlConsultasCobros(ConsultasCobro vista, Home vistaPrincipal, ControlHome controladorHome) {
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
        
        vista.getD_RangoInicio().getDateEditor().addPropertyChangeListener(evt -> {
            if ("date".equals(evt.getPropertyName())) {
                Date inicio = vista.getD_RangoInicio().getDate();
                Date fin = vista.getD_RangoFin().getDate();

                if (inicio != null && fin != null && inicio.after(fin)) {
                    JOptionPane.showMessageDialog(null, "La fecha de inicio no puede ser mayor que la fecha de fin.");
                    vista.getD_RangoInicio().setDate(null);
                }
                llenarTablaConsultasCobro();
            }
        });

        vista.getD_RangoFin().getDateEditor().addPropertyChangeListener(evt -> {
            if ("date".equals(evt.getPropertyName())) {
                Date inicio = vista.getD_RangoInicio().getDate();
                Date fin = vista.getD_RangoFin().getDate();

                if (inicio != null && fin != null && fin.before(inicio)) {
                    JOptionPane.showMessageDialog(null, "La fecha de fin no puede ser menor que la fecha de inicio.");
                    vista.getD_RangoFin().setDate(null);
                }
                llenarTablaConsultasCobro();
            }
        });
        
        vista.getT_Buscar().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String textoBusqueda = vista.getT_Buscar().getText().trim().toLowerCase();
                String filtroSeleccionado = vista.getC_Filtro().getSelectedItem().toString();

                DefaultTableModel modelo = (DefaultTableModel) vista.getGRD().getModel();
                modelo.setRowCount(0);

                List<String> cobros = new ArchivoCobro().leerTodo();
                List<String> clientes = new ArchivoClientes().leerTodo();

                Date fechaInicio = vista.getD_RangoInicio().getDate();
                Date fechaFin = vista.getD_RangoFin().getDate();

                for (String linea : cobros) {
                    String[] partes = linea.split(";", -1);
                    if (partes.length >= 6) {
                        String idCobro = partes[0].trim();
                        String fechaCobroStr = partes[1].trim();
                        String idCliente = partes[2].trim();
                        String valor = partes[3].trim();
                        String concepto = partes[4].trim();
                        String estatus = partes[5].trim();

                        try {
                            Date fechaCobro = new SimpleDateFormat("dd/MM/yyyy").parse(fechaCobroStr);
                            if ((fechaInicio != null && fechaCobro.before(fechaInicio)) || 
                                (fechaFin != null && fechaCobro.after(fechaFin))) {
                                continue;
                            }
                        } catch (ParseException e) {
                            continue;
                        }

                        String nombreCliente = "Desconocido";
                        for (String c : clientes) {
                            String[] cli = c.split(";", -1);
                            if (cli.length >= 2 && cli[0].trim().equals(idCliente)) {
                                nombreCliente = cli[1].trim() + " " + cli[2].trim();
                                break;
                            }
                        }

                        String campoFiltrado;
                        switch (filtroSeleccionado) {
                            case "Cliente":
                                campoFiltrado = nombreCliente;
                                break;
                            case "Valor de Cobro":
                                campoFiltrado = valor;
                                break;
                            case "Concepto":
                                campoFiltrado = concepto;
                                break;
                            case "Estado":
                                campoFiltrado = estatus;
                                break;
                            default:
                                campoFiltrado = idCobro;
                                break;
                        }

                        if (campoFiltrado.toLowerCase().contains(textoBusqueda)) {
                            modelo.addRow(new Object[] {
                                idCobro,
                                fechaCobroStr,
                                nombreCliente,
                                valor,
                                concepto,
                                estatus
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
        llenarTablaConsultasCobro();
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
        vista.getD_RangoInicio().setDate(null);
        vista.getD_RangoFin().setDate(null);
        llenarTablaConsultasCobro();
    }
    
    private void llenarTablaConsultasCobro() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getGRD().getModel();
        modelo.setRowCount(0);

        List<String> cobros = new ArchivoCobro().leerTodo();
        List<String> clientes = new ArchivoClientes().leerTodo();

        Date fechaInicio = vista.getD_RangoInicio().getDate();
        Date fechaFin = vista.getD_RangoFin().getDate();

        for (String linea : cobros) {
            String[] partes = linea.split(";", -1);
            if (partes.length >= 6) {
                String idCobro = partes[0].trim();
                String fechaCobroStr = partes[1].trim();
                String idCliente = partes[2].trim();
                String valor = partes[3].trim();
                String concepto = partes[4].trim();
                String estatus = partes[5].trim();

                try {
                    Date fechaCobro = new SimpleDateFormat("dd/MM/yyyy").parse(fechaCobroStr);
                    if ((fechaInicio != null && fechaCobro.before(fechaInicio)) || 
                        (fechaFin != null && fechaCobro.after(fechaFin))) {
                        continue;
                    }
                } catch (ParseException e) {
                    continue;
                }

                String nombreCliente = "Desconocido";
                for (String c : clientes) {
                    String[] cli = c.split(";", -1);
                    if (cli.length >= 2 && cli[0].trim().equals(idCliente)) {
                        nombreCliente = cli[1].trim() + " " + cli[2].trim();
                        break;
                    }
                }

                modelo.addRow(new Object[] {
                    idCobro,
                    fechaCobroStr,
                    nombreCliente,
                    valor,
                    concepto,
                    estatus
                });
            }
        }

        vista.getGRD().revalidate();
        vista.getGRD().repaint();
    }
}
