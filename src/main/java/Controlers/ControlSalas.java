package Controlers;

import Models.ArchivoSalas;
import View.Home;
import View.Mantenimientos;
import View.Salas;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ControlSalas {
    private final Salas vista;
    private final Home vistaPrincipal;
    private final ControlHome controlHome;
    private JPanel contenedor;
    private ControlMantenimientos controladorMantenimiento;
    
     public ControlSalas(Salas vista, Home vistaPrincipal, ControlHome controlHome) {
        this.vista = vista;
        this.vistaPrincipal = vistaPrincipal;
        this.controlHome = controlHome;
        iniciarEventos();
        cargarComboLocalizaciones();
    }
     
    public void cargarComboLocalizaciones() {
        JComboBox<String> combo = vista.getCID_Localizacion();
        combo.removeAllItems();

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/Models/localizaciones.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);
                if (partes.length >= 1) {
                    combo.addItem(partes[0] + " - " + partes[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error al cargar localizaciones: " + e.getMessage());
        }
    }
     
    private void iniciarEventos() {
        vista.getPanel_Guardar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (validarCampos()) {
                    String id = vista.getTID_Sala().getText().trim();
                    String linea = construirLineaActividad();

                    new ArchivoSalas().guardarOEditarPorID(linea, id);

                    JOptionPane.showMessageDialog(null, "✅ Sala guardado o actualizado correctamente.");
                    limpiarCamposConID();
                }
            }
        });
        
        vista.getPanel_Eliminar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                String id = vista.getTID_Sala().getText().trim();

                if (id.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "⚠️ Debes ingresar un ID para eliminar la actividad.");
                    return;
                }

                new ArchivoSalas().eliminarPorID(id);
                JOptionPane.showMessageDialog(null, "🗑️ Sala eliminado (si existía).");
                limpiarCamposConID();
            }
        });
        
        vista.getTID_Sala().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String idTexto = vista.getTID_Sala().getText().trim();

                if (idTexto.isEmpty()) {
                    limpiarCampos();
                    vista.getLabel_Estado().setText("Creando");
                    return;
                }

                SwingUtilities.invokeLater(() -> {
                    String linea = new ArchivoSalas().buscarPorID(idTexto);

                    if (linea != null) {
                        String[] partes = linea.split(";", -1);
                        if (partes.length >= 5) {
                            vista.getLabel_Estado().setText("Modificando");
                            vista.getT_Nombre().setText(partes[1]);
                            vista.getT_Descipcion().setText(partes[2]);

                            for (int i = 0; i < vista.getCID_Localizacion().getItemCount(); i++) {
                                String item = vista.getCID_Localizacion().getItemAt(i);
                                if (item.startsWith(partes[3] + " -")) {
                                    vista.getCID_Localizacion().setSelectedIndex(i);
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
     
    public boolean validarCampos() {
        String id = vista.getTID_Sala().getText().trim();
        String nombre = vista.getT_Nombre().getText().trim();
        String descripcion = vista.getT_Descipcion().getText().trim();

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ El campo ID de la actividad es obligatorio.");
            return false;
        }

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ El campo Nombre es obligatorio.");
            return false;
        }

        if (descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ El campo Descripción es obligatorio.");
            return false;
        }

        if (vista.getCID_Localizacion().getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "⚠️ Debes seleccionar una Localización.");
            return false;
        }
        
        return true;
    }
     
    private String construirLineaActividad() {
        String id = vista.getTID_Sala().getText().trim();
        String nombre = vista.getT_Nombre().getText().trim();
        String descripcion = vista.getT_Descipcion().getText().trim();
   
        String idLocalizacion = "";
        String idEntrenador = "";

        if (vista.getCID_Localizacion().getSelectedItem() != null) {
            String seleccionado = vista.getCID_Localizacion().getSelectedItem().toString();
            idLocalizacion = seleccionado.split(" - ")[0].trim();
        }

        return id + ";" + nombre + ";" + descripcion + ";" + idLocalizacion + ";" + idEntrenador;
    }
    
    private void limpiarCampos() {
        vista.getT_Nombre().setText("");
        vista.getT_Descipcion().setText("");
        vista.getCID_Localizacion().setSelectedIndex(0);
    }
    
    private void limpiarCamposConID() {
        vista.getTID_Sala().setText("");
        vista.getT_Nombre().setText("");
        vista.getT_Descipcion().setText("");
        vista.getCID_Localizacion().setSelectedIndex(0);
    }
    
}
