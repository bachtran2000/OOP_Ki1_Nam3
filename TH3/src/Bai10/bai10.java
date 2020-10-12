package Bai10;

import java.util.Scanner;

public class bai10 {

    public static void main(String[] args) {
        TuyenSinh ts = new TuyenSinh();

        while (true) {
            ts.menu();
            int c = new Scanner(System.in).nextInt();
            switch (c) {
                case 1:
                    ts.Nhap_TS();
                    break;
                case 2:
                    ts.WriteFile();
                    break;
                case 3:
                    ts.ReadFile();
                    break;
                case 4:
                    ts.find_TS();
                    break;
                case 5:
                    return;
            }
        }
    }
}
