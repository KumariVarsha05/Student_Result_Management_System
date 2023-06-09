/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_result_management_system_project;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class InsertResult extends javax.swing.JFrame {

    /**
     * Creates new form InsertResult
     */
    public InsertResult() {
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

        jPanel1 = new javax.swing.JPanel();
        addNewStudentButton = new javax.swing.JButton();
        insertNewResultButton = new javax.swing.JButton();
        registeredStudentsButton = new javax.swing.JButton();
        allStudentResultsButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rollNumberTextField = new javax.swing.JTextField();
        mathMarksTextField = new javax.swing.JTextField();
        microControllerMarksTextField = new javax.swing.JTextField();
        microProcessorMarksTextField = new javax.swing.JTextField();
        compArchMarksTextField = new javax.swing.JTextField();
        sigSysMarksTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        addNewStudentButton.setBackground(new java.awt.Color(102, 0, 153));
        addNewStudentButton.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 13)); // NOI18N
        addNewStudentButton.setForeground(new java.awt.Color(255, 255, 255));
        addNewStudentButton.setText("Add New Student");
        addNewStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewStudentButtonActionPerformed(evt);
            }
        });

        insertNewResultButton.setBackground(new java.awt.Color(102, 255, 255));
        insertNewResultButton.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 13)); // NOI18N
        insertNewResultButton.setText("Insert New Result");
        insertNewResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNewResultButtonActionPerformed(evt);
            }
        });

        registeredStudentsButton.setBackground(new java.awt.Color(102, 0, 153));
        registeredStudentsButton.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 13)); // NOI18N
        registeredStudentsButton.setForeground(new java.awt.Color(255, 255, 255));
        registeredStudentsButton.setText("Registered Students");
        registeredStudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registeredStudentsButtonActionPerformed(evt);
            }
        });

        allStudentResultsButton.setBackground(new java.awt.Color(102, 0, 153));
        allStudentResultsButton.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 13)); // NOI18N
        allStudentResultsButton.setForeground(new java.awt.Color(255, 255, 255));
        allStudentResultsButton.setText("All Student Results");
        allStudentResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allStudentResultsButtonActionPerformed(evt);
            }
        });

        logOutButton.setBackground(new java.awt.Color(0, 0, 0));
        logOutButton.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(255, 255, 255));
        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addNewStudentButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(insertNewResultButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(registeredStudentsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(allStudentResultsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(addNewStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(insertNewResultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(registeredStudentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(allStudentResultsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("Mathematics :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 137, 138, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("MicroController :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 195, 138, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Roll Number :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 59, 138, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("Comp. Architecture :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 311, 138, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("MicroProcessor :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 253, 138, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setText("Signal and Systems :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 368, 138, -1));

        rollNumberTextField.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        getContentPane().add(rollNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 56, 150, -1));

        mathMarksTextField.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        getContentPane().add(mathMarksTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 134, 150, -1));

        microControllerMarksTextField.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        getContentPane().add(microControllerMarksTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 192, 150, -1));

        microProcessorMarksTextField.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        getContentPane().add(microProcessorMarksTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 150, -1));

        compArchMarksTextField.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        getContentPane().add(compArchMarksTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 308, 150, -1));

        sigSysMarksTextField.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        getContentPane().add(sigSysMarksTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 365, 150, -1));

        submitButton.setBackground(java.awt.SystemColor.control);
        submitButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system_project/icons8-submit-document-32.png"))); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 422, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 560, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewStudentButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AddNewStudent().setVisible(true);
    }//GEN-LAST:event_addNewStudentButtonActionPerformed

    private void insertNewResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNewResultButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new InsertResult().setVisible(true);
    }//GEN-LAST:event_insertNewResultButtonActionPerformed

    private void registeredStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registeredStudentsButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new RegisteredStudents().setVisible(true);
    }//GEN-LAST:event_registeredStudentsButtonActionPerformed

    private void allStudentResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allStudentResultsButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AllStudentResults().setVisible(true);
    }//GEN-LAST:event_allStudentResultsButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdminLoginPortal().setVisible(true);
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String rollno = rollNumberTextField.getText();
        String math = mathMarksTextField.getText();
        String microcontroller = microControllerMarksTextField.getText();
        String microprocessor = microProcessorMarksTextField.getText();
        String compArch = compArchMarksTextField.getText();
        String sigSys = sigSysMarksTextField.getText();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srm","root","varshaK@05");
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student where rollno='"+rollno+"'");
            if(rs.next()) {
                st.executeUpdate("insert into result(rollno, mathematics, microcontroller, microprocessor, compArch, signalSystems) values('"+rollno+"','"+math+"','"+microcontroller+"','"+microprocessor+"','"+compArch+"','"+sigSys+"')");
            
                JOptionPane.showMessageDialog(null, "Data submitted.");
                
                setVisible(false);
                new InsertResult().setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Student is not registered!");
            }
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_submitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InsertResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewStudentButton;
    private javax.swing.JButton allStudentResultsButton;
    private javax.swing.JTextField compArchMarksTextField;
    private javax.swing.JButton insertNewResultButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logOutButton;
    private javax.swing.JTextField mathMarksTextField;
    private javax.swing.JTextField microControllerMarksTextField;
    private javax.swing.JTextField microProcessorMarksTextField;
    private javax.swing.JButton registeredStudentsButton;
    private javax.swing.JTextField rollNumberTextField;
    private javax.swing.JTextField sigSysMarksTextField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
