package QLSV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Manager {
    ArrayList<SinhVien> dssv = new ArrayList();

    public void Nhap() {
        System.out.print("Nhap so luong sinh vien: ");
        int n = new Scanner(System.in).nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao sinh vien thu " + (i + 1) + ": ");
            SinhVien sv = new SinhVien();
            sv.Nhap();
            dssv.add(sv);
        }
    }

    public void Xuat() {
        for (int i = 0; i < dssv.size(); i++) {
            SinhVien sv = dssv.get(i);
            System.out.println(sv.toString());
        }
    }

    public void find_SV() {
        System.out.print("Nhap ma sinh vien can tim: ");
        String find_MSV = new Scanner(System.in).nextLine();
        boolean flag = false;
        for (int i = 0; i < dssv.size(); i++) {
            SinhVien sv = dssv.get(i);
            if (find_MSV.equals(sv.getMSV())) {
                System.out.println("Thong tin sinh vien tim duoc la: ");
                sv = dssv.get(i);
                System.out.println(sv.toString());
                flag = true;
            }
        }
        if (!flag) System.out.println("Khong co sinh vien can tim!");
    }

    public void SX_up() {

    }

    public void menu() {
        System.out.println("1. Nhap danh sach sinh vien");
        System.out.println("2. Xuat danh sach sinh vien");
        System.out.println("3. Tim kiem sinh vien theo MSV");
        System.out.println("4. Sap xep tang");
        System.out.println("5. Thoat");
        System.out.print("Chon: ");
    }
}
