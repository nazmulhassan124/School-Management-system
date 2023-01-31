
package com.school.gui2;

import com.school.util.DBCconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class TotalTeachertList extends javax.swing.JFrame {

    DefaultTableModel model; 
    public TotalTeachertList() {
        initComponents();
       tealist ();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        total_teacher_list = new javax.swing.JTable();
        Feetch = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1260, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 70));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Total Teacher List");

        total_teacher_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(total_teacher_list);

        Feetch.setText("Refresh");
        Feetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeetchActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(255, 0, 102));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(Feetch, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(452, 452, 452))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(37, 37, 37)
                .addComponent(jButton2)
                .addGap(29, 29, 29)
                .addComponent(Back)
                .addGap(44, 44, 44))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Feetch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1260, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void tealist (){
     model= new DefaultTableModel();
       
        model.addColumn("TEACHER_ID");
        model.addColumn("NAME");
        model.addColumn("DESIGNATION");
        model.addColumn("FATHER_NAME");
        model.addColumn("MOTHER_NAME");
        model.addColumn("BIRTH_DATE");
        model.addColumn("NID");
        model.addColumn("RELAGION");
        model.addColumn("GENDER");
        model.addColumn("MOBILE");
        model.addColumn("EDUCATION");
        model.addColumn("PRESENT_ADDRESS");
        model.addColumn("JOIN_DATE");
        String sql ="select * from teachersnewtable";
        
        try {
        Connection con = DBCconnection.getConnection();
        Statement stmt= con.createStatement();
          ResultSet rs = stmt.executeQuery(sql);
        
           while(rs.next()){
                  //Object[] rowdata = {rs.getString("")}; 
                  
                  String tid = rs.getString("tea_id");
                  String tname = rs.getString("tea_name");
                  String designation = rs.getString("designation");
                  String fname= rs.getString("father_name");
                  String mname = rs.getString("mother_name");
                  String tdob = rs.getString("dob");
                  String tnid = rs.getString("nid");
                  String trelagion = rs.getString("relagion");
                  String tgender = rs.getString("gender");
                  String tmobile = rs.getString("tea_mobile");
                  
                  String teducation = rs.getString("tea_education");
                  String present_add = rs.getString("present_add");
                  String joindate = rs.getString("join_date");
                 Object [] rowData= {tid,tname,designation,fname,mname,tdob,tnid,trelagion,tgender,tmobile,teducation,present_add,joindate};
                 model.addRow(rowData);
        }
       total_teacher_list.setModel(model);
        } catch (Exception e) {
                System.out.println(e);
        }  
    }
    private void FeetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeetchActionPerformed
       
        
// TODO add your handling code here:

 model= new DefaultTableModel();
       
        model.addColumn("TEACHER_ID");
        model.addColumn("NAME");
        model.addColumn("DESIGNATION");
        model.addColumn("FATHER_NAME");
        model.addColumn("MOTHER_NAME");
        model.addColumn("BIRTH_DATE");
        model.addColumn("NID");
        model.addColumn("RELAGION");
        model.addColumn("GENDER");
        model.addColumn("MOBILE");
        model.addColumn("EDUCATION");
        model.addColumn("PRESENT_ADDRESS");
        model.addColumn("JOIN_DATE");
        String sql ="select * from teachersnewtable";
        
        try {
        Connection con = DBCconnection.getConnection();
        Statement stmt= con.createStatement();
          ResultSet rs = stmt.executeQuery(sql);
        
           while(rs.next()){
                  //Object[] rowdata = {rs.getString("")}; 
                  
                  String tid = rs.getString("tea_id");
                  String tname = rs.getString("tea_name");
                  String designation = rs.getString("designation");
                  String fname= rs.getString("father_name");
                  String mname = rs.getString("mother_name");
                  String tdob = rs.getString("dob");
                  String tnid = rs.getString("nid");
                  String trelagion = rs.getString("relagion");
                  String tgender = rs.getString("gender");
                  String tmobile = rs.getString("tea_mobile");
                  
                  String teducation = rs.getString("tea_education");
                  String present_add = rs.getString("present_add");
                  String joindate = rs.getString("join_date");
                 Object [] rowData= {tid,tname,designation,fname,mname,tdob,tnid,trelagion,tgender,tmobile,teducation,present_add,joindate};
                 model.addRow(rowData);
        }
       total_teacher_list.setModel(model);
        } catch (Exception e) {
                System.out.println(e);
        }
            
    }//GEN-LAST:event_FeetchActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    
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
            java.util.logging.Logger.getLogger(TotalTeachertList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TotalTeachertList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TotalTeachertList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TotalTeachertList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TotalTeachertList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Feetch;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable total_teacher_list;
    // End of variables declaration//GEN-END:variables
}
