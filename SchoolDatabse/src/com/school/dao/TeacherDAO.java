
package com.school.dao;

import com.school.common.IcommonDAO;
import com.school.model.teachers;
import com.school.util.DBCconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class TeacherDAO implements IcommonDAO<teachers> {

    @Override
    public int save(teachers t) {
   int  status=0;
    String sql = "insert into teachers(teacher_name,teacher_email,teacher_phone,teacher_password,teacher_dob,relagion,join_date,resign_date,teducation,gender)values (?,?,?,?,?,?,?,?,?,?)";
        Connection con=  DBCconnection.getConnection();
        try {
          PreparedStatement pst=  con.prepareStatement(sql);
            pst.setString(1,t.getTeacher_name());
            pst.setString(2,t.getTeacher_email());
            pst.setString(3,t.getTeacher_phone());
            pst.setString(4,t.getTeacher_password());
            pst.setString(5,t.getTeacher_dob());
           
            pst.setString(6,t.getRelagion());       
            pst.setString(7,t.getJoin_date());
            
            pst.setString(8,t.getResign_date());
            pst.setString(9,t.getTeducation());
            pst.setString(10,t.getTgender());
      status= pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    return status;
        
    }
    
    
}
