package Bai1;

import java.util.Scanner;

public class SinhVien extends Nguoi {
    private String maSV;
    private float diemTB;
    private String XL;

    public SinhVien() {
    }

    public SinhVien(String maSV, float diemTB, String XL) {
        this.maSV = maSV;
        this.diemTB = diemTB;
        this.XL = XL;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public String getXL() {
        return XL;
    }

    public void setXL(String XL) {
        this.XL = XL;
    }

    public void Nhap(){
        Scanner in = new Scanner(System.in);

        System.out.print("Ma sinh vien: ");
        maSV = in.nextLine();
        super.Nhap();
        System.out.print("Nhap diem trung binh: ");
        diemTB = in.nextFloat();
    }

    public void Xuat(){
        XepLoai();
        System.out.printf("%10s|",maSV);
        super.Xuat();
        System.out.printf("%10.2f|",diemTB);
        System.out.printf("%10s\n",XL);
    }

    public void XepLoai(){
        if (diemTB<=4 && diemTB>=0)
            XL= String.valueOf(Level.Yeu);
        else if (diemTB>4 && diemTB<=6)
            XL= String.valueOf(Level.TB);
        else if (diemTB>6 && diemTB<=8)
            XL= String.valueOf(Level.Kha);
        else if (diemTB<=10 && diemTB>6)
            XL= String.valueOf(Level.Gioi);
    }

    public enum Level{
        Yeu,
        TB,
        Kha,
        Gioi
    }

}
