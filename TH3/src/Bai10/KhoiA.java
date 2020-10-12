package Bai10;

import java.util.Scanner;

public class KhoiA extends ThiSinh{
    private float DT,DL,DH;

    public KhoiA(String SBD, String HT, String DC, String UT) {
        super(SBD, HT, DC, UT);
    }

    public float getDT() {
        return DT;
    }

    public void setDT(float DT) {
        this.DT = DT;
    }

    public float getDL() {
        return DL;
    }

    public void setDL(float DL) {
        this.DL = DL;
    }

    public float getDH() {
        return DH;
    }

    public void setDH(float DH) {
        this.DH = DH;
    }

    public ThiSinh getTs() {
        return ts;
    }

    public void setTs(ThiSinh ts) {
        this.ts = ts;
    }

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
        System.out.printf("%4s|%20s|%20s|%10s|%10.2f|%10.2f|%10.2f|\n",SBD,HT,DC,UT,DT,DL,DH);
    }


}
