package Bai2;

import java.util.Scanner;

public class Bao extends TaiLieu{
    private int ngayPhatHanh;

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        super.input();
        System.out.print("Nhap ngay phat hanh: ");
        ngayPhatHanh = Integer.parseInt(scan.nextLine());
    }

    public void output() {
        super.output();
        System.out.printf("%-20s %-20s %-20s %-20d %-20sn", " ", " ", " ",
                ngayPhatHanh, " ");
    }
}
