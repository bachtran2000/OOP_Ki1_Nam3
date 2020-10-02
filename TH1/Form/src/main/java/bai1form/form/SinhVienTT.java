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
public class SinhVienTT extends SinhVien{
    private float hocPhi;

    public SinhVienTT(float hocPhi, String HoTen, String gioiTinh) {
        super(HoTen, gioiTinh);
        this.hocPhi = hocPhi;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return "SinhVienTT{" + "hocPhi=" + hocPhi + '}';
    }

}