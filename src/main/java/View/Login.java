package View;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        label_Image = new javax.swing.JLabel();
        label_Inicio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GYM1_resized_230x230.png"))); // NOI18N
        label_Image.setText("jLabel1");
        label_Image.setMaximumSize(new java.awt.Dimension(230, 230));
        label_Image.setMinimumSize(new java.awt.Dimension(230, 230));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 230));

        label_Inicio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        label_Inicio.setText("INICIAR SESIÓN");
        bg.add(label_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("Usuario:");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jTextField1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField1.setText("nombre");
        jTextField1.setBorder(null);
        bg.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 270, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 270, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 270, 10));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.setText("123456");
        jPasswordField1.setToolTipText("");
        jPasswordField1.setBorder(null);
        bg.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 270, -1));

        jButton1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButton1.setText("INICIAR SESIÓN");
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        jButton2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButton2.setText("SALIR");
        bg.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_Image;
    private javax.swing.JLabel label_Inicio;
    // End of variables declaration//GEN-END:variables
}
