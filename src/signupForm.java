/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class signupForm extends javax.swing.JFrame {

    /**
     * Creates new form signupForm
     */
    public signupForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSignUp1 = new javax.swing.JPanel();
        loginFormCreateNewAccount = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        jPanelSignUp2 = new javax.swing.JPanel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButtonLoginCancel = new javax.swing.JButton();
        jButtonLogin1 = new javax.swing.JButton();
        jLabelCreateAccount = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabelConfirmPass = new javax.swing.JLabel();
        jPasswordFieldConfirmPassword = new javax.swing.JPasswordField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelPhoto = new javax.swing.JLabel();
        jLabelPhoto1 = new javax.swing.JLabel();
        jButtonBrowse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelSignUp1.setBackground(new java.awt.Color(92, 219, 149));

        loginFormCreateNewAccount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        loginFormCreateNewAccount.setForeground(new java.awt.Color(255, 255, 255));
        loginFormCreateNewAccount.setText("Create New Account");

        jLabelClose.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(5, 56, 107));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMinimize.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabelMinimize.setForeground(new java.awt.Color(5, 56, 107));
        jLabelMinimize.setText("-");
        jLabelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelSignUp1Layout = new javax.swing.GroupLayout(jPanelSignUp1);
        jPanelSignUp1.setLayout(jPanelSignUp1Layout);
        jPanelSignUp1Layout.setHorizontalGroup(
            jPanelSignUp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSignUp1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(loginFormCreateNewAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelSignUp1Layout.setVerticalGroup(
            jPanelSignUp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSignUp1Layout.createSequentialGroup()
                .addGroup(jPanelSignUp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSignUp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSignUp1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(loginFormCreateNewAccount)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanelSignUp2.setBackground(new java.awt.Color(55, 150, 131));

        jLabelFirstName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelFirstName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFirstName.setText("First Name:");

        jLabelPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Password:");

        jPasswordFieldPassword.setBackground(new java.awt.Color(237, 245, 225));
        jPasswordFieldPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordFieldPassword.setForeground(new java.awt.Color(5, 56, 107));

        jButtonLoginCancel.setBackground(new java.awt.Color(5, 56, 107));
        jButtonLoginCancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonLoginCancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLoginCancel.setText("Cancel");

        jButtonLogin1.setBackground(new java.awt.Color(142, 228, 175));
        jButtonLogin1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonLogin1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin1.setText("Create");

        jLabelCreateAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCreateAccount.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCreateAccount.setText("Click here to login");
        jLabelCreateAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCreateAccountMouseClicked(evt);
            }
        });

        jLabelUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsername.setText("Username:");

        jLabelLastName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelLastName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLastName.setText("Last Name:");

        jTextFieldUsername.setBackground(new java.awt.Color(237, 245, 225));
        jTextFieldUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldUsername.setForeground(new java.awt.Color(5, 56, 107));
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });

        jLabelConfirmPass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelConfirmPass.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConfirmPass.setText("Confirm Pass:");

        jPasswordFieldConfirmPassword.setBackground(new java.awt.Color(237, 245, 225));
        jPasswordFieldConfirmPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordFieldConfirmPassword.setForeground(new java.awt.Color(5, 56, 107));

        jTextFieldFirstName.setBackground(new java.awt.Color(237, 245, 225));
        jTextFieldFirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldFirstName.setForeground(new java.awt.Color(5, 56, 107));
        jTextFieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFirstNameActionPerformed(evt);
            }
        });

        jTextFieldLastName.setBackground(new java.awt.Color(237, 245, 225));
        jTextFieldLastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldLastName.setForeground(new java.awt.Color(5, 56, 107));
        jTextFieldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastNameActionPerformed(evt);
            }
        });

        jLabelPhoto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPhoto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPhoto.setText("Photo:");

        jLabelPhoto1.setBackground(new java.awt.Color(237, 245, 225));
        jLabelPhoto1.setForeground(new java.awt.Color(237, 245, 225));
        jLabelPhoto1.setOpaque(true);

        jButtonBrowse.setBackground(new java.awt.Color(142, 228, 175));
        jButtonBrowse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonBrowse.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBrowse.setText("Browse");
        jButtonBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrowseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSignUp2Layout = new javax.swing.GroupLayout(jPanelSignUp2);
        jPanelSignUp2.setLayout(jPanelSignUp2Layout);
        jPanelSignUp2Layout.setHorizontalGroup(
            jPanelSignUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSignUp2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelSignUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSignUp2Layout.createSequentialGroup()
                        .addGroup(jPanelSignUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSignUp2Layout.createSequentialGroup()
                                .addComponent(jLabelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelSignUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelSignUp2Layout.createSequentialGroup()
                                    .addComponent(jLabelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSignUp2Layout.createSequentialGroup()
                                    .addGroup(jPanelSignUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanelSignUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                        .addComponent(jTextFieldUsername)))))
                        .addContainerGap())
                    .addGroup(jPanelSignUp2Layout.createSequentialGroup()
                        .addGroup(jPanelSignUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelConfirmPass)
                            .addComponent(jLabelPhoto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelSignUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSignUp2Layout.createSequentialGroup()
                                .addComponent(jPasswordFieldConfirmPassword)
                                .addGap(168, 168, 168))
                            .addGroup(jPanelSignUp2Layout.createSequentialGroup()
                                .addGroup(jPanelSignUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanelSignUp2Layout.createSequentialGroup()
                                        .addComponent(jButtonLoginCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelPhoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBrowse)
                                .addGap(0, 79, Short.MAX_VALUE))))))
            .addGroup(jPanelSignUp2Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabelCreateAccount)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelSignUp2Layout.setVerticalGroup(
            jPanelSignUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSignUp2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelSignUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFirstName)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanelSignUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLastName)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelSignUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUsername)
                    .addGroup(jPanelSignUp2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSignUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword))
                .addGap(18, 18, 18)
                .addGroup(jPanelSignUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConfirmPass)
                    .addComponent(jPasswordFieldConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSignUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSignUp2Layout.createSequentialGroup()
                        .addGap(0, 54, Short.MAX_VALUE)
                        .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(jPanelSignUp2Layout.createSequentialGroup()
                        .addComponent(jButtonBrowse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelSignUp2Layout.createSequentialGroup()
                        .addComponent(jLabelPhoto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35)))
                .addGroup(jPanelSignUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLoginCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabelCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSignUp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelSignUp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelSignUp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanelSignUp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        this.setState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLabelCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCreateAccountMouseClicked
        signupForm supf = new signupForm();
        supf.setVisible(true);
        supf.pack();
        supf.setLocationRelativeTo(null);
        supf.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelCreateAccountMouseClicked

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jTextFieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFirstNameActionPerformed

    private void jTextFieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastNameActionPerformed

    private void jButtonBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBrowseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBrowseActionPerformed

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
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBrowse;
    private javax.swing.JButton jButtonLogin1;
    private javax.swing.JButton jButtonLoginCancel;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelConfirmPass;
    private javax.swing.JLabel jLabelCreateAccount;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JLabel jLabelPhoto1;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanelSignUp1;
    private javax.swing.JPanel jPanelSignUp2;
    private javax.swing.JPasswordField jPasswordFieldConfirmPassword;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JLabel loginFormCreateNewAccount;
    // End of variables declaration//GEN-END:variables
}
