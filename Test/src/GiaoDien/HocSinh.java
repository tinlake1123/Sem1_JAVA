/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

/**
 *
 * @author Admin
 */
public class HocSinh {

    int STT;
    String HoTen, Lop, GioiTinh, Truong, Ngaysinh, QueQuan, CMND, SoBaoDanh, Ngaythi, Tohopmon;

    public HocSinh() {
    }

    public HocSinh(int STT, String HoTen, String Lop, String GioiTinh, String Truong, String Ngaysinh, String QueQuan, String CMND, String SoBaoDanh, String Ngaythi, String Tohopmon) {
        this.STT = STT;
        this.HoTen = HoTen;
        this.Lop = Lop;
        this.GioiTinh = GioiTinh;
        this.Truong = Truong;
        this.Ngaysinh = Ngaysinh;
        this.QueQuan = QueQuan;
        this.CMND = CMND;
        this.SoBaoDanh = SoBaoDanh;
        this.Ngaythi = Ngaythi;
        this.Tohopmon = Tohopmon;
    }

  

    

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getTruong() {
        return Truong;
    }

    public void setTruong(String Truong) {
        this.Truong = Truong;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getSoBaoDanh() {
        return SoBaoDanh;
    }

    public void setSoBaoDanh(String SoBaoDanh) {
        this.SoBaoDanh = SoBaoDanh;
    }

    public String getNgaythi() {
        return Ngaythi;
    }

    public void setNgaythi(String Ngaythi) {
        this.Ngaythi = Ngaythi;
    }

    public String getTohopmon() {
        return Tohopmon;
    }

    public void setTohopmon(String Tohopmon) {
        this.Tohopmon = Tohopmon;
    }

}
