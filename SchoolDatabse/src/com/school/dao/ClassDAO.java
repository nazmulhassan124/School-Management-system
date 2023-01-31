
package com.school.dao;

import com.school.common.IcommonDAO;
import com.school.util.DBCconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.school.model.Class;

public class ClassDAO implements IcommonDAO<Class>{

    @Override
    public int save(Class c) {
     int status=0;
     String sql3 ="Insert into class(class_id,class_name,shift,class_teacher)values(?,?,?,?)";
     Connection con = DBCconnection.getConnection();
        try {
           PreparedStatement psmt= con.prepareStatement(sql3); 
          psmt.setInt(1, c.getClass_id());
          psmt.setString(2, c.getClass_name());
          psmt.setString(3, c.getShift());
          psmt.setString(4, c.getClass_teacher());
         status= psmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
     return status;
    }

    
    
    
    
    
}
