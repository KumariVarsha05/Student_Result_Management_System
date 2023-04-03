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
public class AddNewStudent extends javax.swing.JFrame {

    /**
     * Creates new form AddNewStudent
     */
    public AddNewStudent() {
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
        courseNameComboBox = new javax.swing.JComboBox<>();
        branchNameComboBox = new javax.swing.JComboBox<>();
        genderComboBox = new javax.swing.JComboBox<>();
        rollNumberTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        fatherNameTextField = new javax.swing.JTextField();
        CreateButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        addNewStudentButton.setBackground(new java.awt.Color(102, 255, 255));
        addNewStudentButton.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 13)); // NOI18N
        addNewStudentButton.setText("Add New Student");
        addNewStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewStudentButtonActionPerformed(evt);
            }
        });

        insertNewResultButton.setBackground(new java.awt.Color(102, 0, 153));
        insertNewResultButton.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 13)); // NOI18N
        insertNewResultButton.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setText("Course Name :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 110, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setText("Branch Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 110, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("Roll Number :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 110, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setText("Name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 110, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setText("Gender :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 110, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setText("Father's Name :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 120, -1));

        courseNameComboBox.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        courseNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "B.Tech.", "M.Tech." }));
        getContentPane().add(courseNameComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 210, 20));

        branchNameComboBox.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        branchNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "CSE", "IT", "ECE", "EEE" }));
        getContentPane().add(branchNameComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 210, 20));

        genderComboBox.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Male", "Female", "Other" }));
        getContentPane().add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 210, 20));
        getContentPane().add(rollNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 210, 30));
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 210, 30));
        getContentPane().add(fatherNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 210, 30));

        CreateButton.setBackground(java.awt.SystemColor.controlHighlight);
        CreateButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        CreateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system_project/icons8-create-16.png"))); // NOI18N
        CreateButton.setText("Create");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CreateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 107, 30));

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

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        // TODO add your handling code here:
        String course = (String)courseNameComboBox.getSelectedItem();
        String branch = (String)branchNameComboBox.getSelectedItem();
        String rollno = rollNumberTextField.getText();
        String name = nameTextField.getText();
        String gender = (String)genderComboBox.getSelectedItem();
        String fathername = fatherNameTextField.getText();
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srm","root","varshaK@05");
            
            Statement st = con.createStatement();
            st.executeUpdate("insert into student(rollno, course, branch, name, gender, fathername) values('"+rollno+"','"+course+"','"+branch+"','"+name+"','"+gender+"','"+fathername+"')");
            
            JOptionPane.showMessageDialog(null, "Data updated successfully");
            
            setVisible(false);
            new AddNewStudent().setVisible(true);
            
        }
        catch(Exception e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
    }//GEN-LAST:event_CreateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateButton;
    private javax.swing.JButton addNewStudentButton;
    private javax.swing.JButton allStudentResultsButton;
    private javax.swing.JComboBox<String> branchNameComboBox;
    private javax.swing.JComboBox<String> courseNameComboBox;
    private javax.swing.JTextField fatherNameTextField;
    private javax.swing.JComboBox<String> genderComboBox;
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
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton registeredStudentsButton;
    private javax.swing.JTextField rollNumberTextField;
    // End of variables declaration//GEN-END:variables
}
