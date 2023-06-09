/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_result_management_system_project;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class AdminLoginPortal extends javax.swing.JFrame {

    /**
     * Creates new form AdminLoginPortal
     */
    public AdminLoginPortal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ReturnButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        UsernameTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        ShowPasswordButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(214, 248, 54));
        jLabel1.setText("Admin Login Portal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Candara", 3, 18)); // NOI18N
        jLabel2.setText("Username :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 3, 18)); // NOI18N
        jLabel3.setText("Password :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 87, -1));

        ReturnButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ReturnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system_project/icons8-return-16.png"))); // NOI18N
        ReturnButton.setText("Return");
        ReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ReturnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, 30));

        LoginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system_project/icons8-enter-16.png"))); // NOI18N
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 100, 30));
        getContentPane().add(UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 190, 30));
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 190, 30));

        ShowPasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system_project/icons8-show-password.png"))); // NOI18N
        ShowPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ShowPasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 30, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system_project/school_pic2.png"))); // NOI18N
        jLabel4.setText("      ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new HomePage().setVisible(true);
    }//GEN-LAST:event_ReturnButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        String username = UsernameTextField.getText();
        String password = PasswordField.getText();     //to not show password to anyone => getText() is nulled
        
        if(username.equals("admin") && password.equals("pass")) {
            setVisible(false);
            new AdminPortal().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Username or Password is incorrect!");
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void ShowPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordButtonActionPerformed
        // TODO add your handling code here:
        String password = PasswordField.getText();
        
        JOptionPane.showMessageDialog(null, "'"+password+"'");
    }//GEN-LAST:event_ShowPasswordButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLoginPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLoginPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLoginPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLoginPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLoginPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton ReturnButton;
    private javax.swing.JButton ShowPasswordButton;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
