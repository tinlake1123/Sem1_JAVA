/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DatabaseStore.DatabaseStore;
import GiaoDien.HocSinh;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.Connection;

/**
 *
 * @author Admin
 */
public class HocSinhDao {

    public insert(HocSinh hs) throws Exception {
    String sql = "insert into HocSinh (STT,HoTen,Lop,GioiTinh,Truong,Ngaysinh,QueQuan,CMND,SoBaoDanh,Ngaythi,Tohopmon) values (?,?,?,?,?,?,?,?,?,?,?)";
           try {
            Connection con = DatabaseStore.openConnection();
            PreparedStatement rsm = con.prepareStatement(sql);
        } {
        
          
                    
    }

    }
}
