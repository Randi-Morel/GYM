package View;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }
     
    public JLabel getLabel_Mantenimientos() {
        return label_Mantenimientos;
    }
    
    public JPanel getPanel_Mantenimientos() {
        return panel_Mantenimientos;
    }
    
    public JLabel getLabel_Procesos() {
        return label_Procesos;
    }
    
    public JPanel getPanel_Procesos() {
        return panel_Procesos;
    }
    
    public JLabel getLabel_Consultas() {
        return label_Consultas;
    }
    
    public JPanel getPanel_Consultas() {
        return panel_Consultas;
    }
    
     public JLabel getLabel_Movimientos() {
        return label_Movimientos;
    }
    
    public JPanel getPanel_Movimientos() {
        return panel_Movimientos;
    }

    public JPanel getPanel_ControlPantallas() {
        return panel_ControlPantallas;
    }
    
    public JLabel getLabel_Imagen() {
        return label_Imagen;
    }
    
    public JLabel getLabel_CerrarSesion() {
        return label_CerrarSesion;
    }
    
    public JPanel getPanel_CerrarSesion() {
        return panel_CerrarSesion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panel_Mantenimientos = new javax.swing.JPanel();
        label_Mantenimientos = new javax.swing.JLabel();
        panel_Movimientos = new javax.swing.JPanel();
        label_Movimientos = new javax.swing.JLabel();
        panel_Procesos = new javax.swing.JPanel();
        label_Procesos = new javax.swing.JLabel();
        panel_CerrarSesion = new javax.swing.JPanel();
        label_CerrarSesion = new javax.swing.JLabel();
        panel_Consultas = new javax.swing.JPanel();
        label_Consultas = new javax.swing.JLabel();
        panel_ControlPantallas = new javax.swing.JPanel();
        label_Imagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setBackground(new java.awt.Color(22, 23, 25));
        setResizable(false);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(22, 23, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GYM1_resized_230x230.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menu");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        panel_Mantenimientos.setBackground(new java.awt.Color(66, 65, 69));
        panel_Mantenimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Mantenimientos.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Mantenimientos.setForeground(new java.awt.Color(255, 255, 255));
        label_Mantenimientos.setText("Mantenimientos");
        label_Mantenimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_MantenimientosLayout = new javax.swing.GroupLayout(panel_Mantenimientos);
        panel_Mantenimientos.setLayout(panel_MantenimientosLayout);
        panel_MantenimientosLayout.setHorizontalGroup(
            panel_MantenimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_MantenimientosLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(label_Mantenimientos)
                .addGap(20, 20, 20))
        );
        panel_MantenimientosLayout.setVerticalGroup(
            panel_MantenimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Mantenimientos, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panel_Movimientos.setBackground(new java.awt.Color(66, 65, 69));
        panel_Movimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Movimientos.setMaximumSize(new java.awt.Dimension(182, 35));
        panel_Movimientos.setMinimumSize(new java.awt.Dimension(182, 35));

        label_Movimientos.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Movimientos.setForeground(new java.awt.Color(255, 255, 255));
        label_Movimientos.setText("Movimientos");
        label_Movimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_MovimientosLayout = new javax.swing.GroupLayout(panel_Movimientos);
        panel_Movimientos.setLayout(panel_MovimientosLayout);
        panel_MovimientosLayout.setHorizontalGroup(
            panel_MovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MovimientosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(label_Movimientos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_MovimientosLayout.setVerticalGroup(
            panel_MovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Movimientos, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panel_Procesos.setBackground(new java.awt.Color(66, 65, 69));
        panel_Procesos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Procesos.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Procesos.setForeground(new java.awt.Color(255, 255, 255));
        label_Procesos.setText("Procesos");
        label_Procesos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_ProcesosLayout = new javax.swing.GroupLayout(panel_Procesos);
        panel_Procesos.setLayout(panel_ProcesosLayout);
        panel_ProcesosLayout.setHorizontalGroup(
            panel_ProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ProcesosLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(label_Procesos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_ProcesosLayout.setVerticalGroup(
            panel_ProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Procesos, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panel_CerrarSesion.setBackground(new java.awt.Color(66, 65, 69));
        panel_CerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_CerrarSesion.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        label_CerrarSesion.setText("Cerrar Sesión");
        label_CerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_CerrarSesionLayout = new javax.swing.GroupLayout(panel_CerrarSesion);
        panel_CerrarSesion.setLayout(panel_CerrarSesionLayout);
        panel_CerrarSesionLayout.setHorizontalGroup(
            panel_CerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CerrarSesionLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(label_CerrarSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_CerrarSesionLayout.setVerticalGroup(
            panel_CerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_CerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panel_Consultas.setBackground(new java.awt.Color(66, 65, 69));
        panel_Consultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_Consultas.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        label_Consultas.setForeground(new java.awt.Color(255, 255, 255));
        label_Consultas.setText("Consultas");
        label_Consultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_ConsultasLayout = new javax.swing.GroupLayout(panel_Consultas);
        panel_Consultas.setLayout(panel_ConsultasLayout);
        panel_ConsultasLayout.setHorizontalGroup(
            panel_ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ConsultasLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(label_Consultas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_ConsultasLayout.setVerticalGroup(
            panel_ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Consultas, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel_Mantenimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Consultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Movimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Procesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_CerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(panel_Mantenimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(panel_Movimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(panel_Procesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(panel_Consultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(panel_CerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 700));

        panel_ControlPantallas.setBackground(new java.awt.Color(255, 255, 255));
        panel_ControlPantallas.setToolTipText("");

        label_Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/zeus_600x600.png"))); // NOI18N
        label_Imagen.setToolTipText("");

        javax.swing.GroupLayout panel_ControlPantallasLayout = new javax.swing.GroupLayout(panel_ControlPantallas);
        panel_ControlPantallas.setLayout(panel_ControlPantallasLayout);
        panel_ControlPantallasLayout.setHorizontalGroup(
            panel_ControlPantallasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ControlPantallasLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(label_Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        panel_ControlPantallasLayout.setVerticalGroup(
            panel_ControlPantallasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ControlPantallasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60))
        );

        bg.add(panel_ControlPantallas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 800, 640));

        jPanel2.setBackground(new java.awt.Color(22, 23, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 800, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_CerrarSesion;
    private javax.swing.JLabel label_Consultas;
    private javax.swing.JLabel label_Imagen;
    private javax.swing.JLabel label_Mantenimientos;
    private javax.swing.JLabel label_Movimientos;
    private javax.swing.JLabel label_Procesos;
    private javax.swing.JLabel label_Usuarios1;
    private javax.swing.JLabel label_Usuarios2;
    private javax.swing.JLabel label_Usuarios4;
    private javax.swing.JLabel label_Usuarios5;
    private javax.swing.JPanel panel_CerrarSesion;
    private javax.swing.JPanel panel_Consultas;
    private javax.swing.JPanel panel_ControlPantallas;
    private javax.swing.JPanel panel_Mantenimientos;
    private javax.swing.JPanel panel_Movimientos;
    private javax.swing.JPanel panel_Procesos;
    private javax.swing.JPanel panel_Usuarios1;
    private javax.swing.JPanel panel_Usuarios2;
    private javax.swing.JPanel panel_Usuarios4;
    private javax.swing.JPanel panel_Usuarios5;
    // End of variables declaration//GEN-END:variables
}
