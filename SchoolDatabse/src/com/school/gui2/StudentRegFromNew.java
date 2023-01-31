
package com.school.gui2;

import com.school.common.IcommonGUI;
import com.school.dao.StudentRegDAO;
import com.school.model.StudentReg;
import javax.swing.JOptionPane;



public class StudentRegFromNew extends javax.swing.JFrame  implements IcommonGUI{

    StudentRegDAO stuDAO;
    
    public StudentRegFromNew() {
        initComponents();
        
        stuDAO = new StudentRegDAO();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        reset_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        _stuid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        _stu_name = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        _sfathername = new javax.swing.JTextField();
        _sdob = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        _mother_name = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        _sgeneder = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        _spreadd = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        _par_phonenumber = new javax.swing.JTextField();
        _adddate = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        _sclassname = new javax.swing.JComboBox<>();
        _sgender = new javax.swing.JComboBox<>();
        _sralagion = new javax.swing.JComboBox<>();
        jButton23 = new javax.swing.JButton();
        _spreschname = new javax.swing.JTextField();
        jButton24 = new javax.swing.JButton();
        _f_profesion = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        _smotherpro = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        _classrole = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        _session = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton12.setBackground(new java.awt.Color(51, 102, 255));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Student Admission Form");
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addGap(397, 397, 397)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(422, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 1250, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setBackground(new java.awt.Color(51, 204, 0));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Save");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 470, 73, 33));

        reset_btn.setBackground(new java.awt.Color(102, 204, 0));
        reset_btn.setForeground(new java.awt.Color(255, 255, 255));
        reset_btn.setText("Reset");
        reset_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });
        jPanel2.add(reset_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 470, 73, 33));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _stuid.setText("stu");
        _stuid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _stuidActionPerformed(evt);
            }
        });
        jPanel3.add(_stuid, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 12, 271, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Student Id");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 155, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Student Name");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 155, -1));

        _stu_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _stu_nameActionPerformed(evt);
            }
        });
        jPanel3.add(_stu_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 40, 271, -1));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Father Name");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, 155, -1));

        _sfathername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _sfathernameActionPerformed(evt);
            }
        });
        jPanel3.add(_sfathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 70, 271, -1));

        _sdob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _sdobActionPerformed(evt);
            }
        });
        jPanel3.add(_sdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 271, -1));

        jButton4.setBackground(new java.awt.Color(51, 51, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Date Of Birth");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 155, -1));

        jButton5.setBackground(new java.awt.Color(51, 51, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Mother Name");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, 155, -1));

        _mother_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _mother_nameActionPerformed(evt);
            }
        });
        jPanel3.add(_mother_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 99, 271, -1));

        jButton6.setBackground(new java.awt.Color(51, 51, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Relagion");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 155, -1));

        jButton7.setBackground(new java.awt.Color(51, 51, 255));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Class Name");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 155, -1));

        jButton9.setBackground(new java.awt.Color(51, 51, 255));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Gender");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 155, -1));

        _sgeneder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _sgenederActionPerformed(evt);
            }
        });
        jPanel3.add(_sgeneder, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 260, -1));

        jButton10.setBackground(new java.awt.Color(51, 51, 255));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Present Address");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 159, -1));

        _spreadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _spreaddActionPerformed(evt);
            }
        });
        jPanel3.add(_spreadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 260, -1));

        jButton13.setBackground(new java.awt.Color(51, 51, 255));
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Parmanent Address");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 159, -1));

        jButton15.setBackground(new java.awt.Color(51, 51, 255));
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Addmission Date");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 160, -1));

        _par_phonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _par_phonenumberActionPerformed(evt);
            }
        });
        jPanel3.add(_par_phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 260, -1));

        _adddate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _adddateActionPerformed(evt);
            }
        });
        jPanel3.add(_adddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 260, -1));

        jButton16.setBackground(new java.awt.Color(51, 51, 255));
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Guardian Phone number");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 159, -1));

        _sclassname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre Play", "Play", "Narsary", "One", "Two", "Three", "Four", "Five", "SIx", "Secen", "Eight", "Nine", "Ten" }));
        jPanel3.add(_sclassname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 270, -1));

        _sgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jPanel3.add(_sgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 260, -1));

        _sralagion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Hindu", "Boddo", "Khirstan", "Others" }));
        jPanel3.add(_sralagion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 260, -1));

        jButton23.setBackground(new java.awt.Color(51, 51, 255));
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Previous School Name");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 159, -1));

        _spreschname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _spreschnameActionPerformed(evt);
            }
        });
        jPanel3.add(_spreschname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 260, -1));

        jButton24.setBackground(new java.awt.Color(51, 51, 255));
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Father Profession");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 127, 155, -1));

        _f_profesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _f_profesionActionPerformed(evt);
            }
        });
        jPanel3.add(_f_profesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 128, 271, -1));

        jButton25.setBackground(new java.awt.Color(51, 51, 255));
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Mother Profession");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 156, 155, -1));

        _smotherpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _smotherproActionPerformed(evt);
            }
        });
        jPanel3.add(_smotherpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 157, 271, -1));

        jButton18.setBackground(new java.awt.Color(51, 51, 255));
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Class Roll");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 160, -1));

        _classrole.setText("0");
        _classrole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _classroleActionPerformed(evt);
            }
        });
        jPanel3.add(_classrole, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 260, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 470, 550));

        jButton17.setBackground(new java.awt.Color(51, 51, 255));
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Session");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 110, -1));

        _session.setText("2022");
        _session.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _sessionActionPerformed(evt);
            }
        });
        jPanel2.add(_session, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 118, -1));

        jButton19.setBackground(new java.awt.Color(255, 51, 51));
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Cancel");
        jButton19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 470, 73, 33));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField6.setText("ID");

        jButton20.setBackground(new java.awt.Color(51, 51, 255));
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Search ID");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField6)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 279, -1, -1));

        jButton22.setBackground(new java.awt.Color(102, 102, 255));
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Student Photo");
        jPanel2.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 238, 121, -1));

        jButton26.setBackground(new java.awt.Color(0, 0, 0));
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("Back");
        jButton26.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 470, 73, 33));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 116, 1250, 560));

        jLabel4.setText("This proram is created by Nazmul hassan . Student Java programmer ISDB Schoolership progect.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 680, 586, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void _stuidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__stuidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__stuidActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void _stu_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__stu_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__stu_nameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void _sfathernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__sfathernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__sfathernameActionPerformed

    private void _sdobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__sdobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__sdobActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void _mother_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__mother_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__mother_nameActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void _sgenederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__sgenederActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__sgenederActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void _spreaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__spreaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__spreaddActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void _par_phonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__par_phonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__par_phonenumberActionPerformed

    private void _adddateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__adddateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__adddateActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void _sessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__sessionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__sessionActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void _classroleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__classroleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__classroleActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
       
        this.dispose();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
       save();
       //this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_reset_btnActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void _spreschnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__spreschnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__spreschnameActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void _f_profesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__f_profesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__f_profesionActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void _smotherproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__smotherproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__smotherproActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentRegFromNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegFromNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegFromNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegFromNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegFromNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField _adddate;
    private javax.swing.JTextField _classrole;
    private javax.swing.JTextField _f_profesion;
    private javax.swing.JTextField _mother_name;
    private javax.swing.JTextField _par_phonenumber;
    private javax.swing.JComboBox<String> _sclassname;
    private javax.swing.JTextField _sdob;
    private javax.swing.JTextField _session;
    private javax.swing.JTextField _sfathername;
    private javax.swing.JComboBox<String> _sgender;
    private javax.swing.JTextField _sgeneder;
    private javax.swing.JTextField _smotherpro;
    private javax.swing.JTextField _spreadd;
    private javax.swing.JTextField _spreschname;
    private javax.swing.JComboBox<String> _sralagion;
    private javax.swing.JTextField _stu_name;
    private javax.swing.JTextField _stuid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton reset_btn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void save() {
     int session = Integer.valueOf(_session.getText());  //1
     String stu_id= _stuid.getText();   //2
     String stu_name= _stu_name.getText();         //3
     String stu_fathername= _sfathername.getText(); //4
     String stu_mothername= _mother_name.getText(); //5
     String stu_fpro= _f_profesion.getText();   //6
     String stu_mprofessin= _smotherpro.getText();  //7
     String stu_dob= _sdob.getText();       //8
     String stu_classname= _sclassname.getSelectedItem().toString();    //9
     int stu_roll= Integer.valueOf(_classrole.getText());   //10
     String relagion= _sralagion.getSelectedItem().toString();  //11
     String stu_gender= _sgender.getSelectedItem().toString();  //12
     String stu_presentaddress= _spreadd.getText(); //13
     String stu_paradd= _par_phonenumber.getText(); //14
     String stu_gar_number=_par_phonenumber.getText(); //15
     String stu_addmidate= _adddate.getText(); //16
     String stu_pre_sname= _spreschname.getText(); //17
     
     StudentReg sreg = new StudentReg();
     
     sreg.setSession(session); //1
     sreg.setStu_id(stu_id);  //2
     sreg.setStu_name(stu_name);  //3
     sreg.setFather_name(stu_fathername);  //4
     sreg.setMother_name(stu_mothername);  //5
     sreg.setFather_profession(stu_fpro);  //6
     sreg.setMother_profession(stu_mprofessin);  //7
     sreg.setStu_dob(stu_dob);  //8
     sreg.setClass_name(stu_classname);  //9 
     sreg.setCalss_roll(stu_roll);  //10
     sreg.setRelagion(relagion);  // 11
     sreg.setGender(stu_gender);  //12
     sreg.setPresent_add(stu_presentaddress);  //13 
     
     sreg.setParmanent_add(stu_paradd); // 14
     sreg.setGuardian_number(stu_gar_number);  //15
     sreg.setAddmission_date(stu_addmidate); //16
     sreg.setPre_scl_name(stu_pre_sname);  //17
     
     int status = stuDAO.save(sreg);
        if(status > 0){
            JOptionPane.showMessageDialog(rootPane, "student  Saved!");
            reset();
        }else{
            JOptionPane.showMessageDialog(rootPane, "student NOT Saved!");
        }
     
     
     
     
     
     
     
     
     
    }

    @Override
    public void reset() {
       
        
    }
}
