package Bai2;

import java.util.Scanner;

public class c_d {
    public static void main(String[] args) {
        System.out.print("Nhap vao so can kiem tra: ");
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        for (int i = 1; i <n; i++) {
            if (!(is_SHH(i))) System.out.println(i+" Khong phai so hoan hao!");
            else System.out.println(i+" La so hoan hao!");
        }
    }

    public static boolean is_SHH(int n) {
        if (Uoc(n, n - 1, 0) == n) return true;
        return false;
    }

    public static int Uoc(int n, int i, int sum) {
        if (i <= 0) return sum;
        if (n % i == 0) {
            sum = sum + i;
            return Uoc(n, i - 1, sum);
        }
        return Uoc(n, i - 1, sum);
    }
}
