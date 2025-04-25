package Controlers;

import Models.ArchivoReservas;
import View.Home;
import View.Mantenimientos;
import View.Reserva;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ControlReservas {
    private final Reserva vista;
    private final Home vistaPrincipal;
    private final ControlHome controlHome;
    private JPanel contenedor;
    private ControlMantenimientos controladorMantenimiento;
    
     public ControlReservas(Reserva vista, Home vistaPrincipal, ControlHome controlHome) {
        this.vista = vista;
        this.vistaPrincipal = vistaPrincipal;
        this.controlHome = controlHome;
        iniciarEventos();
        cargarComboSalas();
        cargarComboCliente();
        cargarComboHorario();
        cargarComboEstado();
    }
     
    public void cargarComboSalas() {
        JComboBox<String> combo = vista.getCID_Sala();
        combo.removeAllItems();

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/Models/salas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);
                if (partes.length >= 1) {
                    combo.addItem(partes[0] + " - " + partes[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error al cargar las salas: " + e.getMessage());
        }
    }
    
    public void cargarComboCliente() {
        JComboBox<String> combo = vista.getCID_Cliente();
        combo.removeAllItems();

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/Models/clientes.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);
                if (partes.length >= 1) {
                    combo.addItem(partes[0] + " - " + partes[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error al cargar las clientes: " + e.getMessage());
        }
    }
    
    public void cargarComboHorario() {
        JComboBox<String> combo = vista.getCID_Horario();
        combo.removeAllItems();

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/Models/horarioActividades.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);
                if (partes.length >= 1) {
                    combo.addItem(partes[0] + " - " + partes[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error al cargar los horarios: " + e.getMessage());
        }
    }
    
    public void cargarComboEstado() {
        JComboBox<String> combo = vista.getCID_Estado();
        combo.removeAllItems();

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/Models/estadoReserva.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);
                if (partes.length >= 1) {
                    combo.addItem(partes[0]);
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error al cargar los Estados: " + e.getMessage());
        }
    }
     
    private void iniciarEventos() {
        vista.getPanel_Guardar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (validarCampos()) {
                    String id = vista.getTID_Reserva().getText().trim();
                    String linea = construirLineaReserva();

                    new ArchivoReservas().guardarOEditarPorID(linea, id);

                    JOptionPane.showMessageDialog(null, "✅ Reserva guardado o actualizado correctamente.");
                    limpiarCamposConID();
                }
            }
        });
        
        vista.getPanel_Eliminar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                String id = vista.getTID_Reserva().getText().trim();

                if (id.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "⚠️ Debes ingresar un ID para eliminar la reserva.");
                    return;
                }

                new ArchivoReservas().eliminarPorID(id);
                JOptionPane.showMessageDialog(null, "🗑️ Reserva eliminado (si existía).");
                limpiarCamposConID();
            }
        });
        
        vista.getTID_Reserva().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String idTexto = vista.getTID_Reserva().getText().trim();

                if (idTexto.isEmpty()) {
                    limpiarCampos();
                    vista.getLabel_Estado().setText("Creando");
                    return;
                }

                SwingUtilities.invokeLater(() -> {
                    String linea = new ArchivoReservas().buscarPorID(idTexto);

                    if (linea != null) {
                        String[] partes = linea.split(";", -1);
                        if (partes.length >= 3) {
                            vista.getLabel_Estado().setText("Modificando");
                            
                            try {
                                java.util.Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(partes[1]);
                                vista.getD_FechaReserva().setDate(fecha);
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }

                            seleccionarComboPorID(vista.getCID_Sala(), partes[2]);
                            seleccionarComboPorID(vista.getCID_Cliente(), partes[3]);
                            seleccionarComboPorID(vista.getCID_Horario(), partes[4]);
                            seleccionarComboPorID(vista.getCID_Estado(), partes[5]);
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
    
    private void seleccionarComboPorID(javax.swing.JComboBox<String> combo, String id) {
        for (int i = 0; i < combo.getItemCount(); i++) {
            String item = combo.getItemAt(i);
            if (item.startsWith(id + " -")) {
                combo.setSelectedIndex(i);
                break;
            }
        }
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
        String id = vista.getTID_Reserva().getText().trim();

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ El campo ID de la sala es obligatorio.");
            return false;
        }

        if (vista.getCID_Sala().getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "⚠️ Debes seleccionar una Sala.");
            return false;
        }
        
        if (vista.getCID_Cliente().getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "⚠️ Debes seleccionar una Cliente.");
            return false;
        }
        
        if (vista.getCID_Horario().getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "⚠️ Debes seleccionar una Horario.");
            return false;
        }
        
        if (vista.getCID_Estado().getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "⚠️ Debes seleccionar una Estado.");
            return false;
        }
        
        return true;
    }
     
    private String construirLineaReserva() {
        String id = vista.getTID_Reserva().getText().trim();
        
        String fecha = "";
        if (vista.getD_FechaReserva().getDate() != null) {
            fecha = new SimpleDateFormat("dd/MM/yyyy").format(vista.getD_FechaReserva().getDate());
        }
   
        String idSala = "";
        String idCliente = "";
        String idHorario = "";
        String idEstado = "";

        if (vista.getCID_Sala().getSelectedItem() != null) {
            String seleccionado = vista.getCID_Sala().getSelectedItem().toString();
            idSala = seleccionado.split(" - ")[0].trim();
        }
        
        if (vista.getCID_Cliente().getSelectedItem() != null) {
            String seleccionado = vista.getCID_Cliente().getSelectedItem().toString();
            idCliente = seleccionado.split(" - ")[0].trim();
        }
        
        if (vista.getCID_Horario().getSelectedItem() != null) {
            String seleccionado = vista.getCID_Horario().getSelectedItem().toString();
            idHorario = seleccionado.split(" - ")[0].trim();
        }
        
        if (vista.getCID_Estado().getSelectedItem() != null) {
            String seleccionado = vista.getCID_Estado().getSelectedItem().toString();
            idEstado = seleccionado.split(" - ")[0].trim();
        }

        return String.join(";", id, fecha, idSala, idCliente, idHorario, idEstado);
    }
    
    private void limpiarCampos() {
        vista.getCID_Sala().setSelectedIndex(0);
        vista.getD_FechaReserva().setDate(null);
        vista.getCID_Cliente().setSelectedIndex(0);
        vista.getCID_Horario().setSelectedIndex(0);
        vista.getCID_Estado().setSelectedIndex(0);
    }
    
    private void limpiarCamposConID() {
        vista.getTID_Reserva().setText("");
        vista.getD_FechaReserva().setDate(null);
        vista.getCID_Sala().setSelectedIndex(0);
        vista.getCID_Cliente().setSelectedIndex(0);
        vista.getCID_Horario().setSelectedIndex(0);
        vista.getCID_Estado().setSelectedIndex(0);
    }
}
