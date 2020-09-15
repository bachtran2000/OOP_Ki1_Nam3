package Bai7;

import java.util.Scanner;

public class Nguoi {
    private String hoten;
    private int tuoi;

    public Nguoi(String hoten) {
        this.hoten = hoten;
    }

    public Nguoi() {
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

    public void Nhap(){
        System.out.println("Nhap ho ten:");
        setHoten(new Scanner(System.in).nextLine());
        System.out.println("Nhap tuoi:");
        setTuoi(new Scanner(System.in).nextInt());
    }

    public void Xuat(){
        System.out.println("Ho ten: "+getHoten()+" Tuoi: "+getTuoi());

    }
}
