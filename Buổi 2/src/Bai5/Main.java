package Bai5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<ThiSinh> ds = new ArrayList();
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao so luong thi sinh: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            ThiSinh ts = new ThiSinh();
            ts.Nhap();
            ds.add(ts);
        }

        System.out.printf("%10s|%20s|%10s|%10s|%10s|%10s\n", "Ma SV", "Ho ten", "Diem Toan", "Diem Ly", "Diem Hoa","Diem tong");
        for (int i = 0; i < n; i++) {
            ds.get(i).Xuat_info();
        }
        System.out.println("Danh sach sau sap xep: ");
        System.out.printf("%10s|%20s|%10s|%10s|%10s|%10s\n", "Ma SV", "Ho ten", "Diem Toan", "Diem Ly", "Diem Hoa","Diem tong");
        Collections.sort(ds, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh thiSinh, ThiSinh t1) {
                return thiSinh.getHoten().compareTo(t1.getHoten());
            }
        });
        for (int i = 0; i < n; i++) {
            ds.get(i).Xuat_info();
        }
    }
}
