/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1form.form;

/**
 *
 * @author trancaominhbach
 */
public class SinhVien {
    protected String HoTen;
    protected String gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String HoTen, String gioiTinh) {
        this.HoTen = HoTen;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "HoTen=" + HoTen + ", gioiTinh=" + gioiTinh + '}';
    }
    

}