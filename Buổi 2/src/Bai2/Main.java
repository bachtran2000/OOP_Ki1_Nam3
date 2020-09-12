package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<SinhVien> ds = new ArrayList();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao so luong sinh vien: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            SinhVien sv = new SinhVien();
            sv.Nhap();
            ds.add(sv);
        }

        System.out.printf("%20s|%20s|%10s|%10s\n","Ho ten","Ma SV","Diem LT","Diem TH");
        for (int i = 0; i < n; i++) {
            ds.get(i).Xuat();
        }
    }
}
