package Bai10;

import java.util.Scanner;

public class KhoiC extends ThiSinh{
    private float DV,DS,DD;

    public float getDV() {
        return DV;
    }

    public void setDV(float DV) {
        this.DV = DV;
    }

    public float getDS() {
        return DS;
    }

    public void setDS(float DS) {
        this.DS = DS;
    }

    public float getDD() {
        return DD;
    }

    public void setDD(float DD) {
        this.DD = DD;
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
        System.out.printf("%4s|%20s|%20s|%10s|%10.2f|%10.2f|%10.2f|\n",SBD,HT,DC,UT,DV,DS,DD);
    }

    public String TTTS(){
        return super.TTTS()+" $ Diem Van: "+DV+" $ Diem Su: "+DS + " $ Diem Dia: "+DD;
    }
}
