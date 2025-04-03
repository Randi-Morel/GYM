package View;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public Login() {
        initComponents();
    }
    
    public JTextField getT_Usuario() {
        return T_Usuario;
    }

    public JPasswordField getTP_Contrasena() {
        return TP_Contrasena;
    }
    
    public JLabel getLabel_IniciarSesion() {
        return label_IniciarSesion;
    }
    
    public JLabel getLabel_Salir() {
        return label_Salir;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        label_Image = new javax.swing.JLabel();
        label_Inicio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        T_Usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        TP_Contrasena = new javax.swing.JPasswordField();
        panel_Salir = new javax.swing.JPanel();
        label_Salir = new javax.swing.JLabel();
        panel_Salir1 = new javax.swing.JPanel();
        label_IniciarSesion = new javax.swing.JLabel();
        panel_Superior = new javax.swing.JPanel();
        label_Salir2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        setIconImages(null);
        setLocationByPlatform(true);
        setUndecorated(true);
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
            .addComponent(label_Image, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label_Image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 230));

        label_Inicio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        label_Inicio.setText("INICIAR SESIÓN");
        bg.add(label_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("Usuario:");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        T_Usuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        T_Usuario.setText("Admin");
        T_Usuario.setBorder(null);
        bg.add(T_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 270, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 270, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 270, 10));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        TP_Contrasena.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TP_Contrasena.setText("Admin123");
        TP_Contrasena.setToolTipText("");
        TP_Contrasena.setBorder(null);
        bg.add(TP_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 270, -1));

        panel_Salir.setBackground(new java.awt.Color(22, 23, 25));
        panel_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Salir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        label_Salir.setForeground(new java.awt.Color(255, 255, 255));
        label_Salir.setText("SALIR");
        label_Salir.setAlignmentY(0.0F);
        label_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_SalirLayout = new javax.swing.GroupLayout(panel_Salir);
        panel_Salir.setLayout(panel_SalirLayout);
        panel_SalirLayout.setHorizontalGroup(
            panel_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SalirLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(label_Salir)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panel_SalirLayout.setVerticalGroup(
            panel_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        bg.add(panel_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 119, 23));

        panel_Salir1.setBackground(new java.awt.Color(22, 23, 25));
        panel_Salir1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label_IniciarSesion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        label_IniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        label_IniciarSesion.setText("INICIAR SESIÓN");
        label_IniciarSesion.setAlignmentY(0.0F);
        label_IniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_Salir1Layout = new javax.swing.GroupLayout(panel_Salir1);
        panel_Salir1.setLayout(panel_Salir1Layout);
        panel_Salir1Layout.setHorizontalGroup(
            panel_Salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Salir1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_IniciarSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_Salir1Layout.setVerticalGroup(
            panel_Salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_IniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        bg.add(panel_Salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 120, -1));

        panel_Superior.setBackground(new java.awt.Color(51, 51, 51));
        panel_Superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_SuperiorMouseDragged(evt);
            }
        });
        panel_Superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_SuperiorMousePressed(evt);
            }
        });

        label_Salir2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        label_Salir2.setForeground(new java.awt.Color(255, 255, 255));
        label_Salir2.setText("X");
        label_Salir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_Salir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_Salir2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_SuperiorLayout = new javax.swing.GroupLayout(panel_Superior);
        panel_Superior.setLayout(panel_SuperiorLayout);
        panel_SuperiorLayout.setHorizontalGroup(
            panel_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_SuperiorLayout.createSequentialGroup()
                .addContainerGap(515, Short.MAX_VALUE)
                .addComponent(label_Salir2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panel_SuperiorLayout.setVerticalGroup(
            panel_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_SuperiorLayout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(label_Salir2))
        );

        bg.add(panel_Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 560, 50));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panel_SuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_SuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panel_SuperiorMousePressed

    private void panel_SuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_SuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panel_SuperiorMouseDragged

    private void label_Salir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_Salir2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_label_Salir2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TP_Contrasena;
    private javax.swing.JTextField T_Usuario;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_Image;
    private javax.swing.JLabel label_IniciarSesion;
    private javax.swing.JLabel label_Inicio;
    private javax.swing.JLabel label_Salir;
    private javax.swing.JLabel label_Salir2;
    private javax.swing.JPanel panel_Salir;
    private javax.swing.JPanel panel_Salir1;
    private javax.swing.JPanel panel_Superior;
    // End of variables declaration//GEN-END:variables
}
