package Controlers;

import View.Home;
import View.Usuario;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class ControlHome {
    private final Home vista;

    public ControlHome(Home vista) {
        this.vista = vista;

        vista.getLabel_Usuarios().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Usuario panelUsuarios = new Usuario();
                new ControlUsuarios(panelUsuarios);
                cargarPantalla(panelUsuarios);
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
    
}
