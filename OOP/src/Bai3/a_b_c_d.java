package Bai3;

import java.util.Scanner;

public class a_b_c_d {
    public static Scanner in = new Scanner(System.in);

    public static int Nhap_arr(int[] a, int[] tmp_a, int n, int i) {

        if (i == n) return 0;
        if (i < n) {
            System.out.print("Nhap vao phan tu thu " + (i + 1) + ": ");
            a[i] = in.nextInt();
            tmp_a[i] = a[i];
            return
                    Nhap_arr(a, tmp_a, n, i + 1);
        }
        return 0;
    }

    public static int Xuat(int[] a, int n, int i) {
        if (i == n) {
            System.out.println();
            return 0;

        }
        if (i < n) {
            System.out.print(a[i] + "  ");

            return Xuat(a, n, i + 1);
        }
        return 0;
    }

    public static void SX_up(int[] a, int n) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (a[j] < a[i]) {
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
        Xuat(a, n, 0);
    }

    public static void find_MAX(int[] a, int n) {
        int[] b = new int[100];
        int max = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (max < a[i])
                max = a[i];
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == max) {
                b[j] = i;
                j++;
            }
        }
        if (j > 0) {
            System.out.print("Max = " + max + " o cac vi tri " + (b[0] + 1));
            for (int i = 1; i < j; i++) System.out.print(", " + (b[i] + 1));
        } else {
            System.out.println("Max = " + max + " o vi tri " + (b[0] + 1));
            System.out.println();
        }
    }

    public static void find_MIN(int[] a, int n) {
        int[] b = new int[100];
        int max = a[0];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (max > a[i])
                max = a[i];
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == max) {
                b[j] = i;
                j++;
            }
        }
        if (j > 0) {
            System.out.print("Min = " + max + " o cac vi tri " + (b[0] + 1));
            for (int i = 1; i < j; i++) System.out.print(", " + (b[i] + 1));
        } else {
            System.out.println("Min = " + max + " o vi tri " + (b[0] + 1));
            System.out.println();
        }
    }

    public static void Add(int[] a, int[] tmp_a, int n) {
        int tmp;
        int can_phai = 0, can_trai = 0;
        System.out.print("Nhap so can add: ");
        tmp = in.nextInt();
        SX_up(a, n);
        for (int i = n; i >= 0; i--) {
            if (tmp > a[i]) can_phai = i;
        }
        for (int i = 0; i < n; i++) {
            if (tmp < a[i]) can_trai = i;
        }

        for (int i = 0; i < n + 1; i++) {
            tmp_a[i] = a[i];
        }
        System.out.println("Can trai = " + (can_trai + 1) + " can phai = " + (can_phai + 1));
        tmp_a[can_trai + 1] = tmp;
        for (int i = can_trai + 2, j = can_trai + 1; i < n + 2; i++) {
            tmp_a[i] = a[j];
            j++;
        }
        Xuat(tmp_a, n + 1, 0);
    }

    public static void menu() {
        System.out.println("1.Nhap vao mang A");
        System.out.println("2.Sap xep mang A");
        System.out.println("3. Tim MIN & MAX cung chi so cua chung");
        System.out.println("4. Chen 1 so o vi tri x");
        System.out.print("Chon: ");
    }

    public static void main(String[] args) {
        int n = 0;
        int[] a = new int[100];
        int[] tmp_a = new int[100];
        int c;
        while (true) {
            menu();
            c = in.nextInt();
            switch (c) {
                case 1:
                    System.out.print("Nhap vao so phan tu: ");
                    n = in.nextInt();
                    Nhap_arr(a, tmp_a, n, 0);
                    break;
                case 2:
                    System.out.println("Mang chua sap xep:");
                    Xuat(tmp_a, n, 0);
                    System.out.println("Mang da sap xep:");
                    SX_up(a, n);
                    break;
                case 3:
                    System.out.println("Mang chua sap xep:");
                    Xuat(tmp_a, n, 0);
                    find_MAX(a, n);
                    System.out.println();
                    find_MIN(a, n);
                    System.out.println();
                    break;
                case 4:
                    Add(a, tmp_a, n);
                    break;
                case 5:
                    return;
            }
        }
    }
}


