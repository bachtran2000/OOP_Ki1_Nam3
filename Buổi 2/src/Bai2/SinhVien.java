package Bai2;

import java.util.Scanner;

public class SinhVien {
    private String masv, hoten;
    private float diemLT, diemTH;

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float DTB(){
        return (diemLT+diemTH)/2;
    }

    public void Nhap(){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        masv = in.nextLine();
        System.out.print("Nhap ho ten: ");
        hoten = in.nextLine();
        System.out.print("Nhap diem ly thuyet: ");
        diemLT = in.nextFloat();
        System.out.print("Nhap diem thuc hanh: ");
        diemTH = in.nextFloat();
    }

    public void Xuat(){
        System.out.printf("%20s|%20s|%10.2f|%10.2f\n",hoten,masv,diemLT,diemTH);
    }
    @Override
    public String toString() {
        return "SinhVien{" +
                "masv='" + masv + '\'' +
                ", hoten='" + hoten + '\'' +
                ", diemLT=" + diemLT +
                ", diemTH=" + diemTH +
                '}';
    }
}
