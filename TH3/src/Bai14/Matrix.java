package Bai14;

import java.util.Scanner;

public class Matrix {
    protected int dong, cot;

    protected int[][] a = new int[100][100];

    public Matrix(int dong, int cot) {
        this.dong = dong;
        this.cot = cot;
    }

    public Matrix() {
    }

    public void Nhap(){
        System.out.print("Nhap vao so dong: ");
        dong = new Scanner(System.in).nextInt();
        System.out.print("Nhap vao so cot: ");
        cot = new Scanner(System.in).nextInt();
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                a[i][j]=new Scanner(System.in).nextInt();
            }
        }
    }

    public void Xuat(){
        for (int i = 0; i < dong; i++) {
            for (int j=0;j< cot;j++){
                System.out.print(a[i][j]+"    ");
            }
            System.out.println();
        }
    }
}
