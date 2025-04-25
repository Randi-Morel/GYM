package Controlers;

import Models.ArchivoClientes;
import Models.ArchivoCobro;
import Models.ArchivoEncabezadoCuota;
import View.ActualizarCuotas;
import View.Home;
import View.Mantenimientos;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ControlActualizarCuota {
    private final ActualizarCuotas vista;
    private final Home vistaPrincipal;
    private final ControlHome controlHome;
    private JPanel contenedor;
    private ControlMantenimientos controladorMantenimiento;
    
     public ControlActualizarCuota(ActualizarCuotas vista, Home vistaPrincipal, ControlHome controlHome) {
        this.vista = vista;
        this.vistaPrincipal = vistaPrincipal;
        this.controlHome = controlHome;
        iniciarEventos();
        establecerValoresPorDefecto();
    }
     
    private void iniciarEventos() {
        vista.getLabel_Actualizar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
             public void mouseClicked(java.awt.event.MouseEvent e) {
                if (validarCampos()) {
                    Date inicio = vista.getD_FechaInicio().getDate();
                    Date fin = vista.getD_FechaFin().getDate();

                    ArchivoEncabezadoCuota archivo = new ArchivoEncabezadoCuota();
                    List<String> registrosCobrados = archivo.marcarCobradosYDevolverRegistros(inicio, fin);

                    if (registrosCobrados.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "ℹ️ No hay cuentas por cobrar en ese rango.");
                    } else {
                        new ArchivoClientes().actualizarBalancesDesdeRegistros(registrosCobrados);
                        
                        new ArchivoCobro().marcarCobrosComoCobradosDesdeCuotas(registrosCobrados);
                        
                        JOptionPane.showMessageDialog(null, "✅ Se marcaron como cobradas y se actualizaron balances.");
                    }
                }
            }
        });
        
        vista.getPanel_Actualizar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
             public void mouseClicked(java.awt.event.MouseEvent e) {
                if (validarCampos()) {
                    Date inicio = vista.getD_FechaInicio().getDate();
                    Date fin = vista.getD_FechaFin().getDate();

                    ArchivoEncabezadoCuota archivo = new ArchivoEncabezadoCuota();
                    List<String> registrosCobrados = archivo.marcarCobradosYDevolverRegistros(inicio, fin);

                    if (registrosCobrados.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "ℹ️ No hay cuentas por cobrar en ese rango.");
                    } else {
                        new ArchivoClientes().actualizarBalancesDesdeRegistros(registrosCobrados);
                        JOptionPane.showMessageDialog(null, "✅ Se marcaron como cobradas y se actualizaron balances.");
                    }
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
        contenedor.setLayout(new BorderLayout()); 
        contenedor.add(panelMantenimientos, BorderLayout.CENTER);

        contenedor.revalidate();
        contenedor.repaint();
    }
    
    private void establecerValoresPorDefecto() {
        Calendar calendario = Calendar.getInstance();
        int añoActual = calendario.get(Calendar.YEAR);

        calendario.set(Calendar.MONTH, Calendar.JANUARY);
        calendario.set(Calendar.DAY_OF_MONTH, 1);
        Date fechaInicio = calendario.getTime();

        Date fechaFin = new Date();

        vista.getD_FechaInicio().setDate(fechaInicio);
        vista.getD_FechaFin().setDate(fechaFin);
    }
     
    public boolean validarCampos() {
        Date fechaInicio = vista.getD_FechaInicio().getDate();
        Date fechaFin = vista.getD_FechaFin().getDate();

        if (fechaInicio == null || fechaFin == null) {
            JOptionPane.showMessageDialog(null, "⚠️ Las fechas son obligatorias.");
            return false;
        }
        
        if (fechaInicio.after(fechaFin)) {
            JOptionPane.showMessageDialog(null, "❌ La fecha de inicio no puede ser mayor que la fecha de fin.");
            return false;
        }
        
        return true;
    }
}
