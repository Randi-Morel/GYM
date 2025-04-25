package Controlers;

import Models.ArchivoActividades;
import Models.ArchivoClientes;
import Models.ArchivoEntrenadores;
import Models.ArchivoLocalizaciones;
import View.Consultas;
import View.ConsultasClientes;
import View.Home;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ControlConsultasClientes {
    private final ConsultasClientes vista;
    private final Home vistaPrincipal;
    private final ControlHome controladorHome;
    private JPanel contenedor;
    
    public ControlConsultasClientes(ConsultasClientes vista, Home vistaPrincipal, ControlHome controladorHome) {
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
        
        vista.getCHK_BalancePendiente().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                llenarTablaClientes();
            }
        });
        
        vista.getT_Buscar().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String textoBusqueda = vista.getT_Buscar().getText().trim().toLowerCase();
                String filtroSeleccionado = vista.getC_Filtro().getSelectedItem().toString();

                DefaultTableModel modelo = (DefaultTableModel) vista.getGRD().getModel();
                modelo.setRowCount(0);

                List<String> clientes = new ArchivoClientes().leerTodo();

                for (String linea : clientes) {
                    String[] partes = linea.split(";", -1);
                    if (partes.length >= 14) {
                        String id = partes[0].trim();
                        String nombre = partes[1].trim();
                        String apellidos = partes[2].trim() + " " + partes[3].trim();
                        String fechaNac = partes[4].trim();
                        String fechaIng = partes[5].trim();
                        String telefono = partes[6].trim();
                        String celular = partes[7].trim();
                        String direccion = partes[8].trim();
                        String correo = partes[9].trim();
                        String balance = partes[10].trim();
                        String valorCuota = partes[11].trim();
                        String estado = partes[12].trim();
                        String tipo = partes[13].trim();
                        
                        boolean mostrarTodos = vista.getCHK_BalancePendiente().isSelected();

                        if (!mostrarTodos) {
                            if (!balance.isEmpty()) {
                                try {
                                    double valorBalance = Double.parseDouble(balance.replace(",", "."));
                                    if (valorBalance > 0) continue;
                                } catch (NumberFormatException ex) {
                                    continue;
                                }
                            }
                        }
                        
                        String campoFiltrado;
                        switch (filtroSeleccionado) {
                            case "Nombre":
                                campoFiltrado = nombre;
                                break;
                            case "Apellidos":
                                campoFiltrado = apellidos;
                                break;
                            case "Fecha de Nacimiento":
                                campoFiltrado = fechaNac;
                                break;
                            case "Fecha de Ingreso":
                                campoFiltrado = fechaIng;
                                break;
                            case "Telefono":
                                campoFiltrado = telefono;
                                break;
                            case "Celular":
                                campoFiltrado = celular;
                                break;
                            case "Direccion":
                                campoFiltrado = direccion;
                                break;
                            case "Correo":
                                campoFiltrado = correo;
                                break;
                            case "Balance":
                                campoFiltrado = balance;
                                break;
                            case "Valor de Cuota":
                                campoFiltrado = valorCuota;
                                break;
                            case "Estado del Cliente":
                                campoFiltrado = estado;
                                break;
                            case "Tipo de Cliente":
                                campoFiltrado = tipo;
                                break;
                            default: // ID
                                campoFiltrado = id;
                                break;
                        }

                        if (campoFiltrado.toLowerCase().contains(textoBusqueda)) {
                            modelo.addRow(new Object[] {
                                id, nombre, apellidos, fechaNac, fechaIng, telefono, celular,
                                direccion, correo, balance, valorCuota, estado, tipo
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
        llenarTablaClientes();
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
        llenarTablaClientes();
    }
    
    private void llenarTablaClientes() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getGRD().getModel();
        modelo.setRowCount(0);

        boolean mostrarTodos = vista.getCHK_BalancePendiente().isSelected();
        List<String> clientes = new ArchivoClientes().leerTodo();

        for (String linea : clientes) {
            String[] partes = linea.split(";", -1);
            if (partes.length >= 14) {
                String id = partes[0].trim();
                String nombre = partes[1].trim();
                String apellidos = partes[2].trim() + " " + partes[3].trim();
                String fechaNac = partes[4].trim();
                String fechaIng = partes[5].trim();
                String telefono = partes[6].trim();
                String celular = partes[7].trim();
                String direccion = partes[8].trim();
                String correo = partes[9].trim();
                String balance = partes[10].trim();
                String valorCuota = partes[11].trim();
                String estado = partes[12].trim();
                String tipo = partes[13].trim();
                
                if (!mostrarTodos) {
                    if (!balance.isEmpty()) {
                        try {
                            double valorBalance = Double.parseDouble(balance.replace(",", "."));
                            if (valorBalance > 0) continue;
                        } catch (NumberFormatException ex) {
                            continue;
                        }
                    }
                }

                modelo.addRow(new Object[] {
                    id, nombre, apellidos, fechaNac, fechaIng, telefono, celular,
                    direccion, correo, balance, valorCuota, estado, tipo
                });
            }
        }

        vista.getGRD().revalidate();
        vista.getGRD().repaint();
    }
}
