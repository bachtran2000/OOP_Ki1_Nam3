package QLSV;

import java.util.Scanner;

public class SinhVien {
    protected String MSV, Hoten, Ngaysinh;
    protected float diemTB;

    public SinhVien() {
    }

    public SinhVien(String MSV, String hoten, String ngaysinh, float diemTB) {
        this.MSV = MSV;
        Hoten = hoten;
        Ngaysinh = ngaysinh;
        this.diemTB = diemTB;
    }

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        Ngaysinh = ngaysinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public void Nhap(){
        System.out.print("Nhap MSV: ");
        MSV = new Scanner(System.in).nextLine();
        System.out.print("Nhap ho ten: ");
        Hoten = new Scanner(System.in).nextLine();
        System.out.print("Nhap Ngay sinh: ");
        Ngaysinh = new Scanner(System.in).nextLine();
        System.out.print("Nhap diem trung binh: ");
        diemTB = new Scanner(System.in).nextFloat();
    }

    @Override
    public String toString() {
        return "Thong tin sinh vien: " +
                "MSV = '" + MSV + '\'' +
                ", Hoten = '" + Hoten + '\'' +
                ", Ngaysinh = '" + Ngaysinh + '\'' +
                ", diemTB = " + diemTB;
    }
}
