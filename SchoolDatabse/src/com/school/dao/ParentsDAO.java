
package com.school.dao;

import com.school.common.IcommonDAO;
import com.school.model.Parents;
import com.school.util.DBCconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class ParentsDAO implements IcommonDAO <Parents>{

    @Override
    public int save(Parents p ) {
       int status =0;
       String sql2="insert into parents(f_name,m_name,f_number,m_number,f_profession,m_profession,add_id)values(?,?,?,?,?,?,?)";
        Connection con= DBCconnection.getConnection();
        try {
         PreparedStatement pst=   con.prepareStatement(sql2);
         pst.setString(1, p.getF_name());
         pst.setString(2, p.getM_name());
         pst.setString(3, p.getF_number());
         pst.setString(4, p.getM_number());
         pst.setString(5, p.getF_profession());
         pst.setString(6, p.getM_profession());
         pst.setInt(7, p.getAdd_id());
         status = pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
        
    }

    
}
