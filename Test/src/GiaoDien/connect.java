/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
 import java.sql.*;
import javax.swing.*;
import java.util.*;
import javax.swing.JScrollPane;
/**
 *
 * @author Admin
 */
public class connect {
    public Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
               
               con = (Connection) DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;databaseName=DoAnCuoiKy;user=sa;password=1703");
                if (con!=null)
                {
                    System.out.println("Ket noi thanh cong ");
                }
        } catch (Exception e) {
        }
      return con;
      
    }
}
