package Bai2;

import java.util.Scanner;

public class TaiLieu {
    String maTaiLieu, tenNhaXuatBan;
    int soBanPhatHanh;
    Scanner scan = new Scanner(System.in);

    public void input( ) {
        System.out.print("Nhap ma tai lieu: ");
        maTaiLieu = scan.nextLine();
        System.out.print("Nhap ten nha xuat ban: ");
        tenNhaXuatBan = scan.nextLine();
        System.out.print("Nhap so ban phat hanh: ");
        soBanPhatHanh = scan.nextInt();
    }

    public void output( ) {
        System.out.printf("%20s| %20s| %20s| %20s| %20s| %20s| %20s| %20s\n",
                maTaiLieu,tenNhaXuatBan,soBanPhatHanh,"","","","","");
    }
    public void ouputTitle() {
        System.out.printf("%20s| %20s| %20s| %20s| %20s| %20s| %20s| %20s|",
                "Ma Tai Lieu", "Nha Xuat Ban", "So Ban Phat Hanh",
                "Tac Gia Sach", "So Trang Sach", "So Phat Hanh",
                "Thang Phat Hanh", "Ngay Phat Hanh");
    }
}
