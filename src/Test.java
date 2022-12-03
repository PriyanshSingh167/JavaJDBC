/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roste
 */

import com.connection.DBConnection;
import java.sql.*;
import java.util.Scanner;




public class Test {
    public static void main(String [] args) {
        try
        {
            Connection con = DBConnection.getConnection();
            
            // 3.Create Statement
            String query = "INSERT INTO person VALUES(? , ?)";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, 9);
            st.setString(2, "Devin");
            
            // 4.Execute Query 
            int i = st.executeUpdate();
            System.out.println(i);
            // executeQuery return an object of ResultSet
            
            
            
            // 5.Close connection
            con.close();
//            if (flag) {
//                System.out.println("Name exists");
//            }else {
//               System.out.println("Name not found");
//            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
