/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.login.register;

/**
 *
 * @author mayank
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection
{
    public static Connection getConnection()
    {
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/Student Registrations","root","");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
