/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class HocSinhModify {
HocSinh a;
    public List<HocSinh> thongtin() {
        List<HocSinh> hslist = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=DoAnCuoiKy;user=sa;password=1703";
            Connection con = DriverManager.getConnection(url);
            Statement sm = con.createStatement();
            ResultSet rs = sm.executeQuery("Select * from Hocsinh");
            ResultSetMetaData rsm = rs.getMetaData();

            while (rs.next()) {
                HocSinh hs = new HocSinh(rs.getInt("STT"), rs.getString("HoTen"), rs.getString("Lop"), rs.getString("GioiTinh"), rs.getString("Truong"), rs.getString("Ngaysinh"), rs.getString("Quequan"), rs.getString("CMND"), rs.getString("SoBaoDanh"),
                        rs.getString("Ngaythi"), rs.getString("Tohopmon"));
                hslist.add(hs);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return hslist;
    }
    public void add(HocSinh hs)
    {
        PreparedStatement std = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=DoAnCuoiKy;user=sa;password=1703";
            Connection con = DriverManager.getConnection(url);
            std = con.prepareCall("Inset into Hocsinh (HoTen) values (?,?,?,?,?,?,?,?,?,?)");
        std.setString(1,hs.getHoTen());
           

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
