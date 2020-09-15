package Bai1;

import java.util.Scanner;

public class SinhVien extends Nguoi {
    private String maSV;
    private float diemTB;

    public SinhVien(String maSV, float diemTB) {
        super();
        this.maSV = maSV;
        this.diemTB = diemTB;
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

    public SinhVien() {

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
        System.out.printf("%10s|",maSV);
        super.Xuat();
        System.out.printf("%2.2f",diemTB);
        System.out.println();
    }
}
