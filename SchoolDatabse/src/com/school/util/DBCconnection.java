
package com.school.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DBCconnection {
    
    public static Connection getConnection (){   // static hoai dot diye dhora jabe
      Connection con = null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school_database","root","root");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } 
        
        return con;
    }
    
}
