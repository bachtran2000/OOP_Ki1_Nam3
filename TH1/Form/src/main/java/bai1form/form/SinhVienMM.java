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
public class SinhVienMM extends SinhVien{
    private float luong;

    public SinhVienMM(float luong, String HoTen, String gioiTinh) {
        super(HoTen, gioiTinh);
        this.luong = luong;
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

    
    
}
