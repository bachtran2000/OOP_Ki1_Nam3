package Bai1;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Manager mn = new Manager();
        int c;
        while (true){
            mn.Menu();
            c = new Scanner(System.in).nextInt();
            switch (c){
                case 1:
                    mn.Nhap();
                    break;
                case 2:
                    mn.Xuat();
                    break;
                case 3:
                    mn.sapxep();
                    break;
                case 4:
                    mn.find();
                    break;
                case 5:

                    return;
            }
        }


    }

}
