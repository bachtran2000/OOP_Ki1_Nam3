package Bai12;

import java.util.Scanner;

public class bai12 {

    public static void main(String[] args) {
        Manager mn = new Manager();
        int c = -1;
        while (true){
            mn.menu();
            c = new Scanner(System.in).nextInt();
            switch (c){
                case 1:
                    mn.Nhap();
                    break;
                case 2:
                    mn.Xuat();
                    break;
                case 3:
                    System.out.println("Dang ghi file");
                    mn.WriteFile();

                    mn.ReadFile();
                    break;
                case 4:
                    return;
            }
        }
    }
}
