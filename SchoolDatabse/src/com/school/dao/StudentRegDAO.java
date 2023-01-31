
package com.school.dao;

import com.school.common.IcommonDAO;
import com.school.model.StudentReg;
import com.school.util.DBCconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class StudentRegDAO implements IcommonDAO<StudentReg>{

    Connection con=null;

    
    @Override
    public int save(StudentReg s) {
        int status=0;
         String sql= "Insert into studentsnewtable(session,stu_id,stu_name,father_name,mother_name,father_profession,mother_profession,dob,class_name,class_roll,relagion,gender,present_address,parmanent_address,gardian_number,addmission_date,pre_scl_name) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        con =DBCconnection.getConnection();
        try {
             PreparedStatement psmt= con.prepareStatement(sql);
            psmt.setInt  (1,s.getSession());
            psmt.setString(2, s.getStu_id());
            psmt.setString(3, s.getStu_name());    
            psmt.setString(4, s.getFather_name());
            psmt.setString(5, s.getMother_name());
            psmt.setString(6, s.getFather_profession());
            psmt.setString(7, s.getMother_profession());
            psmt.setString(8, s.getStu_dob());
            psmt.setString(9, s.getClass_name());
            psmt.setInt   (10, s.getCalss_roll());
            psmt.setString(11, s.getRelagion());
            psmt.setString(12, s.getGender());
            psmt.setString(13, s.getPresent_add());
            psmt.setString(14, s.getParmanent_add());
            psmt.setString(15, s.getGuardian_number());
            psmt.setString(16, s.getAddmission_date());
            psmt.setString(17, s.getPre_scl_name());
            status= psmt.executeUpdate();
            System.out.println(status);
            
            
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(status);
            
        }finally{
            try {
                con.close();
            } catch (Exception f) {
            }
        }
         
         return status;
        
    }
    
}
