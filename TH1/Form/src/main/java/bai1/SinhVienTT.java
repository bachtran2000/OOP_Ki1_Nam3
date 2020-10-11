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
public class SinhVienTT extends SinhVien {

    private Float HocPhi;

    public SinhVienTT(Float HocPhi, String MaSV, String HoTen, String NgaySinh, String GioiTinh, Float DiemTB) {
        super(MaSV, HoTen, NgaySinh, GioiTinh, DiemTB);
        this.HocPhi = HocPhi;
    }

    SinhVienTT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    
    

    public Float getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(Float HocPhi) {
        this.HocPhi = HocPhi;
    }

    public SinhVienTT(String MaSV, String HoTen, String NgaySinh, String GioiTinh, Float DiemTB, Float HocPhi) {
        super(MaSV, HoTen, NgaySinh, GioiTinh, DiemTB);
        this.setHocPhi(HocPhi);
    }

    public void HienThi() {
        super.HienThi();
        System.out.println("Hoc phi: " + this.getHocPhi());
    }

}
