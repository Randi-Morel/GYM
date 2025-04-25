package Controlers;

import Models.ArchivoClientes;
import View.Cliente;
import View.Home;
import View.Mantenimientos;
import java.awt.BorderLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.util.Date;

public class ControlCliente {
    private final Cliente vista;
    private final Home vistaPrincipal;
    private final ControlHome controlHome;
    private JPanel contenedor;
    private ControlMantenimientos controladorMantenimiento;
    
     public ControlCliente(Cliente vista, Home vistaPrincipal, ControlHome controlHome) {
        this.vista = vista;
        this.vistaPrincipal = vistaPrincipal;
        this.controlHome = controlHome;
        iniciarEventos();
        establecerValoresPorDefecto();
    }
     
    private void iniciarEventos() {
        vista.getPanel_Guardar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (validarCampos()) {
                    String id = vista.getTID_Cliente().getText().trim();
                    String linea = construirLineaCliente();

                    new ArchivoClientes().guardarOEditarPorID(linea, id);

                    JOptionPane.showMessageDialog(null, "✅ Cliente guardado o actualizado correctamente.");
                    limpiarCamposConID();
                }
            }
        });
        
        vista.getPanel_Eliminar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                String id = vista.getTID_Cliente().getText().trim();

                if (id.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "⚠️ Debes ingresar un ID para eliminar el cliente.");
                    return;
                }

                new ArchivoClientes().eliminarPorID(id);
                JOptionPane.showMessageDialog(null, "🗑️ Cliente eliminado (si existía).");
                limpiarCamposConID();
            }
        });
        
        vista.getTID_Cliente().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String idTexto = vista.getTID_Cliente().getText().trim();

                if (idTexto.isEmpty()) {
                    limpiarCampos();
                    vista.getLabel_Estado().setText("Creando");
                    return;
                }

                SwingUtilities.invokeLater(() -> {
                    String linea = new ArchivoClientes().buscarPorID(idTexto);

                    if (linea != null) {
                        String[] partes = linea.split(";", -1);
                        if (partes.length >= 14) {
                            vista.getLabel_Estado().setText("Modificando");

                            vista.getT_Nombre().setText(partes[1]);
                            vista.getT_Apellido1().setText(partes[2]);
                            vista.getT_Apellido2().setText(partes[3]);
                            try {
                                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                                Date fechaNacimiento = formato.parse(partes[4]);
                                Date fechaIngreso = formato.parse(partes[5]);

                                vista.getD_FechaNacimiento().setDate(fechaNacimiento);
                                vista.getD_FechaIngreso().setDate(fechaIngreso);
                            } catch (ParseException e) {
                                vista.getD_FechaIngreso().setDate(null);
                            }
                            vista.getT_Telefono().setText(partes[6]);
                            vista.getT_Celular().setText(partes[7]);
                            vista.getT_Direccion().setText(partes[8]);
                            vista.getT_Correo().setText(partes[9]);
                            vista.getT_Balance().setText(partes[10]);
                            vista.getT_ValorCuota().setText(partes[11]);

                            for (int i = 0; i < vista.getCID_EstadoCliente().getItemCount(); i++) {
                                String item = vista.getCID_EstadoCliente().getItemAt(i);
                                if (item.startsWith(partes[12] + " -")) {
                                    vista.getCID_EstadoCliente().setSelectedIndex(i);
                                    break;
                                }
                            }

                            for (int i = 0; i < vista.getCID_TipoCliente().getItemCount(); i++) {
                                String item = vista.getCID_TipoCliente().getItemAt(i);
                                if (item.startsWith(partes[13] + " -")) {
                                    vista.getCID_TipoCliente().setSelectedIndex(i);
                                    break;
                                }
                            }
                        }
                    } else {
                        limpiarCampos();
                        vista.getLabel_Estado().setText("Creando");
                    }
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
    
    private void establecerValoresPorDefecto() {
        vista.getT_Balance().setText("0.00");
        vista.getT_ValorCuota().setText("0.00");
    }
     
    public boolean validarCampos() {
        String id = vista.getTID_Cliente().getText().trim();
        String nombre = vista.getT_Nombre().getText().trim();
        String apellido1 = vista.getT_Apellido1().getText().trim();
        String apellido2 = vista.getT_Apellido2().getText().trim();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaIngreso = formato.format(vista.getD_FechaIngreso().getDate());
        String fechaNacimiento = formato.format(vista.getD_FechaNacimiento().getDate());

        String telefono = vista.getT_Telefono().getText().trim();
        String celular = vista.getT_Celular().getText().trim();
        String direccion = vista.getT_Direccion().getText().trim();

        if (id.isEmpty() || !id.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "❌ El ID es obligatorio y debe ser numérico.");
            return false;
        }

        if (nombre.isEmpty() || apellido1.isEmpty() || apellido2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ Nombre y apellidos son obligatorios.");
            return false;
        }

        if (fechaNacimiento.isEmpty() || fechaIngreso.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ Las fechas son obligatorias.");
            return false;
        }

        if (telefono.isEmpty() || celular.isEmpty() || direccion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ Teléfono, celular, dirección y correo son obligatorios.");
            return false;
        }

        if (vista.getCID_EstadoCliente().getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "⚠️ Debes seleccionar un Estado del Cliente.");
            return false;
        }

        if (vista.getCID_TipoCliente().getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "⚠️ Debes seleccionar un Tipo de Cliente.");
            return false;
        }

        return true;
    }
     
    private String construirLineaCliente() {
        String id = vista.getTID_Cliente().getText().trim();
        String nombre = vista.getT_Nombre().getText().trim();
        String apellido1 = vista.getT_Apellido1().getText().trim();
        String apellido2 = vista.getT_Apellido2().getText().trim();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaNacimiento = formato.format(vista.getD_FechaNacimiento().getDate());
        String fechaIngreso = formato.format(vista.getD_FechaIngreso().getDate());
        
        String telefono = vista.getT_Telefono().getText().trim();
        String celular = vista.getT_Celular().getText().trim();
        String direccion = vista.getT_Direccion().getText().trim();
        String correo = vista.getT_Correo().getText().trim();
        String balance = vista.getT_Balance().getText().trim();
        String valorCuota = vista.getT_ValorCuota().getText().trim();

        String estadoCliente = vista.getCID_EstadoCliente().getSelectedItem().toString().split(" - ")[0].trim();
        String tipoCliente = vista.getCID_TipoCliente().getSelectedItem().toString().split(" - ")[0].trim();

        return id + ";" + nombre + ";" + apellido1 + ";" + apellido2 + ";" + fechaNacimiento + ";" + fechaIngreso + ";" +
               telefono + ";" + celular + ";" + direccion + ";" + correo + ";" + balance + ";" + valorCuota + ";" +
               estadoCliente + ";" + tipoCliente;
    }
    
    private void limpiarCampos() {
        vista.getT_Nombre().setText("");
        vista.getT_Apellido1().setText("");
        vista.getT_Apellido2().setText("");
        vista.getT_Direccion().setText("");
        vista.getT_Telefono().setText("");
        vista.getT_Celular().setText("");
        vista.getT_Correo().setText("");
        
        vista.getD_FechaIngreso().setDate(new java.util.Date());
        vista.getD_FechaNacimiento().setDate(null);
    
        vista.getT_Balance().setText("");
        vista.getT_ValorCuota().setText("");
        vista.getCID_EstadoCliente().setSelectedIndex(0);
        vista.getCID_TipoCliente().setSelectedIndex(0);
    }
    
    private void limpiarCamposConID() {
        vista.getTID_Cliente().setText("");
        vista.getT_Nombre().setText("");
        vista.getT_Apellido1().setText("");
        vista.getT_Apellido2().setText("");
        vista.getT_Direccion().setText("");
        vista.getT_Telefono().setText("");
        vista.getT_Celular().setText("");
        vista.getT_Correo().setText("");
        
        vista.getD_FechaIngreso().setDate(new java.util.Date());
        vista.getD_FechaNacimiento().setDate(null);
        
        vista.getT_Balance().setText("");
        vista.getT_ValorCuota().setText("");
        vista.getCID_EstadoCliente().setSelectedIndex(0);
        vista.getCID_TipoCliente().setSelectedIndex(0);
    }
    
}
