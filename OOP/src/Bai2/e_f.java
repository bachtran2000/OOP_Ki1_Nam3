package Bai2;

import java.util.Scanner;

public class e_f {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.print("Nhap tu so: ");
        a = in.nextInt();
        System.out.print("Nhap mau so: ");
        b = in.nextInt();
        System.out.println("Uoc chung lon nhat cua "+a+" va "+ b+" = "+ UCLN(a,b));
        System.out.println("Rut gon cua phan so "+a+"/"+b+" = "+(a/UCLN(a,b))+"/"+(b/UCLN(a,b)));
    }

    public static int UCLN(int a, int b) {
        while (a != b) {
            if (a < b) {
                b = b - a;
            } else a = a - b;
        }
        return a;
    }
}
