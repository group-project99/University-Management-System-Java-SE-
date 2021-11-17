/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_;

import Entity_.User;
import Service_.UserService;
import View_.subInterf.noUserFound;
import View_.subInterf.oneOrMoreFieldEmpty_;
import View_.subInterf.passwordWrong;
import java.awt.Color;

public class login extends javax.swing.JFrame {

    User u;
    UserService us = new UserService();

    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel7.setVisible(false);
        signupBtn.setEnabled(false);
        visible.setVisible(false);
        visible1.setVisible(false);
        u = new User();

    }

    public void lnclear() {
        usernametxt.setText("");
        passwordtxt.setText("");
        usernametxt.requestFocus();
    }

    public void clear() // clear Sign up frame details
    {
        signunametxt.setText("");
        signpwtxt.setText("");
        signemailtxt.setText("");
        termcheck.setSelected(false);
        signupBtn.setEnabled(false);
        signunametxt.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        passwordtxt = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        invisible1 = new javax.swing.JLabel();
        visible1 = new javax.swing.JLabel();
        loginBtn1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        signunametxt = new javax.swing.JTextField();
        signpwtxt = new javax.swing.JPasswordField();
        signemailtxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        signupBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        signInlbl = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        invisiblelbl = new javax.swing.JLabel();
        visible = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        termcheck = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(102, 0, 102));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0,70));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 540));

        jPanel1.setBackground(new java.awt.Color(51, 52, 54));
        jPanel1.setForeground(new java.awt.Color(51, 52, 54));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        usernametxt.setBackground(new java.awt.Color(51, 52, 54));
        usernametxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        usernametxt.setForeground(new java.awt.Color(204, 204, 204));
        usernametxt.setToolTipText("enter username");
        usernametxt.setBorder(null);
        usernametxt.setCaretColor(new java.awt.Color(255, 255, 255));
        usernametxt.setOpaque(false);
        usernametxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernametxtFocusGained(evt);
            }
        });
        usernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametxtActionPerformed(evt);
            }
        });
        jPanel1.add(usernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 270, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 270, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 270, 20));

        passwordtxt.setBackground(new java.awt.Color(51, 52, 54));
        passwordtxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordtxt.setForeground(new java.awt.Color(204, 204, 204));
        passwordtxt.setToolTipText("enter password");
        passwordtxt.setBorder(null);
        passwordtxt.setOpaque(false);
        passwordtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordtxtFocusGained(evt);
            }
        });
        jPanel1.add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 270, 40));

        jLabel2.setBackground(new java.awt.Color(51, 51, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(57, 113, 177));
        jLabel2.setText("User Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        loginBtn.setBackground(new java.awt.Color(126, 87, 194));
        loginBtn.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setToolTipText("Press for LogIn");
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 270, 40));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("-");
        jLabel20.setToolTipText("minimize");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 30, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("X");
        jLabel21.setToolTipText("close");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 30, 30));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Log In");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        invisible1.setForeground(new java.awt.Color(204, 204, 204));
        invisible1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_invisible_25px.png"))); // NOI18N
        invisible1.setText(" Show Password");
        invisible1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invisible1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invisible1MouseClicked(evt);
            }
        });
        jPanel1.add(invisible1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        visible1.setForeground(new java.awt.Color(204, 204, 204));
        visible1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_eye_25px.png"))); // NOI18N
        visible1.setText(" Show Password");
        visible1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visible1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visible1MouseClicked(evt);
            }
        });
        jPanel1.add(visible1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        loginBtn1.setBackground(new java.awt.Color(126, 87, 194));
        loginBtn1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        loginBtn1.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn1.setText("Login as a Guest");
        loginBtn1.setToolTipText("Press for LogIn");
        loginBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtn1MouseClicked(evt);
            }
        });
        loginBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 270, 40));

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 500, 540));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iHackers (255).jpg"))); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -150, 690, 750));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 540));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(51, 52, 54));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setBackground(new java.awt.Color(0, 153, 255));
        jLabel19.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("X");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1222, 10, 20, -1));
        jPanel5.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 270, 20));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 270, 20));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 270, 20));

        signunametxt.setBackground(new java.awt.Color(51, 52, 54));
        signunametxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        signunametxt.setForeground(new java.awt.Color(204, 204, 204));
        signunametxt.setToolTipText("enter username");
        signunametxt.setBorder(null);
        signunametxt.setCaretColor(new java.awt.Color(255, 255, 255));
        signunametxt.setOpaque(false);
        signunametxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signunametxtFocusGained(evt);
            }
        });
        jPanel5.add(signunametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 270, 40));

        signpwtxt.setBackground(new java.awt.Color(51, 52, 54));
        signpwtxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        signpwtxt.setForeground(new java.awt.Color(204, 204, 204));
        signpwtxt.setToolTipText("enter email");
        signpwtxt.setBorder(null);
        signpwtxt.setOpaque(false);
        signpwtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signpwtxtFocusGained(evt);
            }
        });
        jPanel5.add(signpwtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 270, 40));

        signemailtxt.setBackground(new java.awt.Color(51, 52, 54));
        signemailtxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        signemailtxt.setForeground(new java.awt.Color(204, 204, 204));
        signemailtxt.setToolTipText("enter password");
        signemailtxt.setBorder(null);
        signemailtxt.setCaretColor(new java.awt.Color(255, 255, 255));
        signemailtxt.setOpaque(false);
        signemailtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signemailtxtFocusGained(evt);
            }
        });
        jPanel5.add(signemailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 270, 40));

        jLabel10.setBackground(new java.awt.Color(51, 51, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(57, 113, 177));
        jLabel10.setText("User Name");
        jLabel10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel10FocusGained(evt);
            }
        });
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel11.setBackground(new java.awt.Color(51, 51, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 58, 97));
        jLabel11.setText("Email");
        jLabel11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel11FocusGained(evt);
            }
        });
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        signupBtn.setBackground(new java.awt.Color(126, 87, 194));
        signupBtn.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(255, 255, 255));
        signupBtn.setText("Sign Up");
        signupBtn.setToolTipText("Press for SignUp");
        signupBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });
        jPanel5.add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 270, 40));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Already do you have an Account,");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 240, -1));

        jLabel14.setBackground(new java.awt.Color(51, 51, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 58, 97));
        jLabel14.setText("Password");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        signInlbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        signInlbl.setForeground(new java.awt.Color(255, 255, 255));
        signInlbl.setText("Sign In ?");
        signInlbl.setToolTipText("SignIn");
        signInlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInlblMouseClicked(evt);
            }
        });
        jPanel5.add(signInlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 100, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Sign Up");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("or sign in");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        invisiblelbl.setForeground(new java.awt.Color(204, 204, 204));
        invisiblelbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_invisible_25px.png"))); // NOI18N
        invisiblelbl.setText(" Show Password");
        invisiblelbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invisiblelbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invisiblelblMouseClicked(evt);
            }
        });
        jPanel5.add(invisiblelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        visible.setForeground(new java.awt.Color(204, 204, 204));
        visible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_eye_25px.png"))); // NOI18N
        visible.setText(" Show Password");
        visible.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visibleMouseClicked(evt);
            }
        });
        jPanel5.add(visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("-");
        jLabel27.setToolTipText("minimize");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 30, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("X");
        jLabel28.setToolTipText("close");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 30, 30));

        jPanel7.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 500, 540));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0,70));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,170));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setForeground(new java.awt.Color(220, 220, 220));
        jLabel9.setText("admin...");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel16.setForeground(new java.awt.Color(220, 220, 220));
        jLabel16.setText("to access a as a member of your");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel15.setForeground(new java.awt.Color(220, 220, 220));
        jLabel15.setText("and check it wether you have");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel7.setForeground(new java.awt.Color(220, 220, 220));
        jLabel7.setText("your email and you mustwatch");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel13.setForeground(new java.awt.Color(220, 220, 220));
        jLabel13.setText("it send a verification code to  ");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel8.setForeground(new java.awt.Color(220, 220, 220));
        jLabel8.setText("If enter your email address,");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(220, 220, 220));
        jLabel3.setText("ATTENTION !");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(220, 220, 220));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 120, 20));

        termcheck.setForeground(new java.awt.Color(255, 255, 255));
        termcheck.setText("I agree all this terms");
        termcheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        termcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termcheckActionPerformed(evt);
            }
        });
        jPanel2.add(termcheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_contacts_64px.png"))); // NOI18N
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 70));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 260, 280));

        jPanel7.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 540));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iHackers (255).jpg"))); // NOI18N
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -100, 610, 650));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 540));

        setSize(new java.awt.Dimension(969, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signInlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInlblMouseClicked
        // TODO add your handling code here:
        jPanel7.setVisible(false);
        jPanel6.setVisible(true);
        usernametxt.requestFocus();
    }//GEN-LAST:event_signInlblMouseClicked

    private void termcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termcheckActionPerformed
        // TODO add your handling code here:

        if (termcheck.isSelected() == true) {

            signupBtn.setEnabled(true);
        } else {

            signupBtn.setEnabled(false);
        }
    }//GEN-LAST:event_termcheckActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseClicked

    private void usernametxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernametxtFocusGained
        // TODO add your handling code here:
        jLabel2.setForeground(new Color(57, 113, 177));
        jLabel1.setForeground(new Color(45, 45, 45));

    }//GEN-LAST:event_usernametxtFocusGained

    private void usernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametxtActionPerformed

    private void passwordtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordtxtFocusGained
        // TODO add your handling code here:
        jLabel2.setForeground(new Color(45, 45, 45));
        jLabel1.setForeground(new Color(57, 113, 177));
    }//GEN-LAST:event_passwordtxtFocusGained

    private void jLabel10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel10FocusGained
        // TODO add your handling code here:


    }//GEN-LAST:event_jLabel10FocusGained

    private void jLabel11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel11FocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel11FocusGained

    private void signunametxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signunametxtFocusGained
        // TODO add your handling code here:
        jLabel10.setForeground(new Color(57, 113, 177));
        jLabel11.setForeground(new Color(45, 45, 45));
        jLabel14.setForeground(new Color(45, 45, 45));
    }//GEN-LAST:event_signunametxtFocusGained

    private void signpwtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signpwtxtFocusGained
        // TODO add your handling code here:
        jLabel10.setForeground(new Color(45, 45, 45));
        jLabel14.setForeground(new Color(57, 113, 177));
        jLabel11.setForeground(new Color(45, 45, 45));
    }//GEN-LAST:event_signpwtxtFocusGained

    private void signemailtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signemailtxtFocusGained
        // TODO add your handling code here:
        jLabel10.setForeground(new Color(45, 45, 45));
        jLabel14.setForeground(new Color(45, 45, 45));
        jLabel11.setForeground(new Color(57, 113, 177));
    }//GEN-LAST:event_signemailtxtFocusGained

    private void visibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visibleMouseClicked
        // TODO add your handling code here:
        invisiblelbl.setVisible(true);
        visible.setVisible(false);

        signpwtxt.setEchoChar('*');

    }//GEN-LAST:event_visibleMouseClicked

    private void invisiblelblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invisiblelblMouseClicked
        // TODO add your handling code here:
        visible.setVisible(true);
        invisiblelbl.setVisible(false);
        signpwtxt.setEchoChar((char) 0);

    }//GEN-LAST:event_invisiblelblMouseClicked

    private void invisible1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invisible1MouseClicked
        // TODO add your handling code here:
        visible1.setVisible(true);
        invisible1.setVisible(false);
        passwordtxt.setEchoChar((char) 0);
    }//GEN-LAST:event_invisible1MouseClicked

    private void visible1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visible1MouseClicked
        // TODO add your handling code here:
        visible1.setVisible(false);
        invisible1.setVisible(true);
        passwordtxt.setEchoChar('*');
    }//GEN-LAST:event_visible1MouseClicked

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        char[] pw = passwordtxt.getPassword();
        String psw = String.valueOf(pw);
        u.setUsername(usernametxt.getText());
        us.login(u);
        if (usernametxt.getText().equals("") || psw.equals("")) {
            oneOrMoreFieldEmpty_ var = new oneOrMoreFieldEmpty_();
            var.setVisible(true);
        } else if (!us.checkuserbyUname(usernametxt.getText())) {
            noUserFound var = new noUserFound();
            var.setVisible(true);
        } else if (!u.getPassword().equals(psw)) {
            passwordWrong var = new passwordWrong();
            var.setVisible(true);
        } else {
            signupSuccessfully var = new signupSuccessfully();
            var.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_loginBtnActionPerformed

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed

        clear();
    }//GEN-LAST:event_signupBtnActionPerformed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        this.setState(login.ICONIFIED);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel28MouseClicked

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnMouseClicked

    private void loginBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn1MouseClicked

    private void loginBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtn1ActionPerformed

        signupSuccessfullyGuest var = new signupSuccessfullyGuest();
        var.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel invisible1;
    private javax.swing.JLabel invisiblelbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton loginBtn1;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JLabel signInlbl;
    private javax.swing.JTextField signemailtxt;
    private javax.swing.JPasswordField signpwtxt;
    private javax.swing.JTextField signunametxt;
    private javax.swing.JButton signupBtn;
    private javax.swing.JCheckBox termcheck;
    private javax.swing.JTextField usernametxt;
    private javax.swing.JLabel visible;
    private javax.swing.JLabel visible1;
    // End of variables declaration//GEN-END:variables

}
