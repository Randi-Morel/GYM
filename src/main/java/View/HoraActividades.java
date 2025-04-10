package View;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class HoraActividades extends javax.swing.JPanel {

    public HoraActividades() {
        initComponents();
    }
    
    public javax.swing.JTextField getTID_Horario() { return TID_Horario; }
    public javax.swing.JTextField getT_Dia() { return T_Dia; }
    public javax.swing.JTextField getT_Hora() { return T_Hora; }
    public javax.swing.JComboBox<String> getCID_Localizacion() { return CID_Localizacion; }

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
        TID_Horario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        T_Dia = new javax.swing.JTextField();
        T_Hora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panel_Eliminar = new javax.swing.JPanel();
        label_Eliminar = new javax.swing.JLabel();
        panel_Salir = new javax.swing.JPanel();
        label_Salir = new javax.swing.JLabel();
        panel_Guardar = new javax.swing.JPanel();
        label_Guardar = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        label_Estado = new javax.swing.JLabel();
        CID_Localizacion = new javax.swing.JComboBox<>();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("Mantenimiento de Salas:");
        jLabel1.setToolTipText("");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        TID_Horario.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(TID_Horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 230, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("*ID_Horario:");
        jLabel2.setToolTipText("");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("*Día:");
        jLabel3.setToolTipText("");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        T_Dia.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(T_Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 230, 30));

        T_Hora.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(T_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 230, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("*Hora:");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setText("*Localización:");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

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
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 230, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 230, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 230, 10));

        label_Estado.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        label_Estado.setText("Creando");
        bg.add(label_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        CID_Localizacion.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(CID_Localizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 230, 30));

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
    private javax.swing.JComboBox<String> CID_Localizacion;
    private javax.swing.JTextField TID_Horario;
    private javax.swing.JTextField T_Dia;
    private javax.swing.JTextField T_Hora;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel label_Eliminar;
    private javax.swing.JLabel label_Estado;
    private javax.swing.JLabel label_Guardar;
    private javax.swing.JLabel label_Salir;
    private javax.swing.JPanel panel_Eliminar;
    private javax.swing.JPanel panel_Guardar;
    private javax.swing.JPanel panel_Salir;
    // End of variables declaration//GEN-END:variables
}
