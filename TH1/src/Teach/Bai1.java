package Teach;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {

        int a;

        float b;

        String c;

        int[] arr = new int[100];

        float[][] brr = new float[100][100];

        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = input.nextInt();

        b = input.nextFloat();
        System.out.println("Nhap chuoi c: ");
        c = input.nextLine();

        for(int i=0;i<3;i++){
            arr[i] = input.nextInt();
        }

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println(c);
        for(int i=0;i<3;i++){
            System.out.println(arr[i]);
        }

    }
}
