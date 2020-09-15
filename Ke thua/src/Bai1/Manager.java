package Bai1;

import java.util.Scanner;

public class Manager {
    SinhVien[] sv = new SinhVien[100];
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void Menu() {
        System.out.println("1. Nhap");
        System.out.println("2. Xuat");
        System.out.println("3. Sap xep theo diem TB");
        System.out.println("4. Tim kiem theo ma sv");
        System.out.println("5. Thoat");
        System.out.print("Chon: ");
    }

    public void Nhap() {
        System.out.println("Nhap vao so luong sinh vien: ");
        setN(new Scanner(System.in).nextInt());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao sinh vien thu " + (i + 1) + ": ");
            sv[i] = new SinhVien();
            sv[i].Nhap();
        }
    }

    public void Xuat() {
        System.out.println("Danh sach sinh vien:");
        System.out.printf("%10s|%10s|%10s|%10s\n","Ma SV","Ten","Nam sinh","Diem TB");
        for (int i = 0; i < n; i++) {

            sv[i].Xuat();
        }
    }

    public enum Xeploai {


    }

    public void sapxep() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sv[i].getDiemTB() > sv[j].getDiemTB()) {
                    SinhVien tmp = sv[j];
                    sv[j] = sv[i];
                    sv[i] = tmp;
                }
            }
        }
        Xuat();
    }

    public void  find(){
        System.out.print("Nhap vao thong tin tim kiem: ");
        String find_MSV;
        find_MSV = new Scanner(System.in).nextLine();
        for (int i=0;i<n;i++){
            if (find_MSV == sv[i].getMaSV())
                sv[i].Xuat();
        }
    }

}
