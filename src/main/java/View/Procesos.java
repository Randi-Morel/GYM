package View;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Procesos extends javax.swing.JPanel {

    public Procesos() {
        initComponents();
    }
    
    public JLabel getLabel_CerrarMenu() {
        return label_CerrarMenu;
    }
    
    public JPanel getPanel_CerrarMenu() {
        return panel_CerrarMenu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panel_Usuarios5 = new javax.swing.JPanel();
        label_Usuarios5 = new javax.swing.JLabel();
        panel_Usuarios6 = new javax.swing.JPanel();
        label_Usuarios6 = new javax.swing.JLabel();
        panel_Usuarios7 = new javax.swing.JPanel();
        label_Usuarios7 = new javax.swing.JLabel();
        panel_CerrarMenu = new javax.swing.JPanel();
        label_CerrarMenu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Usuarios5.setBackground(new java.awt.Color(66, 65, 69));
        panel_Usuarios5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Usuarios5.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Usuarios5.setForeground(new java.awt.Color(255, 255, 255));
        label_Usuarios5.setText("Generar Cobro");
        label_Usuarios5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_Usuarios5Layout = new javax.swing.GroupLayout(panel_Usuarios5);
        panel_Usuarios5.setLayout(panel_Usuarios5Layout);
        panel_Usuarios5Layout.setHorizontalGroup(
            panel_Usuarios5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Usuarios5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(label_Usuarios5)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panel_Usuarios5Layout.setVerticalGroup(
            panel_Usuarios5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Usuarios5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Usuarios5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 200, -1));

        panel_Usuarios6.setBackground(new java.awt.Color(66, 65, 69));
        panel_Usuarios6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Usuarios6.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Usuarios6.setForeground(new java.awt.Color(255, 255, 255));
        label_Usuarios6.setText("Reservar Cobro");
        label_Usuarios6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_Usuarios6Layout = new javax.swing.GroupLayout(panel_Usuarios6);
        panel_Usuarios6.setLayout(panel_Usuarios6Layout);
        panel_Usuarios6Layout.setHorizontalGroup(
            panel_Usuarios6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Usuarios6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(label_Usuarios6)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panel_Usuarios6Layout.setVerticalGroup(
            panel_Usuarios6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Usuarios6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Usuarios6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 200, -1));

        panel_Usuarios7.setBackground(new java.awt.Color(66, 65, 69));
        panel_Usuarios7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Usuarios7.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Usuarios7.setForeground(new java.awt.Color(255, 255, 255));
        label_Usuarios7.setText("Actualizar Cuotas");
        label_Usuarios7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_Usuarios7Layout = new javax.swing.GroupLayout(panel_Usuarios7);
        panel_Usuarios7.setLayout(panel_Usuarios7Layout);
        panel_Usuarios7Layout.setHorizontalGroup(
            panel_Usuarios7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Usuarios7Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(label_Usuarios7)
                .addGap(18, 18, 18))
        );
        panel_Usuarios7Layout.setVerticalGroup(
            panel_Usuarios7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Usuarios7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Usuarios7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 200, -1));

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
        jLabel1.setText("Mantenimientos:");
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
    private javax.swing.JLabel label_CerrarMenu;
    private javax.swing.JLabel label_Usuarios5;
    private javax.swing.JLabel label_Usuarios6;
    private javax.swing.JLabel label_Usuarios7;
    private javax.swing.JPanel panel_CerrarMenu;
    private javax.swing.JPanel panel_Usuarios5;
    private javax.swing.JPanel panel_Usuarios6;
    private javax.swing.JPanel panel_Usuarios7;
    // End of variables declaration//GEN-END:variables
}
