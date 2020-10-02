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
public class SinhVien {

    protected String MaSV;
    protected String HoTen;
    protected String NgaySinh;
    protected String GioiTinh;
    protected Float DiemTB;

    public SinhVien(String MaSV, String HoTen, String NgaySinh, String GioiTinh, Float DiemTB) {
        this.MaSV = MaSV;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.DiemTB = DiemTB;
    }

    public void HienThi() {
        System.out.println("Ma SV: " + this.MaSV);
        System.out.println("Ho ten: " + this.HoTen);
        System.out.println("Ngay sinh: " + this.NgaySinh);
        System.out.println("Gioi tinh: " + this.GioiTinh);
        System.out.println("DiemTB: " + this.DiemTB);
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Float getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(Float DiemTB) {
        this.DiemTB = DiemTB;
    }
    
    

}
