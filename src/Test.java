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

// @Insert Operation


//import java.sql.*;
//import java.util.Scanner;
//public class Test {
//    public static void main(String [] args) {
//        Scanner sc = new Scanner(System.in);
//        int id = sc.nextInt();
//        sc.nextLine();
//        String name = sc.nextLine();
//        try
//        {
//            
//            // 3.Create Statement
//            Statement at = con.createStatement();
//            
//            // 4.Execute Query 
//            String query = "insert into person values("+id+", '"+name+"')";
//            at.execute(query);
//            
//            System.out.println("Data Inserted Successfully");
//            
//            // 5.Close connection
//            con.close();
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
//    }
//}

// @Select Operation

//import java.sql.*;
//import java.util.Scanner;
//public class Test {
//    public static void main(String [] args) {
//
//        try
//        {
//            
//            
//            // 3.Create Statement
//            Statement at = con.createStatement();
//            
//            // 4.Execute Query 
//            String query = "SELECT * FROM person";
//            // executeQuery return an object of ResultSet
//            ResultSet res = at.executeQuery(query);
//            
//            while(res.next()) {
//                //System.out.print(res.getInt(1) + " " + res.getString(2));
//                System.out.print(res.getInt("id") + " " + res.getString("Name"));
//
//            }
//            
//            // 5.Close connection
//            con.close();
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
//    }
//}


// @ Search Query
public class Test {
    public static void main(String [] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter name to be searched");
//        String name = sc.nextLine();
//        boolean flag = false;
        try
        {
            Connection con = DBConnection.getConnection();
            
            // 3.Create Statement
            Statement at = con.createStatement();
            
            // 4.Execute Query 
//            String query = "SELECT * FROM person WHERE name='"+name+"'";
            String query = "SELECT * FROM person LIMIT 0, 3";

            // executeQuery return an object of ResultSet
            ResultSet res = at.executeQuery(query);
            
            // @This while loop will loop through all te records
            
//            while(res.next()) {
//                flag = true;
//                break;
//            }

            // @If we want to find the first record then we have to use if statement
            
            // A. Finding first
//            if (res.first()) {
//                System.out.print(res.getInt("id") + " " + res.getString("Name"));
//            }
            // B. Finding last
//            if (res.last()) {
//                System.out.print(res.getInt("id") + " " + res.getString("Name"));
//            }
            
            // C. Applying LIMIT
            
            while (res.next()){
                System.out.println(res.getInt("id") + " " + res.getString("Name"));
            }
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
