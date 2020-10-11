/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package re_bai11;

/**
 *
 * @author trancaominhbach
 */
public class Giangvien {
     private String Hoten, MGV, Diachi, GT, Khoa;

    public Giangvien(String Hoten, String MGV, String Diachi, String GT, String Khoa) {
        this.Hoten = Hoten;
        this.MGV = MGV;
        this.Diachi = Diachi;
        this.GT = GT;
        this.Khoa = Khoa;
    }

    public Giangvien() {
    }
    
    

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getMGV() {
        return MGV;
    }

    public void setMGV(String MGV) {
        this.MGV = MGV;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

   
    
    public void Khoa_chon(){
        System.out.println("1. ĐTVT");
        System.out.println("2. CNTT");
        System.out.println("3. HTTT");
        System.out.println("4. CNM");
        System.out.println("5. CNPM");
        System.out.println("Chon khoa: ");
        
    }
    @Override
    public String toString() {
        return "Giangvien{" + "Hoten=" + Hoten + ", MGV=" + MGV + ", Diachi=" + Diachi + ", GT=" + GT + ", Khoa=" + Khoa + '}';
    }
    
}
