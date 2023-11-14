/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;
import javax.swing.JOptionPane;

public class dbConnect {
    public static Connection con;
    public static Statement s;
    
    static{
        try{
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spending_db"+"?openSSL=false", "root", "AjEeT@123");
        s= con.createStatement();
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null, ex);
        }
    }
}
