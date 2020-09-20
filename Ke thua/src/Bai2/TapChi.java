package Bai2;


import java.util.Scanner;

public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private int thangPhatHanh;

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        super.input();
        System.out.print("Nhap so phat hanh: ");
        soPhatHanh = Integer.parseInt(scan.nextLine());
        System.out.print("Nhap thang phat hanh: ");
        thangPhatHanh = Integer.parseInt(scan.nextLine());
    }

    public void output() {
        super.output();
        System.out.printf("%-20s %-20s %-20s %-20d %-20sn", " ", " ",
                soPhatHanh, thangPhatHanh, " ");
    }
}

