package Bai7;

import java.util.Random;
import java.util.Scanner;

public class bai7 {

    static Scanner in = new Scanner(System.in);
    static Random rd = new Random();

    public static int Nhap(int[][] matrix) {
        int n;
        System.out.println("Nhap vao n: ");
        n = in.nextInt();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = rd.nextInt(99);
        return n;
    }

    public static void Xuat(int n, int[][] matrix, int sumc,int sump) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) sumc = sumc + matrix[i][j];
                if((i+j)==(n-1)) sump = sump + matrix[i][j];
                System.out.printf("%d\t", matrix[i][j]);

            }System.out.println();
        }
        System.out.println("Tong duong cheo chinh = "+sumc);
        System.out.println("Tong duong cheo phu = "+sump);
    }

    public static void main(String[] args) {
        int[][] matrix = new int[100][100];
        int n;
        n = Nhap(matrix);
        Xuat(n, matrix,0,0);
    }
}
