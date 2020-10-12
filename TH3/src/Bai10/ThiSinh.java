package Bai10;

import java.util.Scanner;

public class ThiSinh {
    protected String SBD, HT, DC, UT;

    public ThiSinh() {
    }

    public ThiSinh(String SBD, String HT, String DC, String UT) {
        this.SBD = SBD;
        this.HT = HT;
        this.DC = DC;
        this.UT = UT;
    }

    public String getSBD() {
        return SBD;
    }

    public String getHT() {
        return HT;
    }

    public String getDC() {
        return DC;
    }

    public String getUT() {
        return UT;
    }

    public void Nhap(){
        System.out.print("Nhap vao SBD: ");
        SBD = new Scanner(System.in).nextLine();
        System.out.print("Nhap vao Ho ten: ");
        HT = new Scanner(System.in).nextLine();
        System.out.print("Nhap vao dia chi: ");
        DC = new Scanner(System.in).nextLine();
        System.out.print("Nhap vao uu tien: ");
        UT = new Scanner(System.in).nextLine();
    }

    public void Xuat(){
        System.out.println("Thong tin da nhap: ");
        System.out.printf("%4s|%20s|%20s|%10s|","SBD","Ho ten","Dia chi","Uu tien");
    }

    @Override
    public String toString() {
        return "ThiSinh{" +
                "SBD='" + SBD + '\'' +
                ", HT='" + HT + '\'' +
                ", DC='" + DC + '\'' +
                ", UT='" + UT + '\'' +
                '}';
    }

    public float getDT() {
        return 0;
    }

    public float getDL() {
    }
}
