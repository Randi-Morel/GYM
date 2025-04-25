package View;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Consultas extends javax.swing.JPanel {

    public Consultas() {
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
    
    public JLabel getLabel_Localizaciones() {
        return label_Localizaciones;
    }
    
    public JPanel getPanel_Localizaciones() {
        return panel_Localizaciones;
    }
    
    public JLabel getLabel_Salas() {
        return label_Salas;
    }
    
    public JPanel getPanel_Salas() {
        return panel_Salas;
    }
    
    public JLabel getLabel_Actividades() {
        return label_Actividades;
    }
    
    public JPanel getPanel_Actividades() {
        return panel_Actividades;
    }
    
    public JLabel getLabel_Horarios() {
        return label_Horarios;
    }
    
    public JPanel getPanel_Horarios() {
        return panel_Horarios;
    }
    
    public JLabel getLabel_Clientes() {
        return label_Clientes;
    }
    
    public JPanel getPanel_Clientes() {
        return panel_Clientes;
    }
    
    public JLabel getLabel_Cobro() {
        return label_Cobro;
    }
    
    public JPanel getPanel_Cobro() {
        return panel_Cobro;
    }
    
    public JLabel getLabel_Cuotas() {
        return label_Cuotas;
    }
    
    public JPanel getPanel_Cuotas() {
        return panel_Cuotas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panel_Usuarios = new javax.swing.JPanel();
        label_Usuarios = new javax.swing.JLabel();
        panel_Entrenador = new javax.swing.JPanel();
        label_Entrenador = new javax.swing.JLabel();
        panel_Localizaciones = new javax.swing.JPanel();
        label_Localizaciones = new javax.swing.JLabel();
        panel_Salas = new javax.swing.JPanel();
        label_Salas = new javax.swing.JLabel();
        panel_Actividades = new javax.swing.JPanel();
        label_Actividades = new javax.swing.JLabel();
        panel_Horarios = new javax.swing.JPanel();
        label_Horarios = new javax.swing.JLabel();
        panel_Cobro = new javax.swing.JPanel();
        label_Cobro = new javax.swing.JLabel();
        panel_Clientes = new javax.swing.JPanel();
        label_Clientes = new javax.swing.JLabel();
        panel_Cuotas = new javax.swing.JPanel();
        label_Cuotas = new javax.swing.JLabel();
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

        bg.add(panel_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 200, 50));

        panel_Entrenador.setBackground(new java.awt.Color(66, 65, 69));
        panel_Entrenador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Entrenador.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Entrenador.setForeground(new java.awt.Color(255, 255, 255));
        label_Entrenador.setText("Entrenadores");
        label_Entrenador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_EntrenadorLayout = new javax.swing.GroupLayout(panel_Entrenador);
        panel_Entrenador.setLayout(panel_EntrenadorLayout);
        panel_EntrenadorLayout.setHorizontalGroup(
            panel_EntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EntrenadorLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(label_Entrenador)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panel_EntrenadorLayout.setVerticalGroup(
            panel_EntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Entrenador, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Entrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 200, -1));

        panel_Localizaciones.setBackground(new java.awt.Color(66, 65, 69));
        panel_Localizaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Localizaciones.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Localizaciones.setForeground(new java.awt.Color(255, 255, 255));
        label_Localizaciones.setText("Localizaciones");
        label_Localizaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_LocalizacionesLayout = new javax.swing.GroupLayout(panel_Localizaciones);
        panel_Localizaciones.setLayout(panel_LocalizacionesLayout);
        panel_LocalizacionesLayout.setHorizontalGroup(
            panel_LocalizacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_LocalizacionesLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(label_Localizaciones)
                .addGap(30, 30, 30))
        );
        panel_LocalizacionesLayout.setVerticalGroup(
            panel_LocalizacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Localizaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Localizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 200, -1));

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

        bg.add(panel_Salas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 200, -1));

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

        bg.add(panel_Actividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 200, -1));

        panel_Horarios.setBackground(new java.awt.Color(66, 65, 69));
        panel_Horarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Horarios.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Horarios.setForeground(new java.awt.Color(255, 255, 255));
        label_Horarios.setText("Horarios Actividades");
        label_Horarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_HorariosLayout = new javax.swing.GroupLayout(panel_Horarios);
        panel_Horarios.setLayout(panel_HorariosLayout);
        panel_HorariosLayout.setHorizontalGroup(
            panel_HorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_HorariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_Horarios)
                .addContainerGap())
        );
        panel_HorariosLayout.setVerticalGroup(
            panel_HorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Horarios, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Horarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 200, -1));

        panel_Cobro.setBackground(new java.awt.Color(66, 65, 69));
        panel_Cobro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Cobro.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Cobro.setForeground(new java.awt.Color(255, 255, 255));
        label_Cobro.setText("Cobros");
        label_Cobro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_CobroLayout = new javax.swing.GroupLayout(panel_Cobro);
        panel_Cobro.setLayout(panel_CobroLayout);
        panel_CobroLayout.setHorizontalGroup(
            panel_CobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CobroLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(label_Cobro)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        panel_CobroLayout.setVerticalGroup(
            panel_CobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Cobro, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Cobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 200, -1));

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

        bg.add(panel_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 200, -1));

        panel_Cuotas.setBackground(new java.awt.Color(66, 65, 69));
        panel_Cuotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Cuotas.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Cuotas.setForeground(new java.awt.Color(255, 255, 255));
        label_Cuotas.setText("Cuotas");
        label_Cuotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_CuotasLayout = new javax.swing.GroupLayout(panel_Cuotas);
        panel_Cuotas.setLayout(panel_CuotasLayout);
        panel_CuotasLayout.setHorizontalGroup(
            panel_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CuotasLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(label_Cuotas)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panel_CuotasLayout.setVerticalGroup(
            panel_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Cuotas, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Cuotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 200, -1));

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
        jLabel1.setText("Consulta de:");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

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
    private javax.swing.JLabel label_Cobro;
    private javax.swing.JLabel label_Cuotas;
    private javax.swing.JLabel label_Entrenador;
    private javax.swing.JLabel label_Horarios;
    private javax.swing.JLabel label_Localizaciones;
    private javax.swing.JLabel label_Salas;
    private javax.swing.JLabel label_Usuarios;
    private javax.swing.JPanel panel_Actividades;
    private javax.swing.JPanel panel_CerrarMenu;
    private javax.swing.JPanel panel_Clientes;
    private javax.swing.JPanel panel_Cobro;
    private javax.swing.JPanel panel_Cuotas;
    private javax.swing.JPanel panel_Entrenador;
    private javax.swing.JPanel panel_Horarios;
    private javax.swing.JPanel panel_Localizaciones;
    private javax.swing.JPanel panel_Salas;
    private javax.swing.JPanel panel_Usuarios;
    // End of variables declaration//GEN-END:variables
}
