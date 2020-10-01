package Bai1;

import java.util.Scanner;

public class Student {
    private String hoten;
    private int tuoi;

    public Student() {
    }

    public Student(String hoten, int tuoi) {
        this.hoten = hoten;
        this.tuoi = tuoi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        tuoi = sc.nextInt();
    }

    public void xuat() {
        System.out.println("HO TEN" + hoten + "\n"
                + "Tuoi" + tuoi);
    }
}
