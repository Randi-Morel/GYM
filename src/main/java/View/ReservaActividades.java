package View;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ReservaActividades extends javax.swing.JPanel {

    public ReservaActividades() {
        initComponents();
    }
    
    public javax.swing.JTextField getTID_ReservaActividad() { return TID_ReservaActividad; }
    public com.toedter.calendar.JDateChooser getD_FechaReserva() { return D_FechaReserva; }
    public com.toedter.calendar.JDateChooser getD_FechaBaja() { return D_FechaBaja; }
    public javax.swing.JComboBox<String> getCID_Actividad() { return CID_Actividad; }
    public javax.swing.JComboBox<String> getCID_Cliente() { return CID_Cliente; }
    public javax.swing.JComboBox<String> getCID_Horario() { return CID_Horario; }
    public javax.swing.JComboBox<String> getCID_Estado() { return CID_Estado; }

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
        TID_ReservaActividad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panel_Eliminar = new javax.swing.JPanel();
        label_Eliminar = new javax.swing.JLabel();
        panel_Salir = new javax.swing.JPanel();
        label_Salir = new javax.swing.JLabel();
        panel_Guardar = new javax.swing.JPanel();
        label_Guardar = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        label_Estado = new javax.swing.JLabel();
        CID_Actividad = new javax.swing.JComboBox<>();
        D_FechaReserva = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        CID_Cliente = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        CID_Horario = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        CID_Estado = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        D_FechaBaja = new com.toedter.calendar.JDateChooser();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("Mantenimiento de Reservas de Actividades:");
        jLabel1.setToolTipText("");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        TID_ReservaActividad.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(TID_ReservaActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 230, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("*ID_Reserva_Actividad:");
        jLabel2.setToolTipText("");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("*Fecha de Reserva:");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setText("*Actividad:");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

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

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 230, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 230, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 230, 10));

        label_Estado.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        label_Estado.setText("Creando");
        bg.add(label_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        CID_Actividad.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(CID_Actividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 230, 30));

        D_FechaReserva.setFocusable(false);
        D_FechaReserva.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(D_FechaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 230, 30));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setText("*Cliente:");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 230, 10));

        CID_Cliente.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(CID_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 230, 30));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setText("*Horario Reserva:");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 230, 10));

        CID_Horario.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(CID_Horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 230, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel10.setText("*Estado Reserva:");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 230, 10));

        CID_Estado.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(CID_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 230, 30));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setText("*Fecha Baja:");
        bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 230, 10));

        D_FechaBaja.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(D_FechaBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 230, 30));

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
    private javax.swing.JComboBox<String> CID_Actividad;
    private javax.swing.JComboBox<String> CID_Cliente;
    private javax.swing.JComboBox<String> CID_Estado;
    private javax.swing.JComboBox<String> CID_Horario;
    private com.toedter.calendar.JDateChooser D_FechaBaja;
    private com.toedter.calendar.JDateChooser D_FechaReserva;
    private javax.swing.JTextField TID_ReservaActividad;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel label_Eliminar;
    private javax.swing.JLabel label_Estado;
    private javax.swing.JLabel label_Guardar;
    private javax.swing.JLabel label_Salir;
    private javax.swing.JPanel panel_Eliminar;
    private javax.swing.JPanel panel_Guardar;
    private javax.swing.JPanel panel_Salir;
    // End of variables declaration//GEN-END:variables
}
