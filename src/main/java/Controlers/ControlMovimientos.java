package Controlers;

import Models.ArchivoClientes;
import Models.ArchivoCobro;
import Models.ArchivoDetalleCuota;
import Models.ArchivoEncabezadoCuota;
import View.Home;
import View.Movimientos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Set;

public class ControlMovimientos {
    private final Movimientos vista;
    private final Home vistaPrincipal;
    private final ControlHome controladorHome;
    private JPanel contenedor;
    
    public ControlMovimientos(Movimientos vista, Home vistaPrincipal, ControlHome controladorHome) {
        this.vista = vista;
        this.vistaPrincipal = vistaPrincipal;
        this.controladorHome = controladorHome;
        iniciarEventos();
        establecerValoresPorDefecto();
    }
     
    private void iniciarEventos() {
        vista.getPanel_Guardar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (validarCampos()) {
                    String id = vista.getTID_Cuota().getText().trim();
                    String linea = construirLineaCuota();

                    new ArchivoEncabezadoCuota().guardarOEditarPorID(linea, id);
                    
                    new ArchivoDetalleCuota().actualizarDetalleCuota(
                        (DefaultTableModel) vista.getGRD().getModel(),
                        id
                    );
                    
                    JOptionPane.showMessageDialog(null, "✅ Reserva guardado o actualizado correctamente.");
                    limpiarCamposConID();
                    
                    DefaultTableModel modelo = (DefaultTableModel) vista.getGRD().getModel();
                    modelo.setRowCount(0);
                }
            }
        });
        
        vista.getTID_Cuota().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String idCuota = vista.getTID_Cuota().getText().trim();

                if (idCuota.isEmpty()) {
                    vista.getLabel_Estado().setText("Creando");
                    return;
                }

                SwingUtilities.invokeLater(() -> {
                    String lineaCuota = new ArchivoEncabezadoCuota().buscarPorID(idCuota);

                    if (lineaCuota != null) {
                        String[] partes = lineaCuota.split(";", -1);
                        if (partes.length >= 5) {
                            vista.getLabel_Estado().setText("Modificando");

                            try {
                                Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(partes[1]);
                                vista.getD_FechaCuota().setDate(fecha);
                            } catch (ParseException e) {
                                vista.getD_FechaCuota().setDate(null);
                            }

                            // ID Cliente
                            String idCliente = partes[2];
                            vista.getTID_Cliente().setText(idCliente);

                            vista.getT_ValorCobro().setText(partes[3]);

                            cargarDatosCliente(idCliente);
                            llenarTablaCuotaConCobros();
                        }
                    } else {
                        vista.getLabel_Estado().setText("Creando");
                    }
                });
            }
        });
        
        vista.getTID_Cliente().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String idCliente = vista.getTID_Cliente().getText().trim();

                if (idCliente.isEmpty()) {
                    vista.getT_ClienteNombre().setText("");
                    vista.getT_ClienteApellido().setText("");
                    
                    DefaultTableModel modelo = (DefaultTableModel) vista.getGRD().getModel();
                    modelo.setRowCount(0);
                    
                    return;
                }

                SwingUtilities.invokeLater(() -> {
                    cargarDatosCliente(idCliente);
                    llenarTablaCuotaConCobros();
                });
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
        int nuevoID = new ArchivoEncabezadoCuota().obtenerProximoID();
        
        vista.getTID_Cuota().setText(String.valueOf(nuevoID));
        vista.getTID_Cliente().setText("");
        vista.getT_ClienteNombre().setText("");
        vista.getT_ClienteApellido().setText("");
        vista.getT_ValorCobro().setText("RD$0.00");

        vista.getD_FechaCuota().setDate(new java.util.Date());

        vista.getLabel_Estado().setText("Creando");
    }
    
    private void cargarDatosCliente(String idCliente) {
        String lineaCliente = new ArchivoClientes().buscarPorID(idCliente);
        if (lineaCliente != null) {
            String[] datos = lineaCliente.split(";", -1);
            if (datos.length >= 4) {
                vista.getT_ClienteNombre().setText(datos[1]);
                vista.getT_ClienteApellido().setText(datos[2] + " " + datos[3]);
            }
        }

        boolean existeCobro = new ArchivoCobro().existeCobroConCliente(idCliente);
        if (!existeCobro) {
            JOptionPane.showMessageDialog(null, "🔴 No se encontró un cobro para este cliente.");
        }
    }
     
    private void cerrarPanel() {
        JPanel contenedor = vistaPrincipal.getPanel_ControlPantallas();

        contenedor.removeAll();
        contenedor.setLayout(controladorHome.getLayoutOriginal());
        contenedor.add(controladorHome.getImagenOriginal());

        contenedor.revalidate();
        contenedor.repaint();
    }
     
    public boolean validarCampos() {
        String idCuota = vista.getTID_Cuota().getText().trim();
        String idCliente = vista.getTID_Cliente().getText().trim();

        if (idCuota.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ El campo ID de la cuota es obligatorio.");
            return false;
        }
        
        if (idCliente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ El campo ID del cliente es obligatorio.");
            return false;
        }

        return true;
    }
     
    private String construirLineaCuota() {
        String idCuota = vista.getTID_Cuota().getText().trim();

        String fechaCuota = "";
        if (vista.getD_FechaCuota().getDate() != null) {
            fechaCuota = new SimpleDateFormat("dd/MM/yyyy").format(vista.getD_FechaCuota().getDate());
        }

        String idCliente = vista.getTID_Cliente().getText().trim();

        String valorTexto = vista.getT_ValorCobro().getText().replace("RD$", "").replace(",", "").trim();
        double valorNumerico = Double.parseDouble(valorTexto);
        String valorCobro = String.format(Locale.US, "%.2f", valorNumerico);

        String estado = "false";
        
        return String.join(";", idCuota, fechaCuota, idCliente, valorCobro, estado);
    }
    
    private void limpiarCamposConID() {
        vista.getTID_Cuota().setText("");
        vista.getTID_Cliente().setText("");
        vista.getT_ClienteNombre().setText("");
        vista.getT_ClienteApellido().setText("");
        vista.getT_ValorCobro().setText("RD$0.00");
        vista.getD_FechaCuota().setDate(new java.util.Date());
    }
    
    private void llenarTablaCuotaConCobros() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getGRD().getModel();
        modelo.setRowCount(0);

        String idCuota = vista.getTID_Cuota().getText().trim();
        String idCliente = vista.getTID_Cliente().getText().trim();
        int secuencia = 1;
        
        Set<String> cobrosYaGuardados = new ArchivoDetalleCuota().obtenerCobrosDeDetalle(idCuota);

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/Models/cobro.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);
                if (partes.length >= 5 && partes[2].trim().equals(idCliente)) {
                    String idCobro = partes[0];
                    String valor = partes[3];
                    String concepto = partes[4];

                    boolean estaSeleccionado = cobrosYaGuardados.contains(idCobro);
                    
                    modelo.addRow(new Object[] {
                        idCuota,
                        secuencia++,
                        concepto,
                        valor,
                        idCobro,
                        estaSeleccionado
                    });
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error al leer cobros: " + e.getMessage());
        }
        vista.getGRD().revalidate();
        vista.getGRD().repaint();
        
        DefaultTableCellRenderer derechaRenderer = new DefaultTableCellRenderer();
        derechaRenderer.setHorizontalAlignment(SwingConstants.RIGHT);

        vista.getGRD().getColumnModel().getColumn(0).setCellRenderer(derechaRenderer); // ID Cuota
        vista.getGRD().getColumnModel().getColumn(1).setCellRenderer(derechaRenderer); // Secuencia
        vista.getGRD().getColumnModel().getColumn(3).setCellRenderer(derechaRenderer); // Valor
        vista.getGRD().getColumnModel().getColumn(4).setCellRenderer(derechaRenderer); // ID Cobro
        
        modelo.addTableModelListener(e -> {
            if (e.getColumn() == 5) {
                sumarCobrosSeleccionados();
            }
        });
    }
    
    private void sumarCobrosSeleccionados() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getGRD().getModel();
        double total = 0.0;

        for (int i = 0; i < modelo.getRowCount(); i++) {
            Boolean seleccionado = (Boolean) modelo.getValueAt(i, 5);
            if (seleccionado != null && seleccionado) {
                String valorTexto = modelo.getValueAt(i, 3).toString().replace(",", "").trim(); // Columna "Valor"
                try {
                    double valor = Double.parseDouble(valorTexto);
                    total += valor;
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ Valor inválido en fila " + i + ": " + valorTexto);
                }
            }
        }

        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("es", "DO"));
        vista.getT_ValorCobro().setText(formato.format(total));
    }
}
