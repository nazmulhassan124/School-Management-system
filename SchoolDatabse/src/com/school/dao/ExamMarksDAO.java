
package com.school.dao;

import com.school.common.IcommonDAO;
import com.school.model.ExamMarks;
import com.school.util.DBCconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class ExamMarksDAO implements IcommonDAO<ExamMarks>{

    @Override
    public int save(ExamMarks m) {
        
        int status=0;
         String sql= "Insert into exammarkstable(session,semister,class_name,stu_id,ban_1st,ban_2nd,eng_1st,eng_2nd,math,islam,science,sociolozy,ict,gk,dairy,drawing) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection con =DBCconnection.getConnection();
        try {
             PreparedStatement psmt= con.prepareStatement(sql);
           
             psmt.setInt  (1,m.getSession());
            psmt.setString(2, m.getSemister());
            psmt.setString(3,m.getClass_name() );    
            psmt.setString(4, m.getStu_id());
            psmt.setInt(5, m.getBan_1st());
            psmt.setInt(6,m.getBan_2nd());
            psmt.setInt(7, m.getEng_1st());
            psmt.setInt(8, m.getEng_2nd());
            psmt.setInt(9, m.getMath());
           
            psmt.setInt(10, m.getIslam());
            psmt.setInt(11, m.getScience());
            psmt.setInt(12, m.getSociolozy());
            psmt.setInt(13, m.getIct());
            psmt.setInt(14, m.getGk());
            psmt.setInt(15, m.getDairy());
            psmt.setInt(16, m.getDrawing());
            status= psmt.executeUpdate();
            System.out.println(status);
            
            
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(status);
            
        }
        
       
        return status;
       
    }
    
    
    
    
}
