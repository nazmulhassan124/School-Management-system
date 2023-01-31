
package com.school.dao;

import com.school.common.IcommonDAO;
import com.school.model.Address;
import com.school.util.DBCconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class AddressDAO implements IcommonDAO<Address>{

    @Override
    public int save(Address a) {
        int status =0;
        String sql = "insert into address(add_id,villege,postoffice,postcode,thana,zilla)values (?,?,?,?,?,?)";
        Connection con = DBCconnection.getConnection();
        try {
           PreparedStatement psmt= con.prepareStatement(sql);
            psmt.setInt(1,a.getAdd_id());
            psmt.setString(2,a.getVillege());
            psmt.setString(3,a.getPostoffice());
            psmt.setString(4,a.getPostcode());
            psmt.setString(5,a.getThana());
            psmt.setString(6,a.getZilla());
         
          
            
            status=psmt.executeUpdate();  // success hole 1 hobe...
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return status;
        
    }

    
    
}
