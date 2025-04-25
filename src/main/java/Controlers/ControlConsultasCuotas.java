package Controlers;

import Models.ArchivoClientes;
import Models.ArchivoCobro;
import Models.ArchivoEncabezadoCuota;
import View.Consultas;
import View.ConsultasCuota;
import View.Home;
import java.awt.BorderLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;

public class ControlConsultasCuotas {
    private final ConsultasCuota vista;
    private final Home vistaPrincipal;
    private final ControlHome controladorHome;
    private JPanel contenedor;
    
    public ControlConsultasCuotas(ConsultasCuota vista, Home vistaPrincipal, ControlHome controladorHome) {
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

                List<String> encabezados = new ArchivoEncabezadoCuota().leerTodo();
                List<String> cobros = new ArchivoCobro().leerTodo();
                List<String> clientes = new ArchivoClientes().leerTodo();

                Date fechaInicio = vista.getD_RangoInicio().getDate();
                Date fechaFin = vista.getD_RangoFin().getDate();

                for (String linea : encabezados) {
                    String[] partes = linea.split(";", -1);
                    if (partes.length >= 5) {
                        String idCuota = partes[0].trim();
                        String secuencia = partes[1].trim();
                        String concepto = partes[2].trim();
                        String valorStr = partes[3].trim();
                        String idCobro = partes[4].trim();

                        String idCliente = "";
                        String fechaCobroStr = "";

                        for (String cobro : cobros) {
                            String[] datosCobro = cobro.split(";", -1);
                            if (datosCobro.length >= 6 && datosCobro[0].trim().equals(idCobro)) {
                                fechaCobroStr = datosCobro[1].trim();
                                idCliente = datosCobro[2].trim();
                                break;
                            }
                        }

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
                            if (cli.length >= 3 && cli[0].trim().equals(idCliente)) {
                                nombreCliente = cli[1].trim() + " " + cli[2].trim();
                                break;
                            }
                        }

                        double montoTotal = 0.0;
                        for (String otra : encabezados) {
                            String[] p = otra.split(";", -1);
                            if (p.length >= 5 && p[0].trim().equals(idCuota)) {
                                try {
                                    montoTotal += Double.parseDouble(p[3].trim());
                                } catch (NumberFormatException ignored) {}
                            }
                        }

                        String campoFiltrado;
                        switch (filtroSeleccionado) {
                            case "ID Cuota":
                                campoFiltrado = idCuota;
                                break;
                            case "ID Cliente":
                                campoFiltrado = idCliente;
                                break;
                            case "Nombre del Cliente":
                                campoFiltrado = nombreCliente;
                                break;
                            case "Secuencia":
                                campoFiltrado = secuencia;
                                break;
                            case "Concepto":
                                campoFiltrado = concepto;
                                break;
                            case "Valor de Cobro":
                                campoFiltrado = "RD$ " + String.format(Locale.US, "%,.2f", Double.parseDouble(valorStr));
                                break;
                            case "Monto Total":
                                campoFiltrado = "RD$ " + String.format(Locale.US, "%,.2f", montoTotal);
                                break;
                            case "Fecha de Cobro":
                                campoFiltrado = fechaCobroStr;
                                break;
                            default:
                                campoFiltrado = "";
                        }

                        if (campoFiltrado.toLowerCase().contains(textoBusqueda)) {
                            modelo.addRow(new Object[]{
                                idCuota,
                                idCliente,
                                nombreCliente,
                                secuencia,
                                concepto,
                                "RD$ " + String.format(Locale.US, "%,.2f", Double.parseDouble(valorStr)),
                                "RD$ " + String.format(Locale.US, "%,.2f", montoTotal),
                                fechaCobroStr
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

        List<String> encabezados = new ArchivoEncabezadoCuota().leerTodo();
        List<String> clientes = new ArchivoClientes().leerTodo();

        Date fechaInicio = vista.getD_RangoInicio().getDate();
        Date fechaFin = vista.getD_RangoFin().getDate();

        for (String linea : encabezados) {
            String[] partes = linea.split(";", -1);
            if (partes.length >= 5) {
                String idCuota = partes[0].trim();
                String fechaCobroStr = partes[1].trim();
                String idCliente = partes[2].trim();
                String valorStr = partes[3].trim();
                String estatusStr = partes[4].trim();

                try {
                    Date fechaCobro = new SimpleDateFormat("dd/MM/yyyy").parse(fechaCobroStr);
                    if ((fechaInicio != null && fechaCobro.before(fechaInicio)) ||
                        (fechaFin != null && fechaCobro.after(fechaFin))) {
                        continue;
                    }
                } catch (ParseException e) {
                    System.out.println("❌ Error en fecha: " + fechaCobroStr);
                    continue;
                }

                String nombreCliente = "Desconocido";
                for (String c : clientes) {
                    String[] cli = c.split(";", -1);
                    if (cli.length >= 3 && cli[0].trim().equals(idCliente)) {
                        nombreCliente = cli[1].trim() + " " + cli[2].trim();
                        break;
                    }
                }

                double valor = 0.0;
                try {
                    valor = Double.parseDouble(valorStr.replace("RD$", "").replace(",", "").trim());
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ Valor inválido: " + valorStr);
                    continue;
                }

                boolean estado = estatusStr.equalsIgnoreCase("true");

                modelo.addRow(new Object[]{
                    idCuota,
                    idCliente,
                    nombreCliente,
                    "RD$ " + String.format(Locale.US, "%,.2f", valor),
                    fechaCobroStr,
                    estado
                });
            } else {
                System.out.println("❌ Línea inválida: " + linea);
            }
        }

        vista.getGRD().revalidate();
        vista.getGRD().repaint();
    }
}
