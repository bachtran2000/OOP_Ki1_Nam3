package QLSV;

import java.util.Scanner;

public class Main {

    static Manager mn = new Manager();

    public static void main(String[] args) {
        int c;
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
                    mn.find_SV();
                    break;
                case 4:
                    mn.SX_up();
                    break;
                case 5:
                    return;
            }
        }

    }
}
