package Pantallas;

import Conexion.connbd;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.*;
import javax.swing.JOptionPane;

public class pantalla_ingreso extends javax.swing.JFrame {
int x,y; 

    public pantalla_ingreso() {
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        usertxt.requestFocus();
        barup.setBackground(Color.LIGHT_GRAY); 
        jPanel1.setBackground(Color.decode("#c0c0c0"));
        barup.setOpaque(true); 
    }
    
    void limpiar(){
        usertxt.setText(null);
        passtxt.setText(null);
    }
    
    
   void accesar (String usertxt, String passtxt) {
    String cap=" ";
    String usr= " ";
    String ape= " ";
    String sql = "CALL acceso ('"+usertxt+"','"+passtxt+"')";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
               
                cap=rs.getString("tipo");
                usr=rs.getString("nombre");
                ape=rs.getString("apellido");
            }
            if(cap.equals("Administrador")){
                this.setVisible(false);
                JOptionPane.showMessageDialog(null,"Bienvenido "+usr+" "+ape);
                Menu ingreso = new Menu();
                ingreso.setVisible(true);
            }
            if(cap.equals("Usuario")){
                this.setVisible(false);
                JOptionPane.showMessageDialog(null,"Bienvenido(a) "+usr+" "+ape);
                Usuario.userMenu ingreso2 = new Usuario.userMenu();
                ingreso2.setVisible(true);
                               
            }
            if((!cap.equals("Administrador"))&&(!cap.equals("Usuario"))){
                JOptionPane.showMessageDialog(null,"Error de Acceso");
                limpiar();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex+" Datos de acceso erroneos");
        }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        usertxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passtxt = new javax.swing.JPasswordField();
        okbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        barup = new javax.swing.JPanel();
        btnclose = new javax.swing.JButton();
        btnmin = new javax.swing.JButton();
        lblico = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acceso");
        setBackground(new java.awt.Color(204, 204, 204));
        setIconImage(getIconImage());
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acceso al Sistema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N

        usertxt.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Usuario");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel4.setText("Contraseña");

        passtxt.setFont(passtxt.getFont());

        okbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/right_circular.png"))); // NOI18N
        okbtn.setContentAreaFilled(false);
        okbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okbtnMouseClicked(evt);
            }
        });
        okbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtnActionPerformed(evt);
            }
        });
        okbtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                okbtnKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/newuser.png"))); // NOI18N
        jLabel1.setText("Registrarse");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(passtxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usertxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(okbtn)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))))
        );

        barup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barupMousePressed(evt);
            }
        });
        barup.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barupMouseDragged(evt);
            }
        });

        btnclose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close copia.png"))); // NOI18N
        btnclose.setContentAreaFilled(false);
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        btnmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minus copia.png"))); // NOI18N
        btnmin.setContentAreaFilled(false);
        btnmin.setFocusPainted(false);
        btnmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminActionPerformed(evt);
            }
        });

        lblico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_ico.png"))); // NOI18N

        javax.swing.GroupLayout barupLayout = new javax.swing.GroupLayout(barup);
        barup.setLayout(barupLayout);
        barupLayout.setHorizontalGroup(
            barupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barupLayout.createSequentialGroup()
                .addComponent(lblico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnmin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barupLayout.setVerticalGroup(
            barupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barupLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(barupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmin)
                    .addComponent(btnclose)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okbtnMouseClicked
        String usuario=usertxt.getText();
        String password = new String(passtxt.getPassword());
        accesar (usuario,password);
        if(usuario.equalsIgnoreCase("Administrador"))
        Menu.usrconn.setText(usuario);
        else
        Usuario.userMenu.connuser.setText(usuario);
    }//GEN-LAST:event_okbtnMouseClicked

    private void okbtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_okbtnKeyPressed
        String usuario=usertxt.getText();
        String password = new String(passtxt.getPassword());
        accesar (usuario,password);
        if(usuario.equalsIgnoreCase("Administrador"))
        Menu.usrconn.setText(usuario);
        else
        Usuario.userMenu.connuser.setText(usuario);
       
    }//GEN-LAST:event_okbtnKeyPressed

    private void okbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okbtnActionPerformed

    private void barupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barupMousePressed
        x = evt.getX  ()  ; 
        y = evt.getY ()  ;
    }//GEN-LAST:event_barupMousePressed

    private void barupMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barupMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation()   ; 
        setLocation(point.x - x, point.y - y);
        /*if (point != null) 
            setOpacity(0.5f);
        else
            setOpacity(1f);*/
    }//GEN-LAST:event_barupMouseDragged

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminActionPerformed
                setExtendedState(ICONIFIED); 
    }//GEN-LAST:event_btnminActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
  
    }//GEN-LAST:event_formMouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        //Registrarse
                this.setVisible(false);
                //JOptionPane.showMessageDialog(null,"Bienvenido "+usr+" "+ape);
                Registro reg = new Registro();
                reg.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantalla_ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new pantalla_ingreso().setVisible(true);
            }
        });
    }
//    @Override
//    public Image getIconImage() {
//        Image retValue = Toolkit.getDefaultToolkit().
//                getImage(ClassLoader.getSystemResource("resources/imagenes/logo.png"));
//
//
//        return retValue;
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barup;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblico;
    private javax.swing.JButton okbtn;
    private javax.swing.JPasswordField passtxt;
    public static javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
    connbd cc= new connbd();
    Connection cn= cc.conexion();
}
