package Controlers;

import View.Consultas;
import View.ConsultasActividades;
import View.ConsultasClientes;
import View.ConsultasCobro;
import View.ConsultasCuota;
import View.ConsultasEntrenadores;
import View.ConsultasHorarioActividades;
import View.ConsultasLocalizaciones;
import View.ConsultasSalas;
import View.ConsultasUsuarios;
import View.Home;
import java.awt.BorderLayout;
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
        
        vista.getLabel_Usuarios().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultasUsuarios panelConsultasUsuarios = new ConsultasUsuarios();
                new ControlConsultasUsuarios(panelConsultasUsuarios, vistaPrincipal, controladorHome);
                cargarPantalla(panelConsultasUsuarios);
            }
        });

        vista.getPanel_Usuarios().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultasUsuarios panelConsultasUsuarios = new ConsultasUsuarios();
                new ControlConsultasUsuarios(panelConsultasUsuarios, vistaPrincipal, controladorHome);
                cargarPantalla(panelConsultasUsuarios);
            }
        });
        
        vista.getLabel_Entrenador().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultasEntrenadores panelConsultasEntrenadores = new ConsultasEntrenadores();
                new ControlConsultasEntrenadores(panelConsultasEntrenadores, vistaPrincipal, controladorHome);
                cargarPantalla(panelConsultasEntrenadores);
            }
        });

        vista.getPanel_Entrenador().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultasEntrenadores panelConsultasEntrenadores = new ConsultasEntrenadores();
                new ControlConsultasEntrenadores(panelConsultasEntrenadores, vistaPrincipal, controladorHome);
                cargarPantalla(panelConsultasEntrenadores);
            }
        });
        
        vista.getLabel_Localizaciones().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultasLocalizaciones panelConsultasLocalizaciones = new ConsultasLocalizaciones();
                new ControlConsultasLocalizaciones(panelConsultasLocalizaciones, vistaPrincipal, controladorHome);
                cargarPantalla(panelConsultasLocalizaciones);
            }
        });

        vista.getPanel_Localizaciones().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultasLocalizaciones panelConsultasLocalizaciones = new ConsultasLocalizaciones();
                new ControlConsultasLocalizaciones(panelConsultasLocalizaciones, vistaPrincipal, controladorHome);
                cargarPantalla(panelConsultasLocalizaciones);
            }
        });
        
        vista.getLabel_Salas().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultasSalas panelConsultasSalas = new ConsultasSalas();
                new ControlConsultasSalas(panelConsultasSalas, vistaPrincipal, controladorHome);
                cargarPantalla(panelConsultasSalas);
            }
        });

        vista.getPanel_Salas().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultasSalas panelConsultasSalas = new ConsultasSalas();
                new ControlConsultasSalas(panelConsultasSalas, vistaPrincipal, controladorHome);
                cargarPantalla(panelConsultasSalas);
            }
        });
        
        vista.getLabel_Actividades().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultasActividades panelConsultasActividades = new ConsultasActividades();
                new ControlConsultasActividades(panelConsultasActividades, vistaPrincipal, controladorHome);
                cargarPantalla(panelConsultasActividades);
            }
        });

        vista.getPanel_Actividades().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultasActividades panelConsultasActividades = new ConsultasActividades();
                new ControlConsultasActividades(panelConsultasActividades, vistaPrincipal, controladorHome);
                cargarPantalla(panelConsultasActividades);
            }
        });
        
        vista.getLabel_Horarios().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultasHorarioActividades panelConsultasHorarioActividades = new ConsultasHorarioActividades();
                new ControlConsultasHorarioActividades(panelConsultasHorarioActividades, vistaPrincipal, controladorHome);
                cargarPantalla(panelConsultasHorarioActividades);
            }
        });

        vista.getPanel_Horarios().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultasHorarioActividades panelConsultasHorarioActividades = new ConsultasHorarioActividades();
                new ControlConsultasHorarioActividades(panelConsultasHorarioActividades, vistaPrincipal, controladorHome);
                cargarPantalla(panelConsultasHorarioActividades);
            }
        });
        
        vista.getLabel_Clientes().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultasClientes panelConsultasClientes = new ConsultasClientes();
                new ControlConsultasClientes(panelConsultasClientes, vistaPrincipal, controladorHome);
                cargarPantalla(panelConsultasClientes);
            }
        });

        vista.getPanel_Clientes().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultasClientes panelConsultasClientes = new ConsultasClientes();
                new ControlConsultasClientes(panelConsultasClientes, vistaPrincipal, controladorHome);
                cargarPantalla(panelConsultasClientes);
            }
        });
        
        vista.getLabel_Cobro().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultasCobro panelConsultasCobro = new ConsultasCobro();
                new ControlConsultasCobros(panelConsultasCobro, vistaPrincipal, controladorHome);
                cargarPantalla(panelConsultasCobro);
            }
        });

        vista.getPanel_Cobro().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultasCobro panelConsultasCobro = new ConsultasCobro();
                new ControlConsultasCobros(panelConsultasCobro, vistaPrincipal, controladorHome);
                cargarPantalla(panelConsultasCobro);
            }
        });
        
        vista.getLabel_Cuotas().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultasCuota panelConsultasCuotas = new ConsultasCuota();
                new ControlConsultasCuotas(panelConsultasCuotas, vistaPrincipal, controladorHome);
                cargarPantalla(panelConsultasCuotas);
            }
        });

        vista.getPanel_Cuotas().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultasCuota panelConsultasCuotas = new ConsultasCuota();
                new ControlConsultasCuotas(panelConsultasCuotas, vistaPrincipal, controladorHome);
                cargarPantalla(panelConsultasCuotas);
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

  