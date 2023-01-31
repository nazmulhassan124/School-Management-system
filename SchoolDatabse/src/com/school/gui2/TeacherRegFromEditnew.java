
package com.school.gui2;

import com.school.common.IcommonGUI;
import com.school.dao.TeacherRegDAO;

import com.school.model.TeacherReg;
import javax.swing.JOptionPane;


public class TeacherRegFromEditnew extends javax.swing.JFrame implements IcommonGUI {

    TeacherRegDAO teaDAO;
    public TeacherRegFromEditnew() {
        initComponents();
        
        teaDAO = new TeacherRegDAO();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        _teacher_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        _tea_name = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        _dob = new javax.swing.JTextField();
        _mother_name = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        _father_name = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        _mobile = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        _education = new javax.swing.JTextField();
        _present_add = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        _gender = new javax.swing.JComboBox<>();
        _relagion = new javax.swing.JComboBox<>();
        _designation = new javax.swing.JComboBox<>();
        jButton21 = new javax.swing.JButton();
        _nid = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jTextField18 = new javax.swing.JTextField();
        jButton26 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        saveteacher = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1250, 700));
        setPreferredSize(new java.awt.Dimension(1250, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton12.setBackground(new java.awt.Color(102, 102, 255));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Teacher Registration From");
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addGap(405, 405, 405)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(414, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 1250, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _teacher_id.setText("tea");
        _teacher_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _teacher_idActionPerformed(evt);
            }
        });
        jPanel3.add(_teacher_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 12, 295, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Teacher ID");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 11, 131, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Teacher Name");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 52, 131, -1));

        _tea_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _tea_nameActionPerformed(evt);
            }
        });
        jPanel3.add(_tea_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 53, 295, -1));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Designation");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 88, 131, -1));

        _dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _dobActionPerformed(evt);
            }
        });
        jPanel3.add(_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 193, 295, -1));

        _mother_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _mother_nameActionPerformed(evt);
            }
        });
        jPanel3.add(_mother_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 159, 295, -1));

        jButton4.setBackground(new java.awt.Color(51, 51, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Mother Name");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 158, 131, -1));

        jButton5.setBackground(new java.awt.Color(51, 51, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Father Name");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 122, 131, -1));

        _father_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _father_nameActionPerformed(evt);
            }
        });
        jPanel3.add(_father_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 123, 295, -1));

        jButton6.setBackground(new java.awt.Color(51, 51, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Relagion");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 262, 131, -1));

        jButton7.setBackground(new java.awt.Color(51, 51, 255));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Date Of Birth");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 192, 131, -1));

        jButton9.setBackground(new java.awt.Color(51, 51, 255));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Gender");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 296, 131, -1));

        _mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _mobileActionPerformed(evt);
            }
        });
        jPanel3.add(_mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 338, 270, -1));

        jButton10.setBackground(new java.awt.Color(51, 51, 255));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Mobile");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 337, 155, -1));

        _education.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _educationActionPerformed(evt);
            }
        });
        jPanel3.add(_education, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 372, 270, -1));

        _present_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _present_addActionPerformed(evt);
            }
        });
        jPanel3.add(_present_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 408, 270, -1));

        jButton11.setBackground(new java.awt.Color(51, 51, 255));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Present Address");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 407, 155, -1));

        jButton13.setBackground(new java.awt.Color(51, 51, 255));
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Educational Qualification");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 371, 155, -1));

        _gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jPanel3.add(_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 296, 295, -1));

        _relagion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Hindu", "Boddo", "Khirstan", "Others" }));
        jPanel3.add(_relagion, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 263, 295, -1));

        _designation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Assistent teacher", "Senior teacher", "Junior teacher", "Head Teacher", "Assitent Head Teacher" }));
        jPanel3.add(_designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 89, 295, -1));

        jButton21.setBackground(new java.awt.Color(51, 51, 255));
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("NID Number");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 221, 127, -1));

        _nid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _nidActionPerformed(evt);
            }
        });
        jPanel3.add(_nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 222, 295, -1));

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 267, -1));

        jButton22.setBackground(new java.awt.Color(51, 51, 255));
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Join Date");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 155, -1));

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 449, 267, -1));

        jButton26.setBackground(new java.awt.Color(51, 51, 255));
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("Parmanent Address");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 155, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 490, 554));

        jButton19.setBackground(new java.awt.Color(255, 102, 102));
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Cancel");
        jButton19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1136, 478, 73, 33));

        saveteacher.setBackground(new java.awt.Color(255, 51, 102));
        saveteacher.setForeground(new java.awt.Color(255, 255, 255));
        saveteacher.setText("Save");
        saveteacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveteacherActionPerformed(evt);
            }
        });
        jPanel2.add(saveteacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(1018, 478, 100, 33));

        homebtn.setBackground(new java.awt.Color(51, 51, 255));
        homebtn.setForeground(new java.awt.Color(255, 255, 255));
        homebtn.setText("Home");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });
        jPanel2.add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 478, 100, 33));

        jButton25.setBackground(new java.awt.Color(102, 102, 255));
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Teacher Photo");
        jPanel2.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 240, 121, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 116, 1250, 560));

        jLabel4.setText("This proram is created by Nazmul hassan . Student Java programmer ISDB Schoolership progect.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 680, 586, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void _teacher_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__teacher_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__teacher_idActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void _tea_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tea_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__tea_nameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void _dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__dobActionPerformed

    private void _mother_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__mother_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__mother_nameActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void _father_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__father_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__father_nameActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void _mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__mobileActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void _educationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__educationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__educationActionPerformed

    private void _present_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__present_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__present_addActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        // TODO add your handling code here:
        Dashboardnew db = new Dashboardnew ();
        db.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homebtnActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void _nidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__nidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__nidActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void saveteacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveteacherActionPerformed
        // TODO add your handling code here:
       save();
        
    }//GEN-LAST:event_saveteacherActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton19ActionPerformed

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeacherRegFromEditnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherRegFromEditnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherRegFromEditnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherRegFromEditnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherRegFromEditnew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> _designation;
    private javax.swing.JTextField _dob;
    private javax.swing.JTextField _education;
    private javax.swing.JTextField _father_name;
    private javax.swing.JComboBox<String> _gender;
    private javax.swing.JTextField _mobile;
    private javax.swing.JTextField _mother_name;
    private javax.swing.JTextField _nid;
    private javax.swing.JTextField _present_add;
    private javax.swing.JComboBox<String> _relagion;
    private javax.swing.JTextField _tea_name;
    private javax.swing.JTextField _teacher_id;
    private javax.swing.JButton homebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JButton saveteacher;
    // End of variables declaration//GEN-END:variables

    @Override
    public void save() {
       String tea_id= _teacher_id.getText(); //1
       String tea_name= _tea_name.getText(); //2
       String tea_designation= _designation.getSelectedItem().toString(); //3
       String father_name= _father_name.getText(); //4
       String mother_name= _mother_name.getText(); //5
       String tea_dob= _dob.getText(); //6
       String nid= _nid.getText(); //7
       String relagion= _relagion.getSelectedItem().toString(); //8
       String gender= _gender.getSelectedItem().toString(); //9
       String mobile= _mobile.getText(); //10
       String education= _education.getText(); //11
       String present_add= _present_add.getText(); //12
       String parmanent_add= jTextField18.getText(); //13
       String join_date= jTextField17.getText(); //14
       
       TeacherReg treg = new TeacherReg();
       
       treg.setTea_id(tea_id); //1
       treg.setTea_name(tea_name); //2
       treg.setDesignation(tea_designation); //3
       treg.setFather_name(father_name);//4
       treg.setMother_name(mother_name); //5
       treg.setDob(tea_dob); //6
       treg.setNid(nid); //7
       treg.setRelagion(relagion);//8
       treg.setGender(gender);  //9
       treg.setTea_mobile(mobile); //10
       treg.setTea_education(education);//11
       treg.setPresent_add(present_add); //12
       treg.setParmanent_add(parmanent_add);//13
       treg.setJoin_date(join_date); //  14
       
       int status= teaDAO.save(treg);
        if(status > 0){
            JOptionPane.showMessageDialog(rootPane, "Teacher  Saved!");
            reset();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Teacher NOT Saved!");
        }
     
       
       
    }

    @Override
    public void reset() {
        
    }
}
