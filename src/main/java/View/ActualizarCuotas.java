package View;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActualizarCuotas extends javax.swing.JPanel {

    public ActualizarCuotas() {
        initComponents();
    }
    
    public com.toedter.calendar.JDateChooser getD_FechaFin() { return D_FechaFin; }
    public com.toedter.calendar.JDateChooser getD_FechaInicio() { return D_FechaInicio; }

    public JLabel getLabel_Actualizar() {
        return label_Actualizar;
    }
    
    public JPanel getPanel_Actualizar() {
        return panel_Actualizar;
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
        jLabel3 = new javax.swing.JLabel();
        panel_Salir = new javax.swing.JPanel();
        label_Salir = new javax.swing.JLabel();
        panel_Actualizar = new javax.swing.JPanel();
        label_Actualizar = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        D_FechaInicio = new com.toedter.calendar.JDateChooser();
        D_FechaFin = new com.toedter.calendar.JDateChooser();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("Actualizar Cobros:");
        jLabel1.setToolTipText("");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("*Fecha Inicial:");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

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

        bg.add(panel_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, 160, -1));

        panel_Actualizar.setBackground(new java.awt.Color(66, 65, 69));
        panel_Actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Actualizar.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        label_Actualizar.setText("Actualizar");
        label_Actualizar.setToolTipText("");
        label_Actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_ActualizarLayout = new javax.swing.GroupLayout(panel_Actualizar);
        panel_Actualizar.setLayout(panel_ActualizarLayout);
        panel_ActualizarLayout.setHorizontalGroup(
            panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ActualizarLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(label_Actualizar)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panel_ActualizarLayout.setVerticalGroup(
            panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(panel_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 160, 50));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 230, 10));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("*Fecha Final:");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 230, 10));

        D_FechaInicio.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(D_FechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 230, 30));

        D_FechaFin.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(D_FechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 230, 30));

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
    private com.toedter.calendar.JDateChooser D_FechaFin;
    private com.toedter.calendar.JDateChooser D_FechaInicio;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel label_Actualizar;
    private javax.swing.JLabel label_Salir;
    private javax.swing.JPanel panel_Actualizar;
    private javax.swing.JPanel panel_Salir;
    // End of variables declaration//GEN-END:variables
}
