/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_;

import javax.swing.JPanel;

/**
 *
 * @author MY_PC
 */
public class studentForm extends javax.swing.JFrame {

    /**
     * Creates new form studentForm
     */
    public studentForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        studentPaymentL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        studentRegistationL = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 52, 54));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(230, 230, 230));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_management_127px.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 140, 110));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(230, 230, 230));
        jLabel7.setText("NSBM");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 120, 60));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("-");
        jLabel22.setToolTipText("minimize");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 30, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("X");
        jLabel23.setToolTipText("close");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 30, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(230, 230, 230));
        jLabel9.setText("Student.Pay.Mgt System");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 170, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 270));

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 52, 54));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentPaymentL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_cash_in_hand_127px.png"))); // NOI18N
        studentPaymentL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentPaymentLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentPaymentLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studentPaymentLMouseExited(evt);
            }
        });
        jPanel4.add(studentPaymentL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 140, 150));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Payments");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 100, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 230, 200));

        jPanel3.setBackground(new java.awt.Color(51, 52, 54));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentRegistationL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_registration_127px.png"))); // NOI18N
        studentRegistationL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentRegistationLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentRegistationLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studentRegistationLMouseExited(evt);
            }
        });
        jPanel3.add(studentRegistationL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 140, 150));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registration");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 100, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 230, 200));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_home_50px.png"))); // NOI18N
        jLabel13.setToolTipText("Home");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jLabel13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel13KeyPressed(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1090, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        this.setState(studentForm.ICONIFIED);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        setColor(jPanel3);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void studentRegistationLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentRegistationLMouseEntered
        setColor(jPanel3);
    }//GEN-LAST:event_studentRegistationLMouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        resetColor(jPanel3);
    }//GEN-LAST:event_jPanel3MouseExited

    private void studentRegistationLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentRegistationLMouseExited
        resetColor(jPanel3);
    }//GEN-LAST:event_studentRegistationLMouseExited

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        resetColor(jPanel4);
    }//GEN-LAST:event_jPanel4MouseExited

    private void studentPaymentLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentPaymentLMouseExited
        resetColor(jPanel4);
    }//GEN-LAST:event_studentPaymentLMouseExited

    private void studentPaymentLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentPaymentLMouseEntered
        setColor(jPanel4);
    }//GEN-LAST:event_studentPaymentLMouseEntered

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        setColor(jPanel4);
    }//GEN-LAST:event_jPanel4MouseEntered

    private void studentPaymentLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentPaymentLMouseClicked
        studentPaymentForm studentPaymentForm = new studentPaymentForm();
        studentPaymentForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_studentPaymentLMouseClicked

    private void studentRegistationLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentRegistationLMouseClicked
        studentRegistrationForm strf = new studentRegistrationForm();
        strf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_studentRegistationLMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        studentRegistrationForm strf = new studentRegistrationForm();
        strf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        studentPaymentForm studentPaymentForm = new studentPaymentForm();
        studentPaymentForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        System_Main sm = new System_Main();
        sm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel13KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13KeyPressed

    public void setColor(JPanel panel) {

        panel.setBackground(new java.awt.Color(100, 100, 104));
    }

    public void resetColor(JPanel panel) {

        panel.setBackground(new java.awt.Color(51, 52, 54));
    }

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
            java.util.logging.Logger.getLogger(studentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel studentPaymentL;
    private javax.swing.JLabel studentRegistationL;
    // End of variables declaration//GEN-END:variables
}
