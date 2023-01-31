
package com.school.dao;

import com.school.common.IcommonDAO;
import com.school.model.TeacherReg;
import com.school.util.DBCconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;




public class TeacherRegDAO implements IcommonDAO<TeacherReg>{
 Connection con = null;
    @Override
    public int save(TeacherReg t) {
        int status=0;
         String sql= "Insert into teachersnewtable(tea_id,tea_name,designation,father_name,mother_name,dob,nid,relagion,gender,tea_mobile,tea_education,present_add,parmanent_add,join_date) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        con =DBCconnection.getConnection();
        try {
             PreparedStatement psmt= con.prepareStatement(sql);
            psmt.setString (1,t.getTea_id());
            psmt.setString(2, t.getTea_name());
            psmt.setString(3, t.getDesignation());    
            psmt.setString(4, t.getFather_name());
            psmt.setString(5,t.getMother_name());
            psmt.setString(6, t.getDob());
            psmt.setString(7, t.getNid());
            psmt.setString(8, t.getRelagion());
            psmt.setString(9, t.getGender());
            psmt.setString  (10, t.getTea_mobile());
            psmt.setString(11, t.getTea_education());
            psmt.setString(12, t.getPresent_add());
            psmt.setString(13, t.getParmanent_add());
            psmt.setString(14, t.getJoin_date());
      
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
