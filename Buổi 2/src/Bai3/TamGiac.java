package Bai3;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class TamGiac {
    private float a, b, c;
    private float CV, DT;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public void Nhap() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap vao 3 canh cua tam giac: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
    }

    public void Xuat() {
        System.out.println("Cac canh tam giac vua nhap: ");
        System.out.println("Canh 1 = " + a);
        System.out.println("Canh 2 = " + b);
        System.out.println("Canh 3 = " + c);
    }

    public boolean is_TGV() {
        if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) return true;
        return false;
    }

    public boolean is_Triagle() {
        if (a + b > c || a + c > b || b + c > a) {
            return true;
        } else return false;
    }

    public void kind_Trialge() {
        if (is_Triagle()) {
            if (is_TGV())
                System.out.println("Tam giac vuong");
            else if (a == b && a == c || b == c && a == c || b == c && a == b)
                System.out.println("Tam giac can");
            else if (a == b && a == c && b == c)
                System.out.println("Tam giac deu");
            else if (a == b && a == c && is_TGV() || b == c && a == c && is_TGV() || b == c && a == b && is_TGV())
                System.out.println("Tam giac vuong can");
            else System.out.println("La tam giac thuong!");
        } else System.out.println("Khong phai tam giac");
    }

    public void ChuVi() {
        if (is_Triagle())
        System.out.println("Chu vi = " + (a + b + c));
    }

    public void DienTich() {
        if (is_Triagle())
        System.out.println("Dien tich = " + (sqrt((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b)) * 1 / 4));
    }
}
