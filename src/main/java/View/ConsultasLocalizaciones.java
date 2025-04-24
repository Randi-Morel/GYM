package View;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConsultasLocalizaciones extends javax.swing.JPanel {

    public ConsultasLocalizaciones() {
        initComponents();
    }
    
    public javax.swing.JTextField getT_Buscar() { return T_Buscar; }
    public javax.swing.JComboBox<String> getC_Filtro() { return C_Filtro; }
    public javax.swing.JTable getGRD() { return GRD; }

    public JLabel getLabel_Limpiar() {
        return label_Limpiar;
    }
    
    public JPanel getPanel_Limpiar() {
        return panel_Limpiar;
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
        T_Buscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        panel_Salir = new javax.swing.JPanel();
        label_Salir = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        GRD = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        C_Filtro = new javax.swing.JComboBox<>();
        panel_Limpiar = new javax.swing.JPanel();
        label_Limpiar = new javax.swing.JLabel();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("Consulta Localizaciones:");
        jLabel1.setToolTipText("");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        T_Buscar.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(T_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 270, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("Buscar:");
        jLabel2.setToolTipText("");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

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

        bg.add(panel_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, 160, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 270, 10));

        GRD.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        GRD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        GRD.setToolTipText("");
        jScrollPane1.setViewportView(GRD);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 780, 380));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setText("*Buscar por:");
        jLabel7.setToolTipText("");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 170, 10));

        C_Filtro.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        C_Filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Descripcion" }));
        bg.add(C_Filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 170, 30));

        panel_Limpiar.setBackground(new java.awt.Color(66, 65, 69));
        panel_Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Limpiar.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Limpiar.setForeground(new java.awt.Color(255, 255, 255));
        label_Limpiar.setText("Limpiar");
        label_Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_LimpiarLayout = new javax.swing.GroupLayout(panel_Limpiar);
        panel_Limpiar.setLayout(panel_LimpiarLayout);
        panel_LimpiarLayout.setHorizontalGroup(
            panel_LimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_LimpiarLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(label_Limpiar)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panel_LimpiarLayout.setVerticalGroup(
            panel_LimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(panel_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 150, -1));

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
    private javax.swing.JComboBox<String> C_Filtro;
    private javax.swing.JTable GRD;
    private javax.swing.JTextField T_Buscar;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel label_Limpiar;
    private javax.swing.JLabel label_Salir;
    private javax.swing.JPanel panel_Limpiar;
    private javax.swing.JPanel panel_Salir;
    // End of variables declaration//GEN-END:variables
}
