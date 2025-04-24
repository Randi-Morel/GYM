package Controlers;

import View.Consultas;
import View.Login;
import View.Home;
import View.Mantenimientos;
import View.Movimientos;
import View.Procesos;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.JPanel;

public class ControlHome {
    private final Home vista;
    private LayoutManager layoutOriginal;
    private Component imagenOriginal;

    public ControlHome(Home vista, int nivelAcceso) {
        this.vista = vista;
        
        inicializarLayoutOriginal();
        
        if (nivelAcceso == 1) {
            vista.getLabel_Mantenimientos().setVisible(false);
            vista.getPanel_Mantenimientos().setVisible(false); // si tienes un panel también
        }

        vista.getLabel_Mantenimientos().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mantenimientos panelMantenimientos = new Mantenimientos();
                new ControlMantenimientos(panelMantenimientos, vista, ControlHome.this);
                cargarPantalla(panelMantenimientos);
            }
        });
        
        vista.getLabel_Consultas().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Consultas panelConsultas = new Consultas();
                new ControlConsultas(panelConsultas, vista, ControlHome.this);
                cargarPantalla(panelConsultas);
            }
        });
        
        vista.getLabel_Procesos().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Procesos panelProcesos = new Procesos();
                new ControlProcesos(panelProcesos, vista, ControlHome.this);
                cargarPantalla(panelProcesos);
            }
        });
        
        vista.getLabel_Movimientos().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Movimientos panelMovimientos = new Movimientos();
                new ControlMovimientos(panelMovimientos, vista, ControlHome.this);
                cargarPantalla(panelMovimientos);
            }
        });
        
        vista.getLabel_CerrarSesion().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesion();
            }
        });

        vista.getPanel_CerrarSesion().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesion();
            }
        });
    }
    
    private void cargarPantalla(JPanel panelNuevo) {
        JPanel contenedor = vista.getPanel_ControlPantallas();
        contenedor.removeAll();                         
        contenedor.setLayout(new BorderLayout());       
        contenedor.add(panelNuevo, BorderLayout.CENTER);
        contenedor.revalidate();                        
        contenedor.repaint();                           
    }
    
    public void inicializarLayoutOriginal() {
        layoutOriginal = vista.getPanel_ControlPantallas().getLayout();
        imagenOriginal = vista.getLabel_Imagen();
    }
    
    public LayoutManager getLayoutOriginal() {
        return layoutOriginal;
    }

    public Component getImagenOriginal() {
        return imagenOriginal;
    }
    
    private void cerrarSesion() {
        vista.dispose(); 
        new ControlLogin(new Login()); 
    }
    
}
