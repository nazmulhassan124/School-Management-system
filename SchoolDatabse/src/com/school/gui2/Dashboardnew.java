
package com.school.gui2;

import com.school.util.DBCconnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class Dashboardnew extends javax.swing.JFrame {

    Color defaultcolor,clickedcolor,white;
     Connection con =null;
 Statement stmt=null;
   
    public Dashboardnew() {
        initComponents();
        defaultcolor = new Color(255,204,0);
        clickedcolor = new Color(51,51,51);
        white= new Color(255,255,255);
        
    }
   // TotalStudentList ts1 = new TotalStudentList();
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ManuePanel = new javax.swing.JPanel();
        m1home = new javax.swing.JPanel();
        b_home = new javax.swing.JLabel();
        m2info = new javax.swing.JPanel();
        b_info = new javax.swing.JLabel();
        m3addmission = new javax.swing.JPanel();
        b_addmission = new javax.swing.JLabel();
        m4students = new javax.swing.JPanel();
        b_students = new javax.swing.JLabel();
        m5classes = new javax.swing.JPanel();
        b_classes = new javax.swing.JLabel();
        m6teachers = new javax.swing.JPanel();
        b_teachers = new javax.swing.JLabel();
        m7examination = new javax.swing.JPanel();
        b_examination = new javax.swing.JLabel();
        m8results = new javax.swing.JPanel();
        b_results = new javax.swing.JLabel();
        m9attendence = new javax.swing.JPanel();
        b_attendance = new javax.swing.JLabel();
        m10allfilie = new javax.swing.JPanel();
        b_allfile = new javax.swing.JLabel();
        m11admin = new javax.swing.JPanel();
        b_admine = new javax.swing.JLabel();
        m12more = new javax.swing.JPanel();
        b_more = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        home = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        schoolinfo = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        infotitlemanue = new javax.swing.JPanel();
        history = new javax.swing.JButton();
        yearlyreport = new javax.swing.JButton();
        annualfun = new javax.swing.JButton();
        annualpic = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        p1_history = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        p2_annualreport = new javax.swing.JPanel();
        p3_anualfunction = new javax.swing.JPanel();
        p4_annulpictic = new javax.swing.JPanel();
        Students = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        addmission = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        search_stu1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        total_stulist = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        total_student_table = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        specific_student_table = new javax.swing.JTable();
        teacher = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        welcometeacher = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        teacherlist = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField7 = new javax.swing.JTextField();
        teacherreg = new javax.swing.JPanel();
        classes = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        classmanue = new javax.swing.JPanel();
        classbutton1 = new javax.swing.JButton();
        classbutton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        allclasses = new javax.swing.JPanel();
        play_btn = new javax.swing.JButton();
        one_btn = new javax.swing.JButton();
        narsary_btn = new javax.swing.JButton();
        classone = new javax.swing.JButton();
        two_btn = new javax.swing.JButton();
        seven_btn = new javax.swing.JButton();
        four_btn = new javax.swing.JButton();
        five_btn = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        three_batton = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        classshedule = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        attendence = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        attend_list_btn = new javax.swing.JButton();
        take_attend_btn = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        take_attend_btn1 = new javax.swing.JButton();
        take_attend_btn2 = new javax.swing.JButton();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        take_attendece = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        m_present_list = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        m_absent_list = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        attendence_list = new javax.swing.JPanel();
        absent_list = new javax.swing.JPanel();
        examination = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        exam_result_btn = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        results = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        resulthome = new javax.swing.JPanel();
        allresult = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        all_reult_table = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        feesmanagement = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        allfile = new javax.swing.JPanel();
        admin = new javax.swing.JPanel();
        logout = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Dream Flower Kindergarten & School");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 19, 717, 67));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/school/images/Logo.jpg"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 100, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 140));

        ManuePanel.setBackground(new java.awt.Color(102, 102, 255));

        m1home.setBackground(new java.awt.Color(51, 51, 255));

        b_home.setBackground(new java.awt.Color(255, 255, 255));
        b_home.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        b_home.setForeground(new java.awt.Color(255, 255, 255));
        b_home.setText("Home");
        b_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_homeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_homeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b_homeMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout m1homeLayout = new javax.swing.GroupLayout(m1home);
        m1home.setLayout(m1homeLayout);
        m1homeLayout.setHorizontalGroup(
            m1homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m1homeLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(b_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        m1homeLayout.setVerticalGroup(
            m1homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m1homeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_home)
                .addContainerGap())
        );

        m2info.setBackground(new java.awt.Color(51, 51, 255));
        m2info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                m2infoMousePressed(evt);
            }
        });

        b_info.setBackground(new java.awt.Color(255, 255, 255));
        b_info.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        b_info.setForeground(new java.awt.Color(255, 255, 255));
        b_info.setText("Info");
        b_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_infoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_infoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b_infoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout m2infoLayout = new javax.swing.GroupLayout(m2info);
        m2info.setLayout(m2infoLayout);
        m2infoLayout.setHorizontalGroup(
            m2infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m2infoLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(b_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        m2infoLayout.setVerticalGroup(
            m2infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m2infoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_info)
                .addContainerGap())
        );

        m3addmission.setBackground(new java.awt.Color(51, 51, 255));

        b_addmission.setBackground(new java.awt.Color(255, 255, 255));
        b_addmission.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        b_addmission.setForeground(new java.awt.Color(255, 255, 255));
        b_addmission.setText("Students");
        b_addmission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_addmissionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_addmissionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout m3addmissionLayout = new javax.swing.GroupLayout(m3addmission);
        m3addmission.setLayout(m3addmissionLayout);
        m3addmissionLayout.setHorizontalGroup(
            m3addmissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m3addmissionLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(b_addmission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        m3addmissionLayout.setVerticalGroup(
            m3addmissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m3addmissionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_addmission)
                .addContainerGap())
        );

        m4students.setBackground(new java.awt.Color(51, 51, 255));

        b_students.setBackground(new java.awt.Color(255, 255, 255));
        b_students.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        b_students.setForeground(new java.awt.Color(255, 255, 255));
        b_students.setText("Teachers");
        b_students.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_studentsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_studentsMousePressed(evt);
            }
        });

        javax.swing.GroupLayout m4studentsLayout = new javax.swing.GroupLayout(m4students);
        m4students.setLayout(m4studentsLayout);
        m4studentsLayout.setHorizontalGroup(
            m4studentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m4studentsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_students, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        m4studentsLayout.setVerticalGroup(
            m4studentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m4studentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_students)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        m5classes.setBackground(new java.awt.Color(51, 51, 255));

        b_classes.setBackground(new java.awt.Color(255, 255, 255));
        b_classes.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        b_classes.setForeground(new java.awt.Color(255, 255, 255));
        b_classes.setText("Classes");
        b_classes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_classesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_classesMousePressed(evt);
            }
        });

        javax.swing.GroupLayout m5classesLayout = new javax.swing.GroupLayout(m5classes);
        m5classes.setLayout(m5classesLayout);
        m5classesLayout.setHorizontalGroup(
            m5classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m5classesLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(b_classes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        m5classesLayout.setVerticalGroup(
            m5classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m5classesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_classes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        m6teachers.setBackground(new java.awt.Color(51, 51, 255));

        b_teachers.setBackground(new java.awt.Color(255, 255, 255));
        b_teachers.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        b_teachers.setForeground(new java.awt.Color(255, 255, 255));
        b_teachers.setText("Attenence");
        b_teachers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_teachersMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_teachersMousePressed(evt);
            }
        });

        javax.swing.GroupLayout m6teachersLayout = new javax.swing.GroupLayout(m6teachers);
        m6teachers.setLayout(m6teachersLayout);
        m6teachersLayout.setHorizontalGroup(
            m6teachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m6teachersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_teachers, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        m6teachersLayout.setVerticalGroup(
            m6teachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m6teachersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_teachers)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        m7examination.setBackground(new java.awt.Color(51, 51, 255));

        b_examination.setBackground(new java.awt.Color(255, 255, 255));
        b_examination.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        b_examination.setForeground(new java.awt.Color(255, 255, 255));
        b_examination.setText("Examinations");
        b_examination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_examinationMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_examinationMousePressed(evt);
            }
        });

        javax.swing.GroupLayout m7examinationLayout = new javax.swing.GroupLayout(m7examination);
        m7examination.setLayout(m7examinationLayout);
        m7examinationLayout.setHorizontalGroup(
            m7examinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m7examinationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_examination, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        m7examinationLayout.setVerticalGroup(
            m7examinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m7examinationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_examination)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        m8results.setBackground(new java.awt.Color(51, 51, 255));

        b_results.setBackground(new java.awt.Color(255, 255, 255));
        b_results.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        b_results.setForeground(new java.awt.Color(255, 255, 255));
        b_results.setText("Results");
        b_results.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_resultsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_resultsMousePressed(evt);
            }
        });

        javax.swing.GroupLayout m8resultsLayout = new javax.swing.GroupLayout(m8results);
        m8results.setLayout(m8resultsLayout);
        m8resultsLayout.setHorizontalGroup(
            m8resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m8resultsLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(b_results, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        m8resultsLayout.setVerticalGroup(
            m8resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m8resultsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_results)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        m9attendence.setBackground(new java.awt.Color(51, 51, 255));

        b_attendance.setBackground(new java.awt.Color(255, 255, 255));
        b_attendance.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        b_attendance.setForeground(new java.awt.Color(255, 255, 255));
        b_attendance.setText("Fees Managements");
        b_attendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_attendanceMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_attendanceMousePressed(evt);
            }
        });

        javax.swing.GroupLayout m9attendenceLayout = new javax.swing.GroupLayout(m9attendence);
        m9attendence.setLayout(m9attendenceLayout);
        m9attendenceLayout.setHorizontalGroup(
            m9attendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m9attendenceLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(b_attendance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        m9attendenceLayout.setVerticalGroup(
            m9attendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m9attendenceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_attendance)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        m10allfilie.setBackground(new java.awt.Color(51, 51, 255));

        b_allfile.setBackground(new java.awt.Color(255, 255, 255));
        b_allfile.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        b_allfile.setForeground(new java.awt.Color(255, 255, 255));
        b_allfile.setText("All File");
        b_allfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_allfileMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_allfileMousePressed(evt);
            }
        });

        javax.swing.GroupLayout m10allfilieLayout = new javax.swing.GroupLayout(m10allfilie);
        m10allfilie.setLayout(m10allfilieLayout);
        m10allfilieLayout.setHorizontalGroup(
            m10allfilieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m10allfilieLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(b_allfile, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        m10allfilieLayout.setVerticalGroup(
            m10allfilieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m10allfilieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_allfile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        m11admin.setBackground(new java.awt.Color(51, 51, 255));

        b_admine.setBackground(new java.awt.Color(255, 255, 255));
        b_admine.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        b_admine.setForeground(new java.awt.Color(255, 255, 255));
        b_admine.setText("Admin");
        b_admine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_admineMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_admineMousePressed(evt);
            }
        });

        javax.swing.GroupLayout m11adminLayout = new javax.swing.GroupLayout(m11admin);
        m11admin.setLayout(m11adminLayout);
        m11adminLayout.setHorizontalGroup(
            m11adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m11adminLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(b_admine, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        m11adminLayout.setVerticalGroup(
            m11adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m11adminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_admine)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        m12more.setBackground(new java.awt.Color(51, 51, 255));

        b_more.setBackground(new java.awt.Color(255, 255, 255));
        b_more.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        b_more.setForeground(new java.awt.Color(255, 255, 255));
        b_more.setText("LogOut");
        b_more.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_moreMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_moreMousePressed(evt);
            }
        });

        javax.swing.GroupLayout m12moreLayout = new javax.swing.GroupLayout(m12more);
        m12more.setLayout(m12moreLayout);
        m12moreLayout.setHorizontalGroup(
            m12moreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m12moreLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(b_more, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        m12moreLayout.setVerticalGroup(
            m12moreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m12moreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_more)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ManuePanelLayout = new javax.swing.GroupLayout(ManuePanel);
        ManuePanel.setLayout(ManuePanelLayout);
        ManuePanelLayout.setHorizontalGroup(
            ManuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManuePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ManuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(m12more, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m11admin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m10allfilie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m9attendence, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m8results, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m7examination, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m6teachers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m5classes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m4students, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m3addmission, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m2info, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m1home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ManuePanelLayout.setVerticalGroup(
            ManuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManuePanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(m1home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(m2info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(m3addmission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(m4students, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(m5classes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(m6teachers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(m7examination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(m8results, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(m9attendence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(m10allfilie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(m11admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(m12more, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(ManuePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 230, 570));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/school/images/SchoolView.jpg"))); // NOI18N
        jPanel22.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1000, 560));

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", home);

        schoolinfo.setPreferredSize(new java.awt.Dimension(1015, 562));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infotitlemanue.setBackground(new java.awt.Color(153, 204, 255));

        history.setBackground(new java.awt.Color(102, 102, 255));
        history.setText("School History");
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });

        yearlyreport.setBackground(new java.awt.Color(102, 102, 255));
        yearlyreport.setText("Yearly Report");
        yearlyreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlyreportActionPerformed(evt);
            }
        });

        annualfun.setBackground(new java.awt.Color(102, 102, 255));
        annualfun.setText("Annual Function");
        annualfun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annualfunActionPerformed(evt);
            }
        });

        annualpic.setBackground(new java.awt.Color(102, 102, 255));
        annualpic.setText("Annual Picnic");
        annualpic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annualpicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infotitlemanueLayout = new javax.swing.GroupLayout(infotitlemanue);
        infotitlemanue.setLayout(infotitlemanueLayout);
        infotitlemanueLayout.setHorizontalGroup(
            infotitlemanueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infotitlemanueLayout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(yearlyreport, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(annualfun, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(annualpic, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        infotitlemanueLayout.setVerticalGroup(
            infotitlemanueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infotitlemanueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infotitlemanueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearlyreport, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(history, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(annualfun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(annualpic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.add(infotitlemanue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 50));

        p1_history.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/school/gui2/school turnament.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        jTextArea2.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("History\n\nDhaka College in 1904 (located at Dhaka Collegiate School premise)\n\nFirst modern designed student hall of Dhaka College (1908), now known as Dr. Muhammad Shahidullah Hall of University of \nDhaka\nDhaka College is one of Bangladesh's most important as well as earliest higher-secondary educational institutions. It\n was established by James Taylor Wise (civil surgeon at Dhaka) in 1835 as an English Seminary School (present Dhaka\n Collegiate School). Mr. Wise organized a local Committee of Public Instruction with the help of district magistrate Mr. \nGrant. The school building was built partly out of public donations on the grounds of an English factory. On 18 July 1841,\nthe school got its approval from the college. On 20 November 1841, the foundation stone of the college was placed and \nbuildings were completed in 1846, with the aid of the Bishop of Calcutta. In the first graduating class there were both\n\n Muslim and Hindu students, as well as a number of foreign students, mainly from Armenia and Portugal.\n\nThe college was relocated in 1873 to a large building to the east of Victoria Park in order to accommodate the physics \nand chemistry laboratories. In 1908, it shifted to Curzon Hall while the science departments were housed in the present\n chemistry building of the University of Dhaka and two new halls were built there as well. In 1921, the college shifted\n again to the old High Court Building as the University of Dhaka was established there. During the Second World War, it\n moved to Siddique Bazar in Purana Dhaka. Finally, the college found its own permanent campus on Mirpur Road, Dhanmondi\n near Dhaka New Market in 1955.[4]");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout p1_historyLayout = new javax.swing.GroupLayout(p1_history);
        p1_history.setLayout(p1_historyLayout);
        p1_historyLayout.setHorizontalGroup(
            p1_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1_historyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        p1_historyLayout.setVerticalGroup(
            p1_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1_historyLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jTabbedPane3.addTab("tab1", p1_history);

        p2_annualreport.setBackground(new java.awt.Color(230, 201, 201));

        javax.swing.GroupLayout p2_annualreportLayout = new javax.swing.GroupLayout(p2_annualreport);
        p2_annualreport.setLayout(p2_annualreportLayout);
        p2_annualreportLayout.setHorizontalGroup(
            p2_annualreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );
        p2_annualreportLayout.setVerticalGroup(
            p2_annualreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("tab2", p2_annualreport);

        p3_anualfunction.setBackground(new java.awt.Color(230, 201, 201));

        javax.swing.GroupLayout p3_anualfunctionLayout = new javax.swing.GroupLayout(p3_anualfunction);
        p3_anualfunction.setLayout(p3_anualfunctionLayout);
        p3_anualfunctionLayout.setHorizontalGroup(
            p3_anualfunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );
        p3_anualfunctionLayout.setVerticalGroup(
            p3_anualfunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("tab3", p3_anualfunction);

        p4_annulpictic.setBackground(new java.awt.Color(230, 201, 201));

        javax.swing.GroupLayout p4_annulpicticLayout = new javax.swing.GroupLayout(p4_annulpictic);
        p4_annulpictic.setLayout(p4_annulpicticLayout);
        p4_annulpicticLayout.setHorizontalGroup(
            p4_annulpicticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );
        p4_annulpicticLayout.setVerticalGroup(
            p4_annulpicticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("tab4", p4_annulpictic);

        jPanel4.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1020, 550));

        javax.swing.GroupLayout schoolinfoLayout = new javax.swing.GroupLayout(schoolinfo);
        schoolinfo.setLayout(schoolinfoLayout);
        schoolinfoLayout.setHorizontalGroup(
            schoolinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        schoolinfoLayout.setVerticalGroup(
            schoolinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", schoolinfo);

        jPanel13.setBackground(new java.awt.Color(204, 204, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Total Student List");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 132, 56));

        addmission.setText("Addmission");
        addmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmissionActionPerformed(evt);
            }
        });
        jPanel6.add(addmission, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 132, 56));

        jLabel3.setText("Session");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        jTextField1.setText("2022");
        jPanel6.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 20, 100, -1));

        jLabel4.setText("Student Id");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, -1, -1));
        jPanel6.add(search_stu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 50, 100, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/school/images/search.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 30, 30));

        jButton9.setText("Total Student List(TC)");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 160, 60));

        jPanel13.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 1015, 88));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("tab1", jPanel3);

        total_student_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(total_student_table);

        javax.swing.GroupLayout total_stulistLayout = new javax.swing.GroupLayout(total_stulist);
        total_stulist.setLayout(total_stulistLayout);
        total_stulistLayout.setHorizontalGroup(
            total_stulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
        );
        total_stulistLayout.setVerticalGroup(
            total_stulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_stulistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("tab2", total_stulist);

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        specific_student_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        specific_student_table.setRowHeight(30);
        jScrollPane9.setViewportView(specific_student_table);

        jPanel9.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 58, 1010, 380));

        jTabbedPane5.addTab("tab3", jPanel9);

        jPanel13.add(jTabbedPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1020, 500));

        javax.swing.GroupLayout StudentsLayout = new javax.swing.GroupLayout(Students);
        Students.setLayout(StudentsLayout);
        StudentsLayout.setHorizontalGroup(
            StudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        StudentsLayout.setVerticalGroup(
            StudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", Students);

        jPanel14.setBackground(new java.awt.Color(204, 204, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(153, 153, 255));

        jButton4.setText("Registration");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Teachers List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jButton1)
                .addGap(66, 66, 66)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(584, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel14.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1010, 40));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField2.setText("Welcome to teacher Page");

        javax.swing.GroupLayout welcometeacherLayout = new javax.swing.GroupLayout(welcometeacher);
        welcometeacher.setLayout(welcometeacherLayout);
        welcometeacherLayout.setHorizontalGroup(
            welcometeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcometeacherLayout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
        );
        welcometeacherLayout.setVerticalGroup(
            welcometeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcometeacherLayout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("tab1", welcometeacher);

        teacherlist.setBackground(new java.awt.Color(204, 204, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField7.setBackground(new java.awt.Color(204, 204, 255));
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField7.setText("Teacher List");

        javax.swing.GroupLayout teacherlistLayout = new javax.swing.GroupLayout(teacherlist);
        teacherlist.setLayout(teacherlistLayout);
        teacherlistLayout.setHorizontalGroup(
            teacherlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(teacherlistLayout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
        );
        teacherlistLayout.setVerticalGroup(
            teacherlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherlistLayout.createSequentialGroup()
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("tab2", teacherlist);

        javax.swing.GroupLayout teacherregLayout = new javax.swing.GroupLayout(teacherreg);
        teacherreg.setLayout(teacherregLayout);
        teacherregLayout.setHorizontalGroup(
            teacherregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        teacherregLayout.setVerticalGroup(
            teacherregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("tab3", teacherreg);

        jPanel14.add(jTabbedPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1010, 540));

        javax.swing.GroupLayout teacherLayout = new javax.swing.GroupLayout(teacher);
        teacher.setLayout(teacherLayout);
        teacherLayout.setHorizontalGroup(
            teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        teacherLayout.setVerticalGroup(
            teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", teacher);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        classmanue.setBackground(new java.awt.Color(153, 153, 255));

        classbutton1.setText("ALL CLASSES");
        classbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classbutton1ActionPerformed(evt);
            }
        });

        classbutton2.setText("CLASS SHEDULE");
        classbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classbutton2ActionPerformed(evt);
            }
        });

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout classmanueLayout = new javax.swing.GroupLayout(classmanue);
        classmanue.setLayout(classmanueLayout);
        classmanueLayout.setHorizontalGroup(
            classmanueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classmanueLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(classbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(classbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        classmanueLayout.setVerticalGroup(
            classmanueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classmanueLayout.createSequentialGroup()
                .addGroup(classmanueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(classmanue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1020, 40));

        allclasses.setBackground(new java.awt.Color(193, 193, 207));
        allclasses.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        play_btn.setBackground(new java.awt.Color(102, 102, 255));
        play_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        play_btn.setForeground(new java.awt.Color(255, 255, 255));
        play_btn.setText("Pre Play");
        play_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        play_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_btnActionPerformed(evt);
            }
        });
        allclasses.add(play_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 110, 100));

        one_btn.setBackground(new java.awt.Color(102, 102, 255));
        one_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        one_btn.setForeground(new java.awt.Color(255, 255, 255));
        one_btn.setText("Play");
        one_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        one_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one_btnActionPerformed(evt);
            }
        });
        allclasses.add(one_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 110, 100));

        narsary_btn.setBackground(new java.awt.Color(102, 102, 255));
        narsary_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        narsary_btn.setForeground(new java.awt.Color(255, 255, 255));
        narsary_btn.setText("Narsary");
        narsary_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        narsary_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                narsary_btnActionPerformed(evt);
            }
        });
        allclasses.add(narsary_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 59, 100, 100));

        classone.setBackground(new java.awt.Color(102, 102, 255));
        classone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        classone.setForeground(new java.awt.Color(255, 255, 255));
        classone.setText("One");
        classone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        classone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classoneActionPerformed(evt);
            }
        });
        allclasses.add(classone, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 110, 100));

        two_btn.setBackground(new java.awt.Color(102, 102, 255));
        two_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        two_btn.setForeground(new java.awt.Color(255, 255, 255));
        two_btn.setText("Two");
        two_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        two_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two_btnActionPerformed(evt);
            }
        });
        allclasses.add(two_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 100, 100));

        seven_btn.setBackground(new java.awt.Color(102, 102, 255));
        seven_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seven_btn.setForeground(new java.awt.Color(255, 255, 255));
        seven_btn.setText("Seven");
        seven_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        seven_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seven_btnActionPerformed(evt);
            }
        });
        allclasses.add(seven_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 110, 100));

        four_btn.setBackground(new java.awt.Color(102, 102, 255));
        four_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        four_btn.setForeground(new java.awt.Color(255, 255, 255));
        four_btn.setText("Six");
        four_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        four_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                four_btnActionPerformed(evt);
            }
        });
        allclasses.add(four_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 120, 100));

        five_btn.setBackground(new java.awt.Color(102, 102, 255));
        five_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        five_btn.setForeground(new java.awt.Color(255, 255, 255));
        five_btn.setText("Five");
        five_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        five_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five_btnActionPerformed(evt);
            }
        });
        allclasses.add(five_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 120, 100));

        jButton22.setBackground(new java.awt.Color(102, 102, 255));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Four");
        jButton22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        allclasses.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, 100, 100));

        three_batton.setBackground(new java.awt.Color(102, 102, 255));
        three_batton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        three_batton.setForeground(new java.awt.Color(255, 255, 255));
        three_batton.setText("Three");
        three_batton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        three_batton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three_battonActionPerformed(evt);
            }
        });
        allclasses.add(three_batton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 100, 100));

        jButton23.setBackground(new java.awt.Color(102, 102, 255));
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Eight");
        jButton23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        allclasses.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 110, 100));

        jButton25.setBackground(new java.awt.Color(102, 102, 255));
        jButton25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Nine");
        jButton25.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        allclasses.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 110, 100));

        jButton24.setBackground(new java.awt.Color(102, 102, 255));
        jButton24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Ten");
        jButton24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        allclasses.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, 110, 100));

        jTabbedPane2.addTab("tab1", allclasses);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"One", null, null, null, null, null, null, null, null},
                {"Two", null, null, null, null, null, null, null, null},
                {"Three", null, null, null, null, null, null, null, null},
                {"Four", null, null, null, null, null, null, null, null},
                {"Five", null, null, null, null, null, null, null, null},
                {"Six", null, null, null, null, null, null, null, null},
                {"Seven", null, null, null, null, null, null, null, null},
                {"Eight", null, null, null, null, null, null, null, null},
                {"Nine", null, null, null, null, null, null, null, null},
                {"Ten", null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial", "1st Class", "2nd Class", "3rd Class", "4th Class", "5th Class", "6th Class", "7th Class", "8th class"
            }
        ));
        jTable3.setAlignmentX(1.0F);
        jTable3.setAlignmentY(1.0F);
        jTable3.setRowHeight(35);
        jTable3.setRowMargin(2);
        jScrollPane8.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setHeaderValue("Serial");
            jTable3.getColumnModel().getColumn(1).setHeaderValue("1st Class");
            jTable3.getColumnModel().getColumn(2).setHeaderValue("2nd Class");
            jTable3.getColumnModel().getColumn(3).setHeaderValue("3rd Class");
            jTable3.getColumnModel().getColumn(4).setHeaderValue("4th Class");
            jTable3.getColumnModel().getColumn(5).setHeaderValue("5th Class");
            jTable3.getColumnModel().getColumn(6).setHeaderValue("6th Class");
            jTable3.getColumnModel().getColumn(7).setHeaderValue("7th Class");
            jTable3.getColumnModel().getColumn(8).setHeaderValue("8th class");
        }

        jPanel18.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 930, 380));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Class Routine");
        jPanel18.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 190, 40));

        javax.swing.GroupLayout classsheduleLayout = new javax.swing.GroupLayout(classshedule);
        classshedule.setLayout(classsheduleLayout);
        classsheduleLayout.setHorizontalGroup(
            classsheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        classsheduleLayout.setVerticalGroup(
            classsheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab2", classshedule);

        jTextField5.setText("panel 3");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(348, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(352, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab3", jPanel10);

        jTextField6.setText("panel");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(344, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab4", jPanel11);

        jPanel7.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1020, 550));

        javax.swing.GroupLayout classesLayout = new javax.swing.GroupLayout(classes);
        classes.setLayout(classesLayout);
        classesLayout.setHorizontalGroup(
            classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        classesLayout.setVerticalGroup(
            classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab5", classes);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(173, 175, 212));

        attend_list_btn.setText("Attendence List");
        attend_list_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attend_list_btnActionPerformed(evt);
            }
        });

        take_attend_btn.setText("Auto Attendence");
        take_attend_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                take_attend_btnActionPerformed(evt);
            }
        });

        jButton18.setText("Search");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel8.setText("Attendence ");

        take_attend_btn1.setText("Manual Attendence");
        take_attend_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                take_attend_btn1ActionPerformed(evt);
            }
        });

        take_attend_btn2.setText("Absent List");
        take_attend_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                take_attend_btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(take_attend_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(take_attend_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(286, 286, 286)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(attend_list_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(take_attend_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(jButton18)))
                .addGap(30, 30, 30))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jButton18)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(take_attend_btn)
                            .addComponent(attend_list_btn)
                            .addComponent(take_attend_btn1)
                            .addComponent(take_attend_btn2))
                        .addGap(29, 29, 29))))
        );

        jPanel5.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

        take_attendece.setBackground(new java.awt.Color(216, 239, 244));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Name", "Name", "STATUS", "Comment"
            }
        ));
        jScrollPane5.setViewportView(jTable2);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/school/images/finger.gif"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setText(" Manual Classwise Attendence System");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Class Name :");

        m_present_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Serial", "Id", "Name"
            }
        ));
        jScrollPane6.setViewportView(m_present_list);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Serial", "Id", "Name"
            }
        ));
        jScrollPane7.setViewportView(jTable4);

        jLabel12.setText("Present List");

        m_absent_list.setText("Absent List");

        jLabel14.setText("Total");

        jLabel15.setText("Total");

        javax.swing.GroupLayout take_attendeceLayout = new javax.swing.GroupLayout(take_attendece);
        take_attendece.setLayout(take_attendeceLayout);
        take_attendeceLayout.setHorizontalGroup(
            take_attendeceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, take_attendeceLayout.createSequentialGroup()
                .addGroup(take_attendeceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(take_attendeceLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(take_attendeceLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(take_attendeceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, take_attendeceLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(take_attendeceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, take_attendeceLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
            .addGroup(take_attendeceLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel12)
                .addGap(150, 150, 150)
                .addGroup(take_attendeceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_absent_list))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        take_attendeceLayout.setVerticalGroup(
            take_attendeceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(take_attendeceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(take_attendeceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGroup(take_attendeceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(take_attendeceLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, take_attendeceLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(take_attendeceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(m_absent_list))
                        .addGap(18, 18, 18)
                        .addGroup(take_attendeceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(take_attendeceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, take_attendeceLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))))
        );

        jTabbedPane7.addTab("tab1", take_attendece);

        attendence_list.setBackground(new java.awt.Color(216, 239, 244));

        javax.swing.GroupLayout attendence_listLayout = new javax.swing.GroupLayout(attendence_list);
        attendence_list.setLayout(attendence_listLayout);
        attendence_listLayout.setHorizontalGroup(
            attendence_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );
        attendence_listLayout.setVerticalGroup(
            attendence_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("tab2", attendence_list);

        javax.swing.GroupLayout absent_listLayout = new javax.swing.GroupLayout(absent_list);
        absent_list.setLayout(absent_listLayout);
        absent_listLayout.setHorizontalGroup(
            absent_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );
        absent_listLayout.setVerticalGroup(
            absent_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("tab3", absent_list);

        jPanel5.add(jTabbedPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1020, 470));

        javax.swing.GroupLayout attendenceLayout = new javax.swing.GroupLayout(attendence);
        attendence.setLayout(attendenceLayout);
        attendenceLayout.setHorizontalGroup(
            attendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        attendenceLayout.setVerticalGroup(
            attendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendenceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab6", attendence);

        jPanel12.setBackground(new java.awt.Color(206, 223, 249));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setText("jButton7");
        jPanel12.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 110, 60));

        exam_result_btn.setText("Result Insert");
        exam_result_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exam_result_btnActionPerformed(evt);
            }
        });
        jPanel12.add(exam_result_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 110, 60));

        jButton10.setText("Result View");
        jPanel12.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 110, 60));

        jButton11.setText("jButton7");
        jPanel12.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 110, 60));

        jButton12.setText("jButton7");
        jPanel12.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 110, 60));

        javax.swing.GroupLayout examinationLayout = new javax.swing.GroupLayout(examination);
        examination.setLayout(examinationLayout);
        examinationLayout.setHorizontalGroup(
            examinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        examinationLayout.setVerticalGroup(
            examinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab7", examination);

        jPanel15.setBackground(new java.awt.Color(206, 223, 249));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(153, 153, 255));

        jButton13.setText("All Result");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("jButton8");

        jButton15.setText("jButton8");

        jButton16.setText("jButton8");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButton16)
                .addGap(49, 49, 49)
                .addComponent(jButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addGap(143, 143, 143))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1010, 60));

        javax.swing.GroupLayout resulthomeLayout = new javax.swing.GroupLayout(resulthome);
        resulthome.setLayout(resulthomeLayout);
        resulthomeLayout.setHorizontalGroup(
            resulthomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );
        resulthomeLayout.setVerticalGroup(
            resulthomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("tab1", resulthome);

        allresult.setBackground(new java.awt.Color(204, 204, 204));

        all_reult_table.setBackground(new java.awt.Color(206, 223, 249));
        all_reult_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(all_reult_table);

        javax.swing.GroupLayout allresultLayout = new javax.swing.GroupLayout(allresult);
        allresult.setLayout(allresultLayout);
        allresultLayout.setHorizontalGroup(
            allresultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
        );
        allresultLayout.setVerticalGroup(
            allresultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allresultLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("tab2", allresult);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("tab3", jPanel19);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("tab4", jPanel20);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("tab5", jPanel21);

        jPanel15.add(jTabbedPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1020, 520));

        javax.swing.GroupLayout resultsLayout = new javax.swing.GroupLayout(results);
        results.setLayout(resultsLayout);
        resultsLayout.setHorizontalGroup(
            resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        resultsLayout.setVerticalGroup(
            resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab8", results);

        jPanel23.setBackground(new java.awt.Color(204, 204, 204));

        jButton8.setText("Addmission Fees");

        jButton17.setText("Mnthly Fees ");

        jButton19.setText("Other Fees");

        jButton20.setText("Exam Fees");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(305, 305, 305))
        );

        javax.swing.GroupLayout feesmanagementLayout = new javax.swing.GroupLayout(feesmanagement);
        feesmanagement.setLayout(feesmanagementLayout);
        feesmanagementLayout.setHorizontalGroup(
            feesmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        feesmanagementLayout.setVerticalGroup(
            feesmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab9", feesmanagement);

        javax.swing.GroupLayout allfileLayout = new javax.swing.GroupLayout(allfile);
        allfile.setLayout(allfileLayout);
        allfileLayout.setHorizontalGroup(
            allfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );
        allfileLayout.setVerticalGroup(
            allfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab10", allfile);

        javax.swing.GroupLayout adminLayout = new javax.swing.GroupLayout(admin);
        admin.setLayout(adminLayout);
        adminLayout.setHorizontalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );
        adminLayout.setVerticalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab11", admin);

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab12", logout);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 1020, 590));

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

    private void b_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_homeMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_b_homeMouseClicked

    private void b_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_infoMouseClicked
        // TODO add your handling code here:
       jTabbedPane1.setSelectedIndex(1); 
    }//GEN-LAST:event_b_infoMouseClicked

    private void b_addmissionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_addmissionMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_b_addmissionMouseClicked

    private void b_studentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_studentsMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_b_studentsMouseClicked

    private void b_classesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_classesMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_b_classesMouseClicked

    private void b_homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_homeMousePressed
        // TODO add your handling code here:
        m1home.setBackground(clickedcolor);
        m2info.setBackground(defaultcolor);
        m3addmission.setBackground(defaultcolor);
        m4students.setBackground(defaultcolor);
        m5classes.setBackground(defaultcolor);
        m6teachers.setBackground(defaultcolor);
        m7examination.setBackground(defaultcolor);
        m8results.setBackground(defaultcolor);
        m9attendence.setBackground(defaultcolor);
        m10allfilie.setBackground(defaultcolor);
        m11admin.setBackground(defaultcolor);
        m12more.setBackground(defaultcolor);
        b_home.setBackground(white);
    }//GEN-LAST:event_b_homeMousePressed

    private void m2infoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m2infoMousePressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_m2infoMousePressed

    private void b_infoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_infoMousePressed
        // TODO add your handling code here:
       m1home.setBackground(defaultcolor);
        m2info.setBackground(clickedcolor);
        m3addmission.setBackground(defaultcolor);
        m4students.setBackground(defaultcolor);
        m5classes.setBackground(defaultcolor);
        m6teachers.setBackground(defaultcolor);
        m7examination.setBackground(defaultcolor);
        m8results.setBackground(defaultcolor);
        m9attendence.setBackground(defaultcolor);
        m10allfilie.setBackground(defaultcolor);
        m11admin.setBackground(defaultcolor);
        m12more.setBackground(defaultcolor);
        b_info.setBackground(white);  
    }//GEN-LAST:event_b_infoMousePressed

    private void b_homeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_homeMouseReleased
        // TODO add your handling code here:
      //   m1home.setBackground(defaultcolor);
    }//GEN-LAST:event_b_homeMouseReleased

    private void b_infoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_infoMouseReleased
        // TODO add your handling code here:
     //  m2info.setBackground(defaultcolor);
    }//GEN-LAST:event_b_infoMouseReleased

    private void b_addmissionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_addmissionMousePressed
        // TODO add your handling code here:
         m1home.setBackground(defaultcolor);
        m2info.setBackground(defaultcolor);
        m3addmission.setBackground(clickedcolor);
        m4students.setBackground(defaultcolor);
        m5classes.setBackground(defaultcolor);
        m6teachers.setBackground(defaultcolor);
        m7examination.setBackground(defaultcolor);
        m8results.setBackground(defaultcolor);
        m9attendence.setBackground(defaultcolor);
        m10allfilie.setBackground(defaultcolor);
        m11admin.setBackground(defaultcolor);
        m12more.setBackground(defaultcolor);
        b_addmission.setBackground(white);  
    }//GEN-LAST:event_b_addmissionMousePressed

    private void b_studentsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_studentsMousePressed
        // TODO add your handling code here:
         m1home.setBackground(defaultcolor);
        m2info.setBackground(defaultcolor);
        m3addmission.setBackground(defaultcolor);
        m4students.setBackground(clickedcolor);
        m5classes.setBackground(defaultcolor);
        m6teachers.setBackground(defaultcolor);
        m7examination.setBackground(defaultcolor);
        m8results.setBackground(defaultcolor);
        m9attendence.setBackground(defaultcolor);
        m10allfilie.setBackground(defaultcolor);
        m11admin.setBackground(defaultcolor);
        m12more.setBackground(defaultcolor);
        b_students.setBackground(white);  
    }//GEN-LAST:event_b_studentsMousePressed

    private void b_classesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_classesMousePressed
        // TODO add your handling code here:
         m1home.setBackground(defaultcolor);
        m2info.setBackground(defaultcolor);
        m3addmission.setBackground(defaultcolor);
        m4students.setBackground(defaultcolor);
        m5classes.setBackground(clickedcolor);
        m6teachers.setBackground(defaultcolor);
        m7examination.setBackground(defaultcolor);
        m8results.setBackground(defaultcolor);
        m9attendence.setBackground(defaultcolor);
        m10allfilie.setBackground(defaultcolor);
        m11admin.setBackground(defaultcolor);
        m12more.setBackground(defaultcolor);
        b_students.setBackground(white);  
    }//GEN-LAST:event_b_classesMousePressed

    private void b_teachersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_teachersMousePressed
        // TODO add your handling code here:
         m1home.setBackground(defaultcolor);
        m2info.setBackground(defaultcolor);
        m3addmission.setBackground(defaultcolor);
        m4students.setBackground(defaultcolor);
        m5classes.setBackground(defaultcolor);
        m6teachers.setBackground(clickedcolor);
        m7examination.setBackground(defaultcolor);
        m8results.setBackground(defaultcolor);
        m9attendence.setBackground(defaultcolor);
        m10allfilie.setBackground(defaultcolor);
        m11admin.setBackground(defaultcolor);
        m12more.setBackground(defaultcolor);
        b_teachers.setBackground(white);  
    }//GEN-LAST:event_b_teachersMousePressed

    private void b_examinationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_examinationMousePressed
        // TODO add your handling code here:
         m1home.setBackground(defaultcolor);
        m2info.setBackground(defaultcolor);
        m3addmission.setBackground(defaultcolor);
        m4students.setBackground(defaultcolor);
        m5classes.setBackground(defaultcolor);
        m6teachers.setBackground(defaultcolor);
        m7examination.setBackground(clickedcolor);
        m8results.setBackground(defaultcolor);
        m9attendence.setBackground(defaultcolor);
        m10allfilie.setBackground(defaultcolor);
        m11admin.setBackground(defaultcolor);
        m12more.setBackground(defaultcolor);
        b_examination.setBackground(white);  
    }//GEN-LAST:event_b_examinationMousePressed

    private void b_resultsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_resultsMousePressed
        // TODO add your handling code here:
         m1home.setBackground(defaultcolor);
        m2info.setBackground(defaultcolor);
        m3addmission.setBackground(defaultcolor);
        m4students.setBackground(defaultcolor);
        m5classes.setBackground(defaultcolor);
        m6teachers.setBackground(defaultcolor);
        m7examination.setBackground(defaultcolor);
        m8results.setBackground(clickedcolor);
        m9attendence.setBackground(defaultcolor);
        m10allfilie.setBackground(defaultcolor);
        m11admin.setBackground(defaultcolor);
        m12more.setBackground(defaultcolor);
        b_results.setBackground(white);  
    }//GEN-LAST:event_b_resultsMousePressed

    private void b_attendanceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_attendanceMousePressed
        // TODO add your handling code here:
         m1home.setBackground(defaultcolor);
        m2info.setBackground(defaultcolor);
        m3addmission.setBackground(defaultcolor);
        m4students.setBackground(defaultcolor);
        m5classes.setBackground(defaultcolor);
        m6teachers.setBackground(defaultcolor);
        m7examination.setBackground(defaultcolor);
        m8results.setBackground(defaultcolor);
        m9attendence.setBackground(clickedcolor);
        m10allfilie.setBackground(defaultcolor);
        m11admin.setBackground(defaultcolor);
        m12more.setBackground(defaultcolor);
        b_attendance.setBackground(white);  
    }//GEN-LAST:event_b_attendanceMousePressed

    private void b_allfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_allfileMousePressed
        // TODO add your handling code here:
         m1home.setBackground(defaultcolor);
        m2info.setBackground(defaultcolor);
        m3addmission.setBackground(defaultcolor);
        m4students.setBackground(defaultcolor);
        m5classes.setBackground(defaultcolor);
        m6teachers.setBackground(defaultcolor);
        m7examination.setBackground(defaultcolor);
        m8results.setBackground(defaultcolor);
        m9attendence.setBackground(defaultcolor);
        m10allfilie.setBackground(clickedcolor);
        m11admin.setBackground(defaultcolor);
        m12more.setBackground(defaultcolor);
        b_allfile.setBackground(white);  
    }//GEN-LAST:event_b_allfileMousePressed

    private void b_admineMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_admineMousePressed
        // TODO add your handling code here:
         m1home.setBackground(defaultcolor);
        m2info.setBackground(defaultcolor);
        m3addmission.setBackground(defaultcolor);
        m4students.setBackground(defaultcolor);
        m5classes.setBackground(defaultcolor);
        m6teachers.setBackground(defaultcolor);
        m7examination.setBackground(defaultcolor);
        m8results.setBackground(defaultcolor);
        m9attendence.setBackground(defaultcolor);
        m10allfilie.setBackground(defaultcolor);
        m11admin.setBackground(clickedcolor);
        m12more.setBackground(defaultcolor);
        b_admine.setBackground(white);  
    }//GEN-LAST:event_b_admineMousePressed

    private void b_moreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_moreMousePressed
        // TODO add your handling code here:
         m1home.setBackground(defaultcolor);
        m2info.setBackground(defaultcolor);
        m3addmission.setBackground(defaultcolor);
        m4students.setBackground(defaultcolor);
        m5classes.setBackground(defaultcolor);
        m6teachers.setBackground(defaultcolor);
        m7examination.setBackground(defaultcolor);
        m8results.setBackground(defaultcolor);
        m9attendence.setBackground(defaultcolor);
        m10allfilie.setBackground(defaultcolor);
        m11admin.setBackground(defaultcolor);
        m12more.setBackground(clickedcolor);
        b_more.setBackground(white);  
    }//GEN-LAST:event_b_moreMousePressed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        // TODO add your handling code here:
         jTabbedPane3.setSelectedIndex(0);
    }//GEN-LAST:event_historyActionPerformed

    private void yearlyreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlyreportActionPerformed
        // TODO add your handling code here:
        jTabbedPane3.setSelectedIndex(1);
    }//GEN-LAST:event_yearlyreportActionPerformed

    private void annualfunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annualfunActionPerformed
        // TODO add your handling code here:
          jTabbedPane3.setSelectedIndex(2);
    }//GEN-LAST:event_annualfunActionPerformed

    private void annualpicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annualpicActionPerformed
        // TODO add your handling code here:
          jTabbedPane3.setSelectedIndex(3);
    }//GEN-LAST:event_annualpicActionPerformed

    private void addmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmissionActionPerformed
        // TODO add your handling code here:
        StudentRegFromNew sreg= new StudentRegFromNew();
        sreg.setVisible(true);
    }//GEN-LAST:event_addmissionActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
          jTabbedPane2.setSelectedIndex(3);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void classbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classbutton1ActionPerformed
        // TODO add your handling code here:
          jTabbedPane2.setSelectedIndex(0);
        
    }//GEN-LAST:event_classbutton1ActionPerformed

    private void classbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classbutton2ActionPerformed
        // TODO add your handling code here:
          jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_classbutton2ActionPerformed

    private void play_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_btnActionPerformed
        // TODO add your handling code here:
        ClassPrePlayInformation pre_play= new ClassPrePlayInformation();
        pre_play.setVisible(true);

       
    }//GEN-LAST:event_play_btnActionPerformed

    private void one_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one_btnActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_one_btnActionPerformed

    private void narsary_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_narsary_btnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_narsary_btnActionPerformed

    private void classoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classoneActionPerformed
        // TODO add your handling code here:
        ClassOneInformation one = new ClassOneInformation();
        one.setVisible(true);
       

    }//GEN-LAST:event_classoneActionPerformed

    private void two_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two_btnActionPerformed
        // TODO add your handling code here:
        ClassTwoInformation two = new ClassTwoInformation();
        two.setVisible(true);
        
       

    }//GEN-LAST:event_two_btnActionPerformed

    private void seven_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seven_btnActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_seven_btnActionPerformed

    private void four_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_four_btnActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_four_btnActionPerformed

    private void five_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five_btnActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_five_btnActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton22ActionPerformed

    private void three_battonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three_battonActionPerformed
        // TODO add your handling code here:
         ClassThreeInformation cthree= new  ClassThreeInformation();
         cthree.setVisible(true);
      
    }//GEN-LAST:event_three_battonActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        ClassEightInformation8 eight = new ClassEightInformation8();
        eight.setVisible(true);
    
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //jTabbedPane4.setSelectedIndex(1);
        TotalTeachertList ttl = new TotalTeachertList();
        ttl.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        TeacherRegFromEditnew tr = new TeacherRegFromEditnew();
        tr.setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       // jTabbedPane5.setSelectedIndex(1);
       TotalStudentList tsl = new TotalStudentList();
       tsl.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
       jTabbedPane5.setSelectedIndex(2); 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void b_resultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_resultsMouseClicked
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_b_resultsMouseClicked

    private void b_teachersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_teachersMouseClicked
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_b_teachersMouseClicked

    private void b_examinationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_examinationMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_b_examinationMouseClicked

    private void b_attendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_attendanceMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(8);
    }//GEN-LAST:event_b_attendanceMouseClicked

    private void b_allfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_allfileMouseClicked
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(9);
    }//GEN-LAST:event_b_allfileMouseClicked

    private void b_admineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_admineMouseClicked
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(10);
    }//GEN-LAST:event_b_admineMouseClicked

    private void b_moreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_moreMouseClicked
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(11);
    }//GEN-LAST:event_b_moreMouseClicked

    private void exam_result_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exam_result_btnActionPerformed
        // TODO add your handling code here:
    NewExamMarksFrom marks = new NewExamMarksFrom ();
    marks.setVisible(true);
        
    }//GEN-LAST:event_exam_result_btnActionPerformed
 DefaultTableModel model;   // all student table show

  public void marklist (){
     model= new DefaultTableModel();
        model.addColumn("SESSION");
        model.addColumn("SEMISTER");
        model.addColumn("CLASS_NAME");
        model.addColumn("STUDENT_ID");
        model.addColumn("BAN_1ST");
        model.addColumn("BAN_2ND");
        model.addColumn("Engl_1st");
        model.addColumn("Eng_2nd");
        model.addColumn("Math");
        model.addColumn("Islam");
        model.addColumn("Science");
        model.addColumn("Sociolozy");
        model.addColumn("Ict");
        model.addColumn("Gk");
        model.addColumn("Dairy");
        model.addColumn("Drawing");
        model.addColumn("Total");
        model.addColumn("Avg");
        model.addColumn("GPA");
        model.addColumn("Status");
        String sql ="select * from exammarkstable";
        
        try {
        con = DBCconnection.getConnection();
        stmt= con.createStatement();
          ResultSet rs = stmt.executeQuery(sql);
        
           while(rs.next()){
                  //Object[] rowdata = {rs.getString("")}; 
         
                  String session = rs.getString("session");
                  String semister = rs.getString("semister");
                  String class_name = rs.getString("class_name");
                  String stu_id= rs.getString("stu_id");
                  String ban_1st = rs.getString("ban_1st");
                  String ban_2nd = rs.getString("ban_2nd");
                  String eng_1st = rs.getString("eng_1st");
                  String eng_2nd = rs.getString("eng_2nd");
                  String math = rs.getString("math");
                  String islam = rs.getString("islam");
                  String science = rs.getString("science");
                  String sociolozy = rs.getString("sociolozy");
                  String ict = rs.getString("ict");
                  String gk = rs.getString("gk");
                  String dairy = rs.getString("dairy");
                  String drawing = rs.getString("drawing");
                  
                  /* total ,avg,gpa,status calculation kore hobe*/
                 Object [] rowData= {session,semister,class_name,stu_id,ban_1st,ban_2nd,eng_1st,eng_2nd,math,islam,science,sociolozy,ict,gk,dairy,drawing};
                 model.addRow(rowData);
        }
      all_reult_table.setModel(model);
        } catch (Exception e) {
                System.out.println(e);
        }  finally{
            try {
                con.close();
               // stmt.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        
        }
    }
 
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        jTabbedPane6.setSelectedIndex(1);
        marklist ();
        
        
   
        
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        jTabbedPane6.setSelectedIndex(2);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void take_attend_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_take_attend_btnActionPerformed
        // TODO add your handling code here:
     FingerInsertFrom ff =  new FingerInsertFrom();
     ff.setVisible(true);
        
    }//GEN-LAST:event_take_attend_btnActionPerformed

    private void attend_list_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attend_list_btnActionPerformed
        // TODO add your handling code here:
        jTabbedPane7.setSelectedIndex(1);
    }//GEN-LAST:event_attend_list_btnActionPerformed

    private void take_attend_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_take_attend_btn1ActionPerformed
        // TODO add your handling code here:
          jTabbedPane7.setSelectedIndex(0);
    }//GEN-LAST:event_take_attend_btn1ActionPerformed

    private void take_attend_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_take_attend_btn2ActionPerformed
        // TODO add your handling code here:
             jTabbedPane7.setSelectedIndex(2);
    }//GEN-LAST:event_take_attend_btn2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTabbedPane5.setSelectedIndex(2);
        stulist ();
    }//GEN-LAST:event_jButton3ActionPerformed
