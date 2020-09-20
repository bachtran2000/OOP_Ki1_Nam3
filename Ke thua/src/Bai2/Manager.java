package Bai2;

import java.util.Scanner;

public class Manager {
    int n;
    TaiLieu taiLieu[];

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so tai lieu: ");
        n = Integer.parseInt(scan.nextLine());
        taiLieu = new TaiLieu[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap loai tai lieu: (sach, tapchi, bao) ");
            String loai = scan.nextLine();
            if (loai.equals("sach"))
                taiLieu[i] = new Sach();
            else if (loai.equals("tapchi"))
                taiLieu[i] = new TapChi();
            else if (loai.equals("bao"))
                taiLieu[i] = new Bao();
            else {
                --i;
                continue;
            }
            taiLieu[i].input();
        }
    }

    public void output() {
        taiLieu[0].ouputTitle();
        for (int i = 0; i < n; i++) {
            taiLieu[i].output();
        }
    }

    public void outputTenTacGia() {
        for (int i = 0; i < n; i++) {
            if (taiLieu[i] instanceof Sach)
                System.out.println("Tac gia cuon sach thu " + (i + 1)
                        + " la : " + ((Sach) taiLieu[i]).getTenTacGia());
        }
    }
}
