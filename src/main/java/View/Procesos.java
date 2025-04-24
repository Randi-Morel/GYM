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
    
    public JLabel getLabel_GenerarCobro() {
        return label_GenerarCobro;
    }
    
    public JPanel getPanel_GenerarCobro() {
        return panel_GenerarCobro;
    }
    
    public JLabel getLabel_ActualizarCuota() {
        return label_ActualizarCuota;
    }
    
    public JPanel getPanel_ActualizarCuota() {
        return panel_ActualizarCuota;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panel_GenerarCobro = new javax.swing.JPanel();
        label_GenerarCobro = new javax.swing.JLabel();
        panel_ActualizarCuota = new javax.swing.JPanel();
        label_ActualizarCuota = new javax.swing.JLabel();
        panel_CerrarMenu = new javax.swing.JPanel();
        label_CerrarMenu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_GenerarCobro.setBackground(new java.awt.Color(66, 65, 69));
        panel_GenerarCobro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_GenerarCobro.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_GenerarCobro.setForeground(new java.awt.Color(255, 255, 255));
        label_GenerarCobro.setText("Generar Cobro");
        label_GenerarCobro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_GenerarCobroLayout = new javax.swing.GroupLayout(panel_GenerarCobro);
        panel_GenerarCobro.setLayout(panel_GenerarCobroLayout);
        panel_GenerarCobroLayout.setHorizontalGroup(
            panel_GenerarCobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_GenerarCobroLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(label_GenerarCobro)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panel_GenerarCobroLayout.setVerticalGroup(
            panel_GenerarCobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_GenerarCobro, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_GenerarCobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 200, -1));

        panel_ActualizarCuota.setBackground(new java.awt.Color(66, 65, 69));
        panel_ActualizarCuota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_ActualizarCuota.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_ActualizarCuota.setForeground(new java.awt.Color(255, 255, 255));
        label_ActualizarCuota.setText("Actualizar Cuotas");
        label_ActualizarCuota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_ActualizarCuotaLayout = new javax.swing.GroupLayout(panel_ActualizarCuota);
        panel_ActualizarCuota.setLayout(panel_ActualizarCuotaLayout);
        panel_ActualizarCuotaLayout.setHorizontalGroup(
            panel_ActualizarCuotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ActualizarCuotaLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(label_ActualizarCuota)
                .addGap(18, 18, 18))
        );
        panel_ActualizarCuotaLayout.setVerticalGroup(
            panel_ActualizarCuotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_ActualizarCuota, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_ActualizarCuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 200, -1));

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
        jLabel1.setText("Procesos:");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

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
    private javax.swing.JLabel label_ActualizarCuota;
    private javax.swing.JLabel label_CerrarMenu;
    private javax.swing.JLabel label_GenerarCobro;
    private javax.swing.JPanel panel_ActualizarCuota;
    private javax.swing.JPanel panel_CerrarMenu;
    private javax.swing.JPanel panel_GenerarCobro;
    // End of variables declaration//GEN-END:variables
}