/* specific student search Start*/
  //  Dashboardnew dd= new Dashboardnew();
   // String sid= dd.search_stu1.getText();

   
     public void stulist (){
     model= new DefaultTableModel();
        model.addColumn("SESSION");
        model.addColumn("STUDENT_ID");
        model.addColumn("NAME");
        model.addColumn("CLASS NAME");
        model.addColumn("CLASS ROLE");
        model.addColumn("GENDER");
        model.addColumn("GUARDIAN NUMBER");
        model.addColumn("ADDMISSION DATE");
        String sql ="select * from studentsnewtable  ";
        
        try {
        con = DBCconnection.getConnection();
         stmt= con.createStatement();
          ResultSet rs = stmt.executeQuery(sql);
        
           while(rs.next()){
                  //Object[] rowdata = {rs.getString("")}; 
                  
                  String session = rs.getString("session");
                  String sid = rs.getString("stu_id");
                  String sname = rs.getString("stu_name");
                  String class_name= rs.getString("class_name");
                  String class_role = rs.getString("class_roll");
                  String gender = rs.getString("gender");
                  String g_number = rs.getString("gardian_number");
                  String addmisson_date = rs.getString("addmission_date");
                 Object [] rowData= {session,sid,sname,class_name,class_role,gender,g_number,addmisson_date};
                 model.addRow(rowData);
        }
       specific_student_table.setModel(model);
        } catch (Exception e) {
                System.out.println(e);
        }  finally{
            try {
                con.close();
               // stmt.close();
            } catch (Exception e) {
                
            }
        }
    }
