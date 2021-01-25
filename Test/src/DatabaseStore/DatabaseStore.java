/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseStore;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class DatabaseStore {
    public static Connection openConnection() throws Exception
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=DoAnCuoiKy;user=sa;password=1703";
                java.sql.Connection con = DriverManager.getConnection(url);
                Statement sm = con.createStatement();
                ResultSet rs = sm.executeQuery("Select * from NhanVien");
                ResultSetMetaData rsm = rs.getMetaData();
        return (Connection) con;
        
    }
}
