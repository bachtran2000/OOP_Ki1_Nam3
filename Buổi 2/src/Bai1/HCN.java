package Bai1;

import java.util.Scanner;

public class HCN extends Hinh {
    @Override
    public void Nhap() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.printf("Nhap vao chieu dai: ");
            cDai = in.nextFloat();
            System.out.printf("Nhap vao chieu rong: ");
            cRong = in.nextFloat();
            if (cDai < cRong) System.out.println("Nhap sai! Nhap lai!");
            else return;
        }
    }

    @Override
    public void Out() {
        System.out.println("Chu vi cua hcn la: " + (cDai + cRong) * 2);
        System.out.println("Dien tich hcn la: " + (cDai * cRong));
        System.out.println();
        System.out.println();
    }

    @Override
    public String toString() {
        return "HCN{" +
                "cDai=" + cDai +
                ", cRong=" + cRong +
                '}';
    }
}
