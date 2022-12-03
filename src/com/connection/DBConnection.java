/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connection;

import java.sql.*;

/**
 *
 * @author roste
 */
public class DBConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            // 1.Register driver class , If driver is not registered then ClassNotFound will be generated 
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2.Create Connection
            String path = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String password = "sqlpassword";
            con = DriverManager.getConnection(path, username, password);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return con;
    }
}
