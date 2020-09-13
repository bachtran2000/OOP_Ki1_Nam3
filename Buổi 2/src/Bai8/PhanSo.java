package Bai8;

import java.util.Scanner;

public class PhanSo {
    private int a, b;

    public PhanSo() {

    }

    public PhanSo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void Nhap() {
        Scanner in = new Scanner(System.in);
        this.a = in.nextInt();
        this.b = in.nextInt();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void Xuat() {
        System.out.println(a + "/" + b);
    }

    public void Sum(int ts1, int ms1) {
        int tong_ts;
        int tong_ms;
        int Ts1, Ts2;
        if (ms1 == b) {
            tong_ts = a + ts1;
            System.out.println("Tong " + a + "/" + b + " + " + ts1 + "/" + ms1 + " = " + tong_ts/UCLN(tong_ts,ms1) + "/" + ms1/UCLN(tong_ts,ms1));
        } else {
            tong_ms = ms1 * b;
            Ts1 = a * ms1;
            Ts2 = ts1 * b;
            tong_ts = Ts1 + Ts2;
            System.out.println("Tong " + a + "/" + b + " + " + ts1 + "/" + ms1 + " = " + tong_ts/UCLN(tong_ts,tong_ms) + "/" + tong_ms/UCLN(tong_ts,tong_ms));
        }

    }

    public void Hieu(int ts1, int ms1) {
        int hieu_ts;
        int hieu_ms;
        int Ts1, Ts2;
        if (ms1 == b) {
            hieu_ts = a + ts1;
            System.out.println("Hieu " + a + "/" + b + " - " + ts1 + "/" + ms1 + " = " + hieu_ts/UCLN(hieu_ts,ms1) + "/" + ms1/UCLN(hieu_ts,ms1));
        } else {
            hieu_ms = ms1 * b;
            Ts1 = a * ms1;
            Ts2 = ts1 * b;
            hieu_ts = Ts1 - Ts2;
            System.out.println("Hieu " + a + "/" + b + " - " + ts1 + "/" + ms1 + " = " + hieu_ts/UCLN(hieu_ts,hieu_ms) + "/" + hieu_ms/UCLN(hieu_ts,hieu_ms));
        }

    }

    public void Tich(int ts1, int ms1) {
        int tich_ts, tich_ms;
        tich_ms = b * ms1;
        tich_ts = a * ts1;
        System.out.println("Tich cua " + a + "/" + b + " * " + ts1 + "/" + ms1 + " = " + tich_ts/UCLN(tich_ts,tich_ms) + "/" + tich_ms/UCLN(tich_ts,tich_ms));
    }

    public void Thuong(int ts1, int ms1) {
        int thuong_ts, thuong_ms;
        thuong_ms = b * ts1;
        thuong_ts = a * ms1;
        System.out.println("Thuong cua " + a + "/" + b + " : " + ts1 + "/" + ms1 + " = " + thuong_ts / UCLN(thuong_ts, thuong_ms) + "/" + (thuong_ms / UCLN(thuong_ts, thuong_ms)));
        ;
    }

    public int UCLN(int ts, int ms) {
        if (ts == 0 || ms == 0) {
            return ts + ms;
        }
        while (ts != ms) {
            if (ts > ms) {
                ts -= ms;
            } else {
                ms -= ts;
            }
        }
        return ts;
    }
}
