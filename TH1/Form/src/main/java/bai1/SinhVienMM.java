/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author arohigh
 */
public class SinhVienMM extends SinhVien {

    private float luong;

    public SinhVienMM(float luong, String MaSV, String HoTen, String NgaySinh, String GioiTinh, Float DiemTB) {
        super(MaSV, HoTen, NgaySinh, GioiTinh, DiemTB);
        this.luong = luong;
    }
    
    public SinhVienMM(String MaSV, String HoTen, String NgaySinh, String GioiTinh, Float DiemTB) {
        super(MaSV, HoTen, NgaySinh, GioiTinh, DiemTB);
    }

    SinhVienMM() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "SinhVienMM{" + "luong=" + luong + '}';
    }

    void setMasv(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
}
