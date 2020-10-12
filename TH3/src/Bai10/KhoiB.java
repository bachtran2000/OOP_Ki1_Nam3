package Bai10;

import java.util.Scanner;

public class KhoiB extends ThiSinh{
    private float DT,DH,DS;

    public float getDT() {
        return DT;
    }

    public void setDT(float DT) {
        this.DT = DT;
    }

    public float getDH() {
        return DH;
    }

    public void setDH(float DH) {
        this.DH = DH;
    }

    public float getDS() {
        return DS;
    }

    public void setDS(float DS) {
        this.DS = DS;
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
        System.out.print("Nhap diem sinh: ");
        DS = new Scanner(System.in).nextFloat();
        System.out.print("Nhap diem hoa: ");
        DH = new Scanner(System.in).nextFloat();
    }
    ThiSinh ts = new ThiSinh();
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.printf("%10s|%10s|%10s|\n","Diem Toan","Diem Sinh","Diem Hoa");
        System.out.printf("%4s|%20s|%20s|%10s|%10.2f|%10.2f|%10.2f|\n",SBD,HT,DC,UT,DT,DS,DH);
    }

    public String TTTS(){
        return super.TTTS()+" $ Diem toan: "+DT+" $ Diem Sinh: "+DS + " $ Diem Hoa: "+DH;
    }

}
