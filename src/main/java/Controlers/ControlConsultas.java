package Controlers;

import Models.ArchivoUsuarios;
import View.Consultas;
import View.Home;
import javax.swing.JPanel;

public class ControlConsultas {
    private final Consultas vista;
    private final Home vistaPrincipal;
    private final ControlHome controladorHome;
    
     public ControlConsultas(Consultas vista, Home vistaPrincipal, ControlHome controladorHome) {
        this.vista = vista;
        this.vistaPrincipal = vistaPrincipal;
        this.controladorHome = controladorHome;
        iniciarEventos();
    }
     
    private void iniciarEventos() {
        vista.getLabel_CerrarMenu().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarPanel();
            }
        });

        vista.getPanel_CerrarMenu().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarPanel();
            }
        });
    }
     
    private void cerrarPanel() {
        JPanel contenedor = vistaPrincipal.getPanel_ControlPantallas();

        contenedor.removeAll();
        contenedor.setLayout(controladorHome.getLayoutOriginal());
        contenedor.add(controladorHome.getImagenOriginal());

        contenedor.revalidate();
        contenedor.repaint();
    }
}

  