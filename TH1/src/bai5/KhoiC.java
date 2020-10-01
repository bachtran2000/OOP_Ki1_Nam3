package bai5;

import java.util.Scanner;

public class KhoiC extends ThiSinh{
    private float DV,DS,DD;

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.print("Nhap diem van: ");
        DV = new Scanner(System.in).nextFloat();
        System.out.print("Nhap diem su: ");
        DS = new Scanner(System.in).nextFloat();
        System.out.print("Nhap diem dia: ");
        DD = new Scanner(System.in).nextFloat();
    }

    ThiSinh ts = new ThiSinh();
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.printf("%10s|%10s|%10s|\n","Diem Van","Diem Su","Diem Dia");
        System.out.printf("%4s|%20s|%20s|%10s|%10.2f|%10.2f|%10.2f|\n",ts.getSBD(),ts.getHT(),ts.getDC(),ts.getUT(),DV,DS,DD);
    }
}
