package Controlers;

import View.ActualizarCuotas;
import View.GenerarCobro;
import View.Home;
import View.Procesos;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class ControlProcesos {
    private final Procesos vista;
    private final Home vistaPrincipal;
    private final ControlHome controladorHome;
    
     public ControlProcesos(Procesos vista, Home vistaPrincipal, ControlHome controladorHome) {
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
        
        vista.getLabel_GenerarCobro().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenerarCobro panelGenerarCobro = new GenerarCobro();
                new ControlGenerarCobro(panelGenerarCobro, vistaPrincipal, controladorHome);
                cargarPantalla(panelGenerarCobro);
            }
        });

        vista.getPanel_GenerarCobro().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenerarCobro panelGenerarCobro = new GenerarCobro();
                new ControlGenerarCobro(panelGenerarCobro, vistaPrincipal, controladorHome);
                cargarPantalla(panelGenerarCobro);
            }
        });
        
        vista.getLabel_ActualizarCuota().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActualizarCuotas panelActualizarCuotas = new ActualizarCuotas();
                new ControlActualizarCuota(panelActualizarCuotas, vistaPrincipal, controladorHome);
                cargarPantalla(panelActualizarCuotas);
            }
        });

        vista.getPanel_ActualizarCuota().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActualizarCuotas panelActualizarCuotas = new ActualizarCuotas();
                new ControlActualizarCuota(panelActualizarCuotas, vistaPrincipal, controladorHome);
                cargarPantalla(panelActualizarCuotas);
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
    
    private void cargarPantalla(JPanel panelNuevo) {
        JPanel contenedor = vistaPrincipal.getPanel_ControlPantallas();
        contenedor.removeAll();                         
        contenedor.setLayout(new BorderLayout());       
        contenedor.add(panelNuevo, BorderLayout.CENTER);
        contenedor.revalidate();                        
        contenedor.repaint();                           
    }
}

  