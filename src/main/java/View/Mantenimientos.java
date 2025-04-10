package View;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mantenimientos extends javax.swing.JPanel {

    public Mantenimientos() {
        initComponents();
    }
    
    public JLabel getLabel_CerrarMenu() {
        return label_CerrarMenu;
    }
    
    public JPanel getPanel_CerrarMenu() {
        return panel_CerrarMenu;
    }
    
    public JLabel getLabel_Usuarios() {
        return label_Usuarios;
    }
    
    public JPanel getPanel_Usuarios() {
        return panel_Usuarios;
    }
    
    public JLabel getLabel_Entrenador() {
        return label_Entrenador;
    }
    
    public JPanel getPanel_Entrenador() {
        return panel_Entrenador;
    }
    
    public JLabel getLabel_Localizacion() {
        return label_Localizacion;
    }
    
    public JPanel getPanel_Localizacion() {
        return panel_Localizacion;
    }
    
    public JLabel getLabel_EstadoReserva() {
        return label_EstadoReserva;
    }
    
    public JPanel getPanel_EstadoReserva() {
        return panel_EstadoReserva;
    }
    
    public JLabel getLabel_Actividades() {
        return label_Actividades;
    }
    
    public JPanel getPanel_Actividades() {
        return panel_Actividades;
    }
    
    public JLabel getLabel_Salas() {
        return label_Salas;
    }
    
    public JPanel getPanel_Salas() {
        return panel_Salas;
    }
    
    public JLabel getLabel_Horario() {
        return label_Horario;
    }
    
    public JPanel getPanel_Horario() {
        return panel_Horario;
    }
    
    public JLabel getLabel_Clientes() {
        return label_Clientes;
    }
    
    public JPanel getPanel_Clientes() {
        return panel_Clientes;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panel_Usuarios = new javax.swing.JPanel();
        label_Usuarios = new javax.swing.JLabel();
        panel_Entrenador = new javax.swing.JPanel();
        label_Entrenador = new javax.swing.JLabel();
        panel_Localizacion = new javax.swing.JPanel();
        label_Localizacion = new javax.swing.JLabel();
        panel_Salas = new javax.swing.JPanel();
        label_Salas = new javax.swing.JLabel();
        panel_Actividades = new javax.swing.JPanel();
        label_Actividades = new javax.swing.JLabel();
        panel_Horario = new javax.swing.JPanel();
        label_Horario = new javax.swing.JLabel();
        panel_Usuarios8 = new javax.swing.JPanel();
        label_Usuarios8 = new javax.swing.JLabel();
        panel_Clientes = new javax.swing.JPanel();
        label_Clientes = new javax.swing.JLabel();
        panel_EstadoReserva = new javax.swing.JPanel();
        label_EstadoReserva = new javax.swing.JLabel();
        panel_Usuarios9 = new javax.swing.JPanel();
        label_Usuarios9 = new javax.swing.JLabel();
        panel_CerrarMenu = new javax.swing.JPanel();
        label_CerrarMenu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Usuarios.setBackground(new java.awt.Color(66, 65, 69));
        panel_Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Usuarios.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Usuarios.setForeground(new java.awt.Color(255, 255, 255));
        label_Usuarios.setText("Usuarios");
        label_Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_UsuariosLayout = new javax.swing.GroupLayout(panel_Usuarios);
        panel_Usuarios.setLayout(panel_UsuariosLayout);
        panel_UsuariosLayout.setHorizontalGroup(
            panel_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_UsuariosLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(label_Usuarios)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        panel_UsuariosLayout.setVerticalGroup(
            panel_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 200, 50));

        panel_Entrenador.setBackground(new java.awt.Color(66, 65, 69));
        panel_Entrenador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Entrenador.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Entrenador.setForeground(new java.awt.Color(255, 255, 255));
        label_Entrenador.setText("Entrenador");
        label_Entrenador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_EntrenadorLayout = new javax.swing.GroupLayout(panel_Entrenador);
        panel_Entrenador.setLayout(panel_EntrenadorLayout);
        panel_EntrenadorLayout.setHorizontalGroup(
            panel_EntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EntrenadorLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(label_Entrenador)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panel_EntrenadorLayout.setVerticalGroup(
            panel_EntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Entrenador, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Entrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 200, -1));

        panel_Localizacion.setBackground(new java.awt.Color(66, 65, 69));
        panel_Localizacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Localizacion.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Localizacion.setForeground(new java.awt.Color(255, 255, 255));
        label_Localizacion.setText("Localización");
        label_Localizacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_LocalizacionLayout = new javax.swing.GroupLayout(panel_Localizacion);
        panel_Localizacion.setLayout(panel_LocalizacionLayout);
        panel_LocalizacionLayout.setHorizontalGroup(
            panel_LocalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_LocalizacionLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(label_Localizacion)
                .addGap(43, 43, 43))
        );
        panel_LocalizacionLayout.setVerticalGroup(
            panel_LocalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Localizacion, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Localizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 200, -1));

        panel_Salas.setBackground(new java.awt.Color(66, 65, 69));
        panel_Salas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Salas.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Salas.setForeground(new java.awt.Color(255, 255, 255));
        label_Salas.setText("Salas");
        label_Salas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_SalasLayout = new javax.swing.GroupLayout(panel_Salas);
        panel_Salas.setLayout(panel_SalasLayout);
        panel_SalasLayout.setHorizontalGroup(
            panel_SalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SalasLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(label_Salas)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        panel_SalasLayout.setVerticalGroup(
            panel_SalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Salas, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Salas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 200, -1));

        panel_Actividades.setBackground(new java.awt.Color(66, 65, 69));
        panel_Actividades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Actividades.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Actividades.setForeground(new java.awt.Color(255, 255, 255));
        label_Actividades.setText("Actividades");
        label_Actividades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_ActividadesLayout = new javax.swing.GroupLayout(panel_Actividades);
        panel_Actividades.setLayout(panel_ActividadesLayout);
        panel_ActividadesLayout.setHorizontalGroup(
            panel_ActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ActividadesLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(label_Actividades)
                .addGap(43, 43, 43))
        );
        panel_ActividadesLayout.setVerticalGroup(
            panel_ActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Actividades, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Actividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 200, -1));

        panel_Horario.setBackground(new java.awt.Color(66, 65, 69));
        panel_Horario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Horario.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Horario.setForeground(new java.awt.Color(255, 255, 255));
        label_Horario.setText("Horarios Actividades");
        label_Horario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_HorarioLayout = new javax.swing.GroupLayout(panel_Horario);
        panel_Horario.setLayout(panel_HorarioLayout);
        panel_HorarioLayout.setHorizontalGroup(
            panel_HorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_HorarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_Horario)
                .addContainerGap())
        );
        panel_HorarioLayout.setVerticalGroup(
            panel_HorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Horario, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 200, -1));

        panel_Usuarios8.setBackground(new java.awt.Color(66, 65, 69));
        panel_Usuarios8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Usuarios8.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Usuarios8.setForeground(new java.awt.Color(255, 255, 255));
        label_Usuarios8.setText("Reservas");
        label_Usuarios8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_Usuarios8Layout = new javax.swing.GroupLayout(panel_Usuarios8);
        panel_Usuarios8.setLayout(panel_Usuarios8Layout);
        panel_Usuarios8Layout.setHorizontalGroup(
            panel_Usuarios8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Usuarios8Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(label_Usuarios8)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        panel_Usuarios8Layout.setVerticalGroup(
            panel_Usuarios8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Usuarios8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Usuarios8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 200, -1));

        panel_Clientes.setBackground(new java.awt.Color(66, 65, 69));
        panel_Clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Clientes.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Clientes.setForeground(new java.awt.Color(255, 255, 255));
        label_Clientes.setText("Clientes");
        label_Clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_ClientesLayout = new javax.swing.GroupLayout(panel_Clientes);
        panel_Clientes.setLayout(panel_ClientesLayout);
        panel_ClientesLayout.setHorizontalGroup(
            panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ClientesLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(label_Clientes)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        panel_ClientesLayout.setVerticalGroup(
            panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Clientes, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 200, -1));

        panel_EstadoReserva.setBackground(new java.awt.Color(66, 65, 69));
        panel_EstadoReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_EstadoReserva.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_EstadoReserva.setForeground(new java.awt.Color(255, 255, 255));
        label_EstadoReserva.setText("Estado Reservas");
        label_EstadoReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_EstadoReservaLayout = new javax.swing.GroupLayout(panel_EstadoReserva);
        panel_EstadoReserva.setLayout(panel_EstadoReservaLayout);
        panel_EstadoReservaLayout.setHorizontalGroup(
            panel_EstadoReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EstadoReservaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(label_EstadoReserva)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panel_EstadoReservaLayout.setVerticalGroup(
            panel_EstadoReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_EstadoReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_EstadoReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 200, -1));

        panel_Usuarios9.setBackground(new java.awt.Color(66, 65, 69));
        panel_Usuarios9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Usuarios9.setPreferredSize(new java.awt.Dimension(200, 50));

        label_Usuarios9.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Usuarios9.setForeground(new java.awt.Color(255, 255, 255));
        label_Usuarios9.setText("Reserva Actividades");
        label_Usuarios9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_Usuarios9Layout = new javax.swing.GroupLayout(panel_Usuarios9);
        panel_Usuarios9.setLayout(panel_Usuarios9Layout);
        panel_Usuarios9Layout.setHorizontalGroup(
            panel_Usuarios9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Usuarios9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Usuarios9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_Usuarios9Layout.setVerticalGroup(
            panel_Usuarios9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Usuarios9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Usuarios9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        panel_CerrarMenu.setBackground(new java.awt.Color(66, 65, 69));
        panel_CerrarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_CerrarMenu.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_CerrarMenu.setForeground(new java.awt.Color(255, 255, 255));
        label_CerrarMenu.setText("Cerrar menú");
        label_CerrarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_CerrarMenuLayout = new javax.swing.GroupLayout(panel_CerrarMenu);
        panel_CerrarMenu.setLayout(panel_CerrarMenuLayout);
        panel_CerrarMenuLayout.setHorizontalGroup(
            panel_CerrarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CerrarMenuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(label_CerrarMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_CerrarMenuLayout.setVerticalGroup(
            panel_CerrarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_CerrarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_CerrarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, 160, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("Mantenimientos de:");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_Actividades;
    private javax.swing.JLabel label_CerrarMenu;
    private javax.swing.JLabel label_Clientes;
    private javax.swing.JLabel label_Entrenador;
    private javax.swing.JLabel label_EstadoReserva;
    private javax.swing.JLabel label_Horario;
    private javax.swing.JLabel label_Localizacion;
    private javax.swing.JLabel label_Salas;
    private javax.swing.JLabel label_Usuarios;
    private javax.swing.JLabel label_Usuarios8;
    private javax.swing.JLabel label_Usuarios9;
    private javax.swing.JPanel panel_Actividades;
    private javax.swing.JPanel panel_CerrarMenu;
    private javax.swing.JPanel panel_Clientes;
    private javax.swing.JPanel panel_Entrenador;
    private javax.swing.JPanel panel_EstadoReserva;
    private javax.swing.JPanel panel_Horario;
    private javax.swing.JPanel panel_Localizacion;
    private javax.swing.JPanel panel_Salas;
    private javax.swing.JPanel panel_Usuarios;
    private javax.swing.JPanel panel_Usuarios8;
    private javax.swing.JPanel panel_Usuarios9;
    // End of variables declaration//GEN-END:variables
}
