package Bai2;


import java.util.Scanner;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        super.input();
        System.out.print("Nhap ten tac gia cuon sach: ");
        tenTacGia = scan.nextLine();
        System.out.print("Nhap so trang cuon sach: ");
        soTrang = Integer.parseInt(scan.nextLine());
    }

    public void output() {
        super.output();
        System.out.printf("%20s| %20d| %20s| %20s| %20s\n", tenTacGia,
                soTrang, " ", " ", " ");
    }
}
