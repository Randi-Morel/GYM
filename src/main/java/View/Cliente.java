package View;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cliente extends javax.swing.JPanel {

    public Cliente() {
        initComponents();
    }
    
    public javax.swing.JTextField getTID_Cliente() { return TID_Cliente; }
    public javax.swing.JTextField getT_Nombre() { return T_Nombre; }
    public javax.swing.JTextField getT_Apellido1() { return T_Apellido1; }
    public javax.swing.JTextField getT_Apellido2() { return T_Apellido2; }
    public javax.swing.JTextField getT_Direccion() { return T_Direccion; }
    public javax.swing.JTextField getT_Correo() { return T_Correo; }
    public javax.swing.JTextField getT_Telefono() { return T_Telefono; }
    public javax.swing.JTextField getT_Celular() { return T_Celular; }
    public javax.swing.JTextField getT_FechaIngreso() { return T_FechaIngreso; }
    public javax.swing.JTextField getT_FechaNacimiento() { return T_FechaNacimiento; }
    public javax.swing.JTextField getT_Balance() { return T_Balance; }
    public javax.swing.JTextField getT_ValorCuota() { return T_ValorCuota; }
    public javax.swing.JComboBox<String> getCID_EstadoCliente() { return CID_EstadoCliente; }
    public javax.swing.JComboBox<String> getCID_TipoCliente() { return CID_TipoCliente; }

    public JLabel getLabel_Estado() {
        return label_Estado;
    }
    
    public JLabel getLabel_Guardar() {
        return label_Guardar;
    }
    
    public JPanel getPanel_Guardar() {
        return panel_Guardar;
    }
    
    public JLabel getLabel_Eliminar() {
        return label_Eliminar;
    }
    
    public JPanel getPanel_Eliminar() {
        return panel_Eliminar;
    }
    
    public JLabel getLabel_Salir() {
        return label_Salir;
    }
    
    public JPanel getPanel_Salir() {
        return panel_Salir;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TID_Cliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        T_Nombre = new javax.swing.JTextField();
        T_Apellido2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        T_Correo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        panel_Eliminar = new javax.swing.JPanel();
        label_Eliminar = new javax.swing.JLabel();
        panel_Salir = new javax.swing.JPanel();
        label_Salir = new javax.swing.JLabel();
        panel_Guardar = new javax.swing.JPanel();
        label_Guardar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        label_Estado = new javax.swing.JLabel();
        T_Telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        T_Apellido1 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        T_Celular = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        T_Direccion = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        T_FechaNacimiento = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        T_FechaIngreso = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        T_Balance = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        CID_EstadoCliente = new javax.swing.JComboBox<>();
        CID_TipoCliente = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        T_ValorCuota = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("Mantenimiento de Entrenadores:");
        jLabel1.setToolTipText("");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        TID_Cliente.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(TID_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 230, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("*ID_Cliente:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("*Nombre:");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        T_Nombre.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(T_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 230, 30));

        T_Apellido2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(T_Apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 230, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("*Apellido 2:");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setText("*Telefono:");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        T_Correo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(T_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 230, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("Correo:");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));

        panel_Eliminar.setBackground(new java.awt.Color(66, 65, 69));
        panel_Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Eliminar.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        label_Eliminar.setText("Eliminar");
        label_Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_EliminarLayout = new javax.swing.GroupLayout(panel_Eliminar);
        panel_Eliminar.setLayout(panel_EliminarLayout);
        panel_EliminarLayout.setHorizontalGroup(
            panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EliminarLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(label_Eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_EliminarLayout.setVerticalGroup(
            panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 160, -1));

        panel_Salir.setBackground(new java.awt.Color(66, 65, 69));
        panel_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Salir.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Salir.setForeground(new java.awt.Color(255, 255, 255));
        label_Salir.setText("Salir");
        label_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_SalirLayout = new javax.swing.GroupLayout(panel_Salir);
        panel_Salir.setLayout(panel_SalirLayout);
        panel_SalirLayout.setHorizontalGroup(
            panel_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SalirLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(label_Salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_SalirLayout.setVerticalGroup(
            panel_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 160, -1));

        panel_Guardar.setBackground(new java.awt.Color(66, 65, 69));
        panel_Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Guardar.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        label_Guardar.setText("Guardar");
        label_Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_GuardarLayout = new javax.swing.GroupLayout(panel_Guardar);
        panel_Guardar.setLayout(panel_GuardarLayout);
        panel_GuardarLayout.setHorizontalGroup(
            panel_GuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_GuardarLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(label_Guardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_GuardarLayout.setVerticalGroup(
            panel_GuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 160, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 230, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 230, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 230, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 230, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 230, 10));

        label_Estado.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        label_Estado.setText("Creando");
        bg.add(label_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        T_Telefono.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(T_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 230, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("*Apellido 1:");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        T_Apellido1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(T_Apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 230, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 230, 10));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setText("*Celular:");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        T_Celular.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(T_Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 230, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 230, 10));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setText("*Dirección:");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        T_Direccion.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(T_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 230, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 230, 10));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel10.setText("*Fecha de Nacimiento:");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        T_FechaNacimiento.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(T_FechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 230, 30));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 230, 10));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setText("*Fecha de Ingreso:");
        bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        T_FechaIngreso.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(T_FechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 230, 30));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 230, 10));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel12.setText("*Estado Cliente:");
        bg.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 230, 10));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel13.setText("*Tipo de cliente:");
        bg.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, -1));

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 230, 10));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel14.setText("Balance de cliente:");
        bg.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        T_Balance.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(T_Balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 230, 30));

        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 230, 10));

        CID_EstadoCliente.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        CID_EstadoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        bg.add(CID_EstadoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 230, 30));

        CID_TipoCliente.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        CID_TipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Socio Activo", "Socio Inactivo", "Invitado" }));
        bg.add(CID_TipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 230, 30));

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel15.setText("Valor de Cuota:");
        bg.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        T_ValorCuota.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(T_ValorCuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 230, 30));

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 230, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CID_EstadoCliente;
    private javax.swing.JComboBox<String> CID_TipoCliente;
    private javax.swing.JTextField TID_Cliente;
    private javax.swing.JTextField T_Apellido1;
    private javax.swing.JTextField T_Apellido2;
    private javax.swing.JTextField T_Balance;
    private javax.swing.JTextField T_Celular;
    private javax.swing.JTextField T_Correo;
    private javax.swing.JTextField T_Direccion;
    private javax.swing.JTextField T_FechaIngreso;
    private javax.swing.JTextField T_FechaNacimiento;
    private javax.swing.JTextField T_Nombre;
    private javax.swing.JTextField T_Telefono;
    private javax.swing.JTextField T_ValorCuota;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel label_Eliminar;
    private javax.swing.JLabel label_Estado;
    private javax.swing.JLabel label_Guardar;
    private javax.swing.JLabel label_Salir;
    private javax.swing.JPanel panel_Eliminar;
    private javax.swing.JPanel panel_Guardar;
    private javax.swing.JPanel panel_Salir;
    // End of variables declaration//GEN-END:variables
}
