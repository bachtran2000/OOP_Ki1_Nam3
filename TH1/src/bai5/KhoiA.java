package bai5;

import java.util.Scanner;

public class KhoiA extends ThiSinh{
    private float DT,DL,DH;

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.print("Nhap diem toan: ");
        DT = new Scanner(System.in).nextFloat();
        System.out.print("Nhap diem ly: ");
        DL = new Scanner(System.in).nextFloat();
        System.out.print("Nhap diem hoa: ");
        DH = new Scanner(System.in).nextFloat();
    }
    ThiSinh ts = new ThiSinh();
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.printf("%10s|%10s|%10s|\n","Diem Toan","Diem Ly","Diem Hoa");
        System.out.printf("%4s|%20s|%20s|%10s|%10.2f|%10.2f|%10.2f|\n",ts.getSBD(),ts.getHT(),ts.getDC(),ts.getUT(),DT,DL,DH);
    }
}
