package bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
    ArrayList <ThiSinh> ts = new ArrayList();
    ThiSinh TS = new ThiSinh();
    public void Nhap_TS() {
        while (true){
            String chon;
            System.out.print("Nhap thong tin thi sinh khoi(A/B/C/N de thoat): ");
            chon = new Scanner(System.in).nextLine();
            switch (chon){
                case "A":
                    ThiSinh khoia = new KhoiA();
                    khoia.Nhap();
                    ts.add(khoia);
                    break;
                case "B":
                    ThiSinh khoib = new KhoiB();
                    khoib.Nhap();
                    ts.add(khoib);
                    break;
                case "C":
                    ThiSinh khoic = new KhoiC();
                    khoic.Nhap();
                    ts.add(khoic);
                    break;
                case "n":
                    return;
            }
        }
    }

    public void Xuat_TS(){
        for(int i=0;i<ts.size();i++){
            ts.get(i).Xuat();
        }
    }

    public void find_TS(){
        System.out.print("Nhap vao SBD can tim: ");
        String f_SBD = new Scanner(System.in).nextLine();
        if(ts.contains(f_SBD)==true)
            TS.Xuat();
        else System.out.println("Khong tim thay");
    }
}
