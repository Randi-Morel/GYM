package View;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Movimientos extends javax.swing.JPanel {

    public Movimientos() {
        initComponents();
    }
    
    public javax.swing.JTextField getTID_Cuota() { return TID_Cuota; }
    public javax.swing.JTextField getTID_Cliente() { return TID_Cliente; }
    public javax.swing.JTextField getT_ClienteNombre() { return T_ClienteNombre; }
    public javax.swing.JTextField getT_ClienteApellido() { return T_ClienteApellido; }
    public javax.swing.JTextField getT_ValorCobro() { return T_ValorCobro; }
    public com.toedter.calendar.JDateChooser getD_FechaCuota() { return D_FechaCuota; }
    public javax.swing.JTable getGRD() { return GRD; }

    public JLabel getLabel_Estado() {
        return label_Estado;
    }
    
    public JLabel getLabel_Guardar() {
        return label_Guardar;
    }
    
    public JPanel getPanel_Guardar() {
        return panel_Guardar;
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
        TID_Cuota = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panel_Salir = new javax.swing.JPanel();
        label_Salir = new javax.swing.JLabel();
        panel_Guardar = new javax.swing.JPanel();
        label_Guardar = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        label_Estado = new javax.swing.JLabel();
        D_FechaCuota = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        GRD = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        TID_Cliente = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        T_ClienteNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        T_ClienteApellido = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        T_ValorCobro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("Movimientos:");
        jLabel1.setToolTipText("");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        TID_Cuota.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(TID_Cuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 230, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("*ID_Cuota:");
        jLabel2.setToolTipText("");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("*Fecha de Movimiento:");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

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

        bg.add(panel_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 160, 50));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 230, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 230, 10));

        label_Estado.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        label_Estado.setText("Creando");
        bg.add(label_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        D_FechaCuota.setEnabled(false);
        D_FechaCuota.setFocusable(false);
        D_FechaCuota.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        bg.add(D_FechaCuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 230, 30));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setText("*Nombre:");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 230, 10));

        GRD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Cuota", "Secuencia", "Concepto", "Valor", "ID_Cobro", "Seleccionados"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
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

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 780, 310));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("*ID_Cliente:");
        jLabel4.setToolTipText("");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        TID_Cliente.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(TID_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 230, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 230, 10));

        T_ClienteNombre.setEditable(false);
        T_ClienteNombre.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(T_ClienteNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 230, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("*Apellido:");
        jLabel6.setToolTipText("");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        T_ClienteApellido.setEditable(false);
        T_ClienteApellido.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(T_ClienteApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 230, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 230, 10));

        T_ValorCobro.setEditable(false);
        T_ValorCobro.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bg.add(T_ValorCobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 230, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setText("Valor del cobro:");
        jLabel7.setToolTipText("");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 230, 10));

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
    private com.toedter.calendar.JDateChooser D_FechaCuota;
    private javax.swing.JTable GRD;
    private javax.swing.JTextField TID_Cliente;
    private javax.swing.JTextField TID_Cuota;
    private javax.swing.JTextField T_ClienteApellido;
    private javax.swing.JTextField T_ClienteNombre;
    private javax.swing.JTextField T_ValorCobro;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel label_Estado;
    private javax.swing.JLabel label_Guardar;
    private javax.swing.JLabel label_Salir;
    private javax.swing.JPanel panel_Guardar;
    private javax.swing.JPanel panel_Salir;
    // End of variables declaration//GEN-END:variables
}
