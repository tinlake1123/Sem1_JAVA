/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import GiaoDien.HocSinh;
import GiaoDien.Quantrivien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HocSinhArraylist {

    public static List<HocSinh> findAll() {
        List<HocSinh> HocSinhList = new ArrayList<>();

        Connection conn = null;
        Statement st = null;

        try {
            //lay tat ca danh sach sinh vien
            conn = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;databaseName=DoAnCuoiKy;user=sa;password=1703");

            //query
            String sql = "select * from HocSinh";
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                HocSinh hs = new HocSinh(rs.getInt("STT"),
                        rs.getString("HoTen"), rs.getString("Lop"),
                        rs.getString("GioiTinh"), rs.getString("Truong"), rs.getString("Ngaysinh"),
                        rs.getString("QueQuan"), rs.getString("CMND"), rs.getString("SoBaoDanh"),
                        rs.getString("NgayThi"), rs.getString("Tohopmon"));
                HocSinhList.add(hs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhArraylist.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HocSinhArraylist.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HocSinhArraylist.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return HocSinhList;
    }

    public static void showHocSinh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insert(HocSinh hs) {
        Connection con = null;
        PreparedStatement stm = null;

        try {
            //lay tat ca danh sach sinh vien
            con = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;databaseName=DoAnCuoiKy;user=sa;password=1703");

            //query
            String sql = "insert into Hocsinh (STT, HoTen, Lop, GioiTinh, Truong,Ngaysinh,QueQuan,CMND,SoBaoDanh,Ngaythi,Tohopmon)" + "values(?, ?, ?, ?, ?,?,?,?,?,?,?)";
            stm = con.prepareCall(sql);

            stm.setInt(1, hs.getSTT());
            stm.setString(2, hs.getHoTen());
            stm.setString(3, hs.getLop());
            stm.setString(4, hs.getGioiTinh());
            stm.setString(5, hs.getTruong());
            stm.setString(6, hs.getNgaysinh());
            stm.setString(7, hs.getQueQuan());
            stm.setString(8, hs.getCMND());
            stm.setString(9, hs.getSoBaoDanh());
            stm.setString(10, hs.getNgaythi());
            stm.setString(11, hs.getTohopmon());

            stm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhArraylist.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HocSinhArraylist.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HocSinhArraylist.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }                 
}
