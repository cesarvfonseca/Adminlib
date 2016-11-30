package Pantallas;

import Conexion.ImagenFondo;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Menu extends javax.swing.JFrame {
  
    public Menu() {
        //setUndecorated(true);
        initComponents();
        escritorio.setBorder(new ImagenFondo());
        //this.setExtendedState(Menu.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
    }
    void Calendario(){
         Calendar cal = Calendar.getInstance();
         cal.getTime();
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
         txtfecha.setText(sdf.format(cal.getTime()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        usrconn = new javax.swing.JLabel();
        txtfecha = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jclose = new javax.swing.JMenuItem();
        jout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        prestamos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Bienvenido:");

        usrconn.setBackground(new java.awt.Color(204, 204, 204));
        usrconn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        usrconn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        txtfecha.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        txtfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtfecha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtfecha.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtfechaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        hora.setFont(new java.awt.Font("Century Gothic", 1, 35)); // NOI18N
        hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hora.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        hora.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                horaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(hora, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addComponent(txtfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usrconn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(787, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap(492, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usrconn, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(usrconn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtfecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(hora, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuBar1MousePressed(evt);
            }
        });
        jMenuBar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseDragged(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sys_en.png"))); // NOI18N
        jMenu1.setText("Sistema");

        jclose.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/signout.png"))); // NOI18N
        jclose.setText("Cerrar Sesion");
        jclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcloseActionPerformed(evt);
            }
        });
        jMenu1.add(jclose);

        jout.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close_2.png"))); // NOI18N
        jout.setText("Salir");
        jout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joutActionPerformed(evt);
            }
        });
        jMenu1.add(jout);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/box.png"))); // NOI18N
        jMenu2.setText("Administrar");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user copia.png"))); // NOI18N
        jMenuItem1.setText("Usuarios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);
        jMenuItem1.getAccessibleContext().setAccessibleName("Alta de Clientes");

        jMenuItem2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book_2.png"))); // NOI18N
        jMenuItem2.setText("Libros");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);
        jMenuItem2.getAccessibleContext().setAccessibleDescription("l");

        prestamos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        prestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/date_p copia.png"))); // NOI18N
        prestamos.setText("Prestamos");
        prestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamosActionPerformed(evt);
            }
        });
        jMenu2.add(prestamos);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
    }//GEN-LAST:event_jMenu2ActionPerformed
    
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //Mostrar Ventana Clientes
        Clientes ac = new Clientes();
        escritorio.add(ac);
        ac.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void joutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joutActionPerformed
        this.dispose();
    }//GEN-LAST:event_joutActionPerformed

    private void jcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcloseActionPerformed
        pantalla_ingreso principal= new pantalla_ingreso();
        principal.setVisible(true);
        principal.pack();
        this.setVisible(false);
    }//GEN-LAST:event_jcloseActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //Mostrar Ventana Libros
        Libros lib = new Libros();
        escritorio.add(lib);
        lib.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtfechaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtfechaAncestorAdded
        Calendario();
    }//GEN-LAST:event_txtfechaAncestorAdded

    private void prestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamosActionPerformed
         //Mostrar Ventana Prestamos
        aPrestamos pr = new aPrestamos();
        escritorio.add(pr);
        pr.show();
    }//GEN-LAST:event_prestamosActionPerformed

    private void horaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_horaAncestorAdded
                new reloj();
    }//GEN-LAST:event_horaAncestorAdded

    private void jMenuBar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MousePressed

    }//GEN-LAST:event_jMenuBar1MousePressed

    private void jMenuBar1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseDragged

    }//GEN-LAST:event_jMenuBar1MouseDragged

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    public static javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jclose;
    private javax.swing.JMenuItem jout;
    private javax.swing.JMenuItem prestamos;
    private javax.swing.JLabel txtfecha;
    public static javax.swing.JLabel usrconn;
    // End of variables declaration//GEN-END:variables
}
