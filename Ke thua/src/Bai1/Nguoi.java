package Bai1;

import java.util.Scanner;

public class Nguoi {

    private String hoten, NamSinh;

    public Nguoi() {
        this.hoten = hoten;
        NamSinh = NamSinh;

    }

    public void Nhap(){
        Scanner in = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        hoten = in.nextLine();
        System.out.print("Nam sinh: ");
        NamSinh=in.nextLine();
    }

    public void Xuat(){
        System.out.printf("%10s|%10s|",hoten,NamSinh);
    }
}
