/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_;

import Entity_.Course;
import Entity_.Register;
import Entity_.Student;
import Service_.CourseService;
import Service_.RegisterService;

/**
 *
 * @author MY_PC
 */
public class freeStructureForm extends javax.swing.JFrame {

    /**
     * Creates new form addNewCoursePaymentForm
     */
   
    Register r;
    private RegisterService rs = new RegisterService();
    
    Course c;
    private CourseService cs = new CourseService();
    
    Student s;
    
    public freeStructureForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
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
        course = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        paymentPlan = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sturecture = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        viewB = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 55));
        jLabel2.setText("Select a course");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 150, -1));

        course.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        course.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selact Course", "BScIT", "BScCV", "BScME", "BScQS", "BBAAF", "BBABA", "BBAMM" }));
        jPanel2.add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 210, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 55));
        jLabel1.setText("Select a payment Plan");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 210, -1));

        paymentPlan.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        paymentPlan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selact Payment Plan", "Plan A", "Plan B", "Plan C", "Plan D" }));
        jPanel2.add(paymentPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 210, -1));

        jPanel3.setBackground(new java.awt.Color(60, 60, 64));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sturecture.setColumns(20);
        sturecture.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        sturecture.setRows(5);
        jScrollPane1.setViewportView(sturecture);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 10, 800, 300));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 820, 320));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_back_arrow_50px.png"))); // NOI18N
        jLabel15.setToolTipText(" Back");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 50, 40));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Structure", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        viewB.setBackground(new java.awt.Color(0, 153, 153));
        viewB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewB.setForeground(new java.awt.Color(255, 255, 255));
        viewB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_view_60px_1.png"))); // NOI18N
        viewB.setToolTipText("view");
        viewB.setAutoscrolls(true);
        viewB.setBorder(null);
        viewB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBActionPerformed(evt);
            }
        });
        jPanel4.add(viewB);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 140, 130, 100));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Academic Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_view_60px.png"))); // NOI18N
        jButton3.setToolTipText("Print");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, 130, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1120, 480));

        jPanel1.setBackground(new java.awt.Color(51, 52, 54));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("X");
        jLabel32.setToolTipText("close");
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 30, 50));

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
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 30, 50));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(230, 230, 230));
        jLabel8.setText("Payment.Structure.Plan");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 510, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(230, 230, 230));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_hierarchy_88px_1.png"))); // NOI18N
        jLabel6.setText("NSBM");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, 90));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(230, 230, 230));
        jLabel7.setText("Student.Pay.Mgt System");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        this.setState(freeStructureForm.ICONIFIED);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel32MouseClicked

    
    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        studentPaymentForm studentPaymentForm=new studentPaymentForm();
        studentPaymentForm.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_jLabel15MouseClicked

    /**
     * generate course details report
     * @param evt 
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        cs.report();    
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * view course fee structure
     * @param evt 
     */
    private void viewBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBActionPerformed
        r = new Register();
        c = new Course();
        s = new Student();

        c.setaCourseName(course.getSelectedItem().toString());
        r.setPaymentPlan(paymentPlan.getSelectedItem().toString());
        
        s.setCourse(c);
        s.setRegister(r);

        sturecture.setText(rs.feeStructure(s));
    }//GEN-LAST:event_viewBActionPerformed

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
            java.util.logging.Logger.getLogger(freeStructureForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(freeStructureForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(freeStructureForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(freeStructureForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new freeStructureForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox course;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox paymentPlan;
    private javax.swing.JTextArea sturecture;
    private javax.swing.JButton viewB;
    // End of variables declaration//GEN-END:variables
}