/* specific student search end*/
     
     // Search  student 
     
     
    
   
    
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
            java.util.logging.Logger.getLogger(Dashboardnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboardnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboardnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboardnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboardnew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ManuePanel;
    private javax.swing.JPanel Students;
    private javax.swing.JPanel absent_list;
    private javax.swing.JButton addmission;
    private javax.swing.JPanel admin;
    private javax.swing.JTable all_reult_table;
    private javax.swing.JPanel allclasses;
    private javax.swing.JPanel allfile;
    private javax.swing.JPanel allresult;
    private javax.swing.JButton annualfun;
    private javax.swing.JButton annualpic;
    private javax.swing.JButton attend_list_btn;
    private javax.swing.JPanel attendence;
    private javax.swing.JPanel attendence_list;
    private javax.swing.JLabel b_addmission;
    private javax.swing.JLabel b_admine;
    private javax.swing.JLabel b_allfile;
    private javax.swing.JLabel b_attendance;
    private javax.swing.JLabel b_classes;
    private javax.swing.JLabel b_examination;
    private javax.swing.JLabel b_home;
    private javax.swing.JLabel b_info;
    private javax.swing.JLabel b_more;
    private javax.swing.JLabel b_results;
    private javax.swing.JLabel b_students;
    private javax.swing.JLabel b_teachers;
    private javax.swing.JButton classbutton1;
    private javax.swing.JButton classbutton2;
    private javax.swing.JPanel classes;
    private javax.swing.JPanel classmanue;
    private javax.swing.JButton classone;
    private javax.swing.JPanel classshedule;
    private javax.swing.JButton exam_result_btn;
    private javax.swing.JPanel examination;
    private javax.swing.JPanel feesmanagement;
    private javax.swing.JButton five_btn;
    private javax.swing.JButton four_btn;
    private javax.swing.JButton history;
    private javax.swing.JPanel home;
    private javax.swing.JPanel infotitlemanue;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel m10allfilie;
    private javax.swing.JPanel m11admin;
    private javax.swing.JPanel m12more;
    private javax.swing.JPanel m1home;
    private javax.swing.JPanel m2info;
    private javax.swing.JPanel m3addmission;
    private javax.swing.JPanel m4students;
    private javax.swing.JPanel m5classes;
    private javax.swing.JPanel m6teachers;
    private javax.swing.JPanel m7examination;
    private javax.swing.JPanel m8results;
    private javax.swing.JPanel m9attendence;
    private javax.swing.JLabel m_absent_list;
    private javax.swing.JTable m_present_list;
    private javax.swing.JButton narsary_btn;
    private javax.swing.JButton one_btn;
    private javax.swing.JPanel p1_history;
    private javax.swing.JPanel p2_annualreport;
    private javax.swing.JPanel p3_anualfunction;
    private javax.swing.JPanel p4_annulpictic;
    private javax.swing.JButton play_btn;
    private javax.swing.JPanel resulthome;
    private javax.swing.JPanel results;
    private javax.swing.JPanel schoolinfo;
    private javax.swing.JTextField search_stu1;
    private javax.swing.JButton seven_btn;
    private javax.swing.JTable specific_student_table;
    private javax.swing.JButton take_attend_btn;
    private javax.swing.JButton take_attend_btn1;
    private javax.swing.JButton take_attend_btn2;
    private javax.swing.JPanel take_attendece;
    private javax.swing.JPanel teacher;
    private javax.swing.JPanel teacherlist;
    private javax.swing.JPanel teacherreg;
    private javax.swing.JButton three_batton;
    private javax.swing.JTable total_student_table;
    private javax.swing.JPanel total_stulist;
    private javax.swing.JButton two_btn;
    private javax.swing.JPanel welcometeacher;
    private javax.swing.JButton yearlyreport;
    // End of variables declaration//GEN-END:variables
}
