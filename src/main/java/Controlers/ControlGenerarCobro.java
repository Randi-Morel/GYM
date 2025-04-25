package Controlers;

import Models.ArchivoClientes;
import Models.ArchivoCobro;
import Models.FacturaData;
import Models.FacturaPDFGenerator;
import View.GenerarCobro;
import View.Home;
import View.Mantenimientos;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class ControlGenerarCobro {
    private final GenerarCobro vista;
    private final Home vistaPrincipal;
    private final ControlHome controlHome;
    private JPanel contenedor;
    private ControlMantenimientos controladorMantenimiento;
    
     public ControlGenerarCobro(GenerarCobro vista, Home vistaPrincipal, ControlHome controlHome) {
        this.vista = vista;
        this.vistaPrincipal = vistaPrincipal;
        this.controlHome = controlHome;
        iniciarEventos();
    }
     
    private void iniciarEventos() {
        vista.getPanel_Procesar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
             public void mouseClicked(java.awt.event.MouseEvent e) {
                if (validarCampos()) {
                    
                    int mes = vista.getD_Mes().getMonth();
                    int año = vista.getD_Ano().getYear();
                    
                    Calendar hoy = Calendar.getInstance();
                    int mesActual = hoy.get(Calendar.MONTH);
                    int añoActual = hoy.get(Calendar.YEAR);
                    
                    if (año > añoActual || (año == añoActual && mes > mesActual)) {
                        JOptionPane.showMessageDialog(null, "❌ No se pueden generar cobros para meses futuros.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    String fechaCobro = obtenerUltimoDiaDelMes(mes, año);

                    ArchivoCobro archivoCobro = new ArchivoCobro();
                    if (archivoCobro.existeCobroParaFecha(fechaCobro)) {
                        JOptionPane.showMessageDialog(null, "⚠️ Ya se han generado cobros para esta fecha: " + fechaCobro);
                        return;
                    }
                    
                    List<String> cobrosGenerados = construirCobros();

                    if (cobrosGenerados.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "⚠️ No hay clientes válidos para generar cobros.");
                        return;
                    }
                    
                    ArchivoClientes archivoClientes = new ArchivoClientes();
                    List<String> clientes = archivoClientes.leerTodo();
                    
                    List<FacturaData> datosFacturas = new java.util.ArrayList<>();
                    String conceptoGeneral = "";

                    for (String linea : cobrosGenerados) {
                        archivoCobro.guardarLineaNueva(linea);

                        String[] partes = linea.split(";", -1);
                        String idCobro = partes[0];
                        String fecha = partes[1];
                        String idCliente = partes[2];
                        String valor = partes[3];
                        String concepto = partes[4];

                        conceptoGeneral = concepto; // para el nombre del PDF

                        // Buscar datos del cliente
                        String nombre = "", correo = "", direccion = "";
                        for (String c : clientes) {
                            String[] pc = c.split(";", -1);
                            if (pc.length >= 10 && pc[0].trim().equals(idCliente)) {
                                nombre = pc[1].trim() + " " + pc[2].trim() + " " + pc[3].trim();
                                correo = pc[9].trim();
                                direccion = pc[8].trim();
                                break;
                            }
                        }

                        datosFacturas.add(new FacturaData(idCliente, nombre, correo, direccion, concepto, valor, fecha, idCobro));
                    }
                    
                    FacturaPDFGenerator.generarFacturaGlobal(datosFacturas, conceptoGeneral);

                    new ArchivoClientes().actualizarBalances(cobrosGenerados);

                    JOptionPane.showMessageDialog(null, "✅ Cobros generados correctamente.");
                }
            }
        });
        
        vista.getPanel_Salir().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                cerrarPanel();
            }
        });
    }
    
    private void cerrarPanel() {
        Mantenimientos panelMantenimientos = new Mantenimientos();
        new ControlMantenimientos(panelMantenimientos, vistaPrincipal, controlHome);

        JPanel contenedor = vistaPrincipal.getPanel_ControlPantallas();

        contenedor.removeAll();
        contenedor.setLayout(new BorderLayout()); // o el layout original del panel si ya tiene uno
        contenedor.add(panelMantenimientos, BorderLayout.CENTER);

        contenedor.revalidate();
        contenedor.repaint();
    }
     
    public boolean validarCampos() {
        int mes = vista.getD_Mes().getMonth();     
        int año = vista.getD_Ano().getYear();  

        if (mes < 0 || mes > 11) {
            JOptionPane.showMessageDialog(null, "⚠️ Debes seleccionar un mes válido.");
            return false;
        }

        if (año <= 0) {
            JOptionPane.showMessageDialog(null, "⚠️ Debes seleccionar un año válido.");
            return false;
        }
        
        return true;
    }
     
    private List<String> construirCobros() {
        List<String> cobros = new ArrayList<>();

        int mes = vista.getD_Mes().getMonth(); 
        int año = vista.getD_Ano().getYear();

        // Último día del mes
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.YEAR, año);
        calendario.set(Calendar.MONTH, mes);
        int ultimoDia = calendario.getActualMaximum(Calendar.DAY_OF_MONTH);
        calendario.set(Calendar.DAY_OF_MONTH, ultimoDia);

        String fechaCobro = new SimpleDateFormat("dd/MM/yyyy").format(calendario.getTime());
        String conceptoMes = "Cobro mes " + new SimpleDateFormat("MMMM yyyy", new Locale("es", "ES")).format(calendario.getTime());

        ArchivoClientes archivoClientes = new ArchivoClientes();
        List<String> lineas = archivoClientes.leerTodo();

        int idCobro = new ArchivoCobro().obtenerUltimoID() + 1;

        for (String linea : lineas) {
            String[] partes = linea.split(";", -1);
            if (partes.length >= 14) {
                String idCliente = partes[0].trim();
                String estado = partes[12].trim().toLowerCase();
                String tipo = partes[13].trim().toLowerCase();
                String valorCuota = partes[11].trim();

                if (estado.equals("activo") && tipo.equals("socio activo")) {
                    String lineaCobro = String.join(";", 
                        String.valueOf(idCobro),
                        fechaCobro,
                        idCliente,
                        valorCuota.isEmpty() ? "0.00" : valorCuota,
                        conceptoMes,
                        "false"
                    );
                    cobros.add(lineaCobro);
                    idCobro++;
                }
            }
        }

        return cobros;
    }
    
    private String obtenerUltimoDiaDelMes(int mes, int año) {
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.YEAR, año);
        calendario.set(Calendar.MONTH, mes);
        int ultimoDia = calendario.getActualMaximum(Calendar.DAY_OF_MONTH);
        calendario.set(Calendar.DAY_OF_MONTH, ultimoDia);

        return new SimpleDateFormat("dd/MM/yyyy").format(calendario.getTime());
    }
}
