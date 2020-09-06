package Bai4;

import java.util.Random;
import java.util.Scanner;

public class a_b_c {
    static Scanner in = new Scanner(System.in);
    protected static int n, m;

    public static void In(int[][] a) {
        Random random = new Random();
        System.out.println("Nhap vao cac thong so: ");
        System.out.print("n = ");
        n = in.nextInt();
        System.out.print("m = ");
        m = in.nextInt();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = random.nextInt(100);
    }

    public static void Out(int[][] a) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(a[i][j] + "    ");
            System.out.println();
        }
    }

    public static void find_MAX(int[][] a) {
        int[] b = new int[100];
        int[] c = new int[100];
        int max = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            for (int t = 0; t < m; t++)
                if (max < a[i][t])
                    max = a[i][t];
        }
        for (int i = 0; i < n; i++) {
            for (int t = 0; t < m; t++)
                if (a[i][t] == max) {
                    b[j] = i;
                    c[j] = t;
                    j++;
                }
        }
        if (j > 0) {
            System.out.print("Max = " + max + " o cac vi tri " + "i = " + (b[0] + 1) + "; j = " + (c[0] + 1));
            for (int i = 1; i < j; i++) System.out.print(", " + "i = " + (b[i] + 1) + "; j = " + (c[i] + 1));
        } else {
            System.out.println("Max = " + max + " o vi tri " + "i = " + (b[0] + 1) + "; j = " + (c[0] + 1));
            System.out.println();
        }
    }

    public static boolean is_Prime(int so, int i) {
        if (so < 2) return false;
        if (i == so) return true;
        if (so % i == 0) return false;
        return is_Prime(so, i + 1);
    }

    public static void Out_Prime(int[][] a) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (is_Prime(a[i][j], 2)) System.out.print(a[i][j] + "     ");
                else System.out.print("0" + "     ");
            }
            System.out.println();
        }
    }

    public static void sort(int[][] a) {
        for(int i=0;i<n;i++)
            for(int j=0;j<m-1;j++)
                for(int k=j+1;k<m;k++)
                    if (a[j][i]>a[k][i])
                    {
                        int tmp=a[j][i];
                        a[j][i]=a[k][i];
                        a[k][i]=tmp;
                    }
        Out(a);
    }

    public static void menu() {
        System.out.println("1. Nhap va xuat ma tran");
        System.out.println("2. Tim phan tu lon nhat va chi so");
        System.out.println("3. Tim va in SNT");
        System.out.println("4. Sap xep tang dan cot");
        System.out.printf("Chon: ");
    }

    public static void main(String[] args) {
        int[][] a = new int[100][100];
        int c;
        while (true) {
            menu();
            c = in.nextInt();
            switch (c) {
                case 1:
                    In(a);
                    Out(a);
                    break;
                case 2:
                    find_MAX(a);
                    System.out.println();
                    break;
                case 3:
                    Out_Prime(a);
                    break;
                case 4:
                    sort(a);
                    break;
                case 5:
                    return;
            }
        }

    }
}
