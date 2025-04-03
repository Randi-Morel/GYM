package View;

public class Usuario extends javax.swing.JPanel {

    public Usuario() {
        initComponents();
    }
    
    public javax.swing.JTextField getTID_Usuario() { return TID_Usuario; }
    public javax.swing.JTextField getT_Nombre() { return T_Nombre; }
    public javax.swing.JTextField getT_Apellidos() { return T_Apellidos; }
    public javax.swing.JPasswordField getT_Contrasena() { return T_Contrasena; }
    public javax.swing.JTextField getT_Correo() { return T_Correo; }
    public javax.swing.JTextField getT_NivelAcceso() { return T_NivelAcceso; }
    public javax.swing.JButton getBtnGuardar() { return btnGuardar; }
    public javax.swing.JButton getBtnEliminar() {
        return btnEliminar;
    }
    public javax.swing.JButton getBtnSalir() {
        return btnSalir;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TID_Usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        T_Nombre = new javax.swing.JTextField();
        T_Apellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        T_Contrasena = new javax.swing.JPasswordField();
        T_Correo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        T_NivelAcceso = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("Usuario");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));
        bg.add(TID_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel2.setText("ID Usuario:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel3.setText("*Nombre:");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        T_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_NombreActionPerformed(evt);
            }
        });
        bg.add(T_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 230, -1));
        bg.add(T_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 220, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel4.setText("*Apellidos:");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel7.setText("*Contraseña:");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));
        bg.add(T_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 200, -1));
        bg.add(T_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 250, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel5.setText("Correo:");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel6.setText("*Nivel de acceso:");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));
        bg.add(T_NivelAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 170, -1));

        btnGuardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        bg.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        bg.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        btnSalir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        bg.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void T_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_NombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TID_Usuario;
    private javax.swing.JTextField T_Apellidos;
    private javax.swing.JPasswordField T_Contrasena;
    private javax.swing.JTextField T_Correo;
    private javax.swing.JTextField T_NivelAcceso;
    private javax.swing.JTextField T_Nombre;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
