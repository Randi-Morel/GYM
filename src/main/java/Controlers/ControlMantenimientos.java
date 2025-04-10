package Controlers;

import View.Actividad;
import View.Cliente;
import View.Entrenador;
import View.EstadoReserva;
import View.Home;
import View.HoraActividades;
import View.Localizacion;
import View.Mantenimientos;
import View.Salas;
import View.Usuario;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class ControlMantenimientos {
    private final Mantenimientos vista;
    private final Home vistaPrincipal;
    private final ControlHome controladorHome;
    
     public ControlMantenimientos(Mantenimientos vista, Home vistaPrincipal, ControlHome controladorHome) {
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
        
        vista.getLabel_Usuarios().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Usuario panelUsuario = new Usuario();
                new ControlUsuarios(panelUsuario, vistaPrincipal, controladorHome);
                cargarPantalla(panelUsuario);
            }
        });

        vista.getPanel_Usuarios().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Usuario panelUsuario = new Usuario();
                new ControlUsuarios(panelUsuario, vistaPrincipal, controladorHome);
                cargarPantalla(panelUsuario);
            }
        });
        
        vista.getLabel_Entrenador().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Entrenador panelEntrenador = new Entrenador();
                new ControlEntrenador(panelEntrenador, vistaPrincipal, controladorHome);
                cargarPantalla(panelEntrenador);
            }
        });

        vista.getPanel_Entrenador().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Entrenador panelEntrenador = new Entrenador();
                new ControlEntrenador(panelEntrenador, vistaPrincipal, controladorHome);
                cargarPantalla(panelEntrenador);
            }
        });
        
        vista.getLabel_Localizacion().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Localizacion panelLocalizacion = new Localizacion();
                new ControlLocalizacion(panelLocalizacion, vistaPrincipal, controladorHome);
                cargarPantalla(panelLocalizacion);
            }
        });

        vista.getPanel_Localizacion().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Localizacion panelLocalizacion = new Localizacion();
                new ControlLocalizacion(panelLocalizacion, vistaPrincipal, controladorHome);
                cargarPantalla(panelLocalizacion);
            }
        });
        
        vista.getLabel_EstadoReserva().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EstadoReserva panelEstadoReserva = new EstadoReserva();
                new ControlEstadoReserva(panelEstadoReserva, vistaPrincipal, controladorHome);
                cargarPantalla(panelEstadoReserva);
            }
        });

        vista.getPanel_EstadoReserva().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EstadoReserva panelEstadoReserva = new EstadoReserva();
                new ControlEstadoReserva(panelEstadoReserva, vistaPrincipal, controladorHome);
                cargarPantalla(panelEstadoReserva);
            }
        });
        
        vista.getLabel_Actividades().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Actividad panelActividad = new Actividad();
                new ControlActividad(panelActividad, vistaPrincipal, controladorHome);
                cargarPantalla(panelActividad);
            }
        });

        vista.getPanel_Actividades().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Actividad panelActividad = new Actividad();
                new ControlActividad(panelActividad, vistaPrincipal, controladorHome);
                cargarPantalla(panelActividad);
            }
        });
        
        vista.getLabel_Salas().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Salas panelSalas = new Salas();
                new ControlSalas(panelSalas, vistaPrincipal, controladorHome);
                cargarPantalla(panelSalas);
            }
        });

        vista.getPanel_Salas().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Salas panelSalas = new Salas();
                new ControlSalas(panelSalas, vistaPrincipal, controladorHome);
                cargarPantalla(panelSalas);
            }
        });
        
        vista.getLabel_Horario().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoraActividades panelHoraActividades = new HoraActividades();
                new ControlHorarioActividades(panelHoraActividades, vistaPrincipal, controladorHome);
                cargarPantalla(panelHoraActividades);
            }
        });

        vista.getPanel_Horario().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoraActividades panelHoraActividades = new HoraActividades();
                new ControlHorarioActividades(panelHoraActividades, vistaPrincipal, controladorHome);
                cargarPantalla(panelHoraActividades);
            }
        });
        
        vista.getLabel_Clientes().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cliente panelCliente = new Cliente();
                new ControlCliente(panelCliente, vistaPrincipal, controladorHome);
                cargarPantalla(panelCliente);
            }
        });

        vista.getPanel_Clientes().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cliente panelCliente = new Cliente();
                new ControlCliente(panelCliente, vistaPrincipal, controladorHome);
                cargarPantalla(panelCliente);
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

  