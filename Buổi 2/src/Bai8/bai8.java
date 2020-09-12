package Bai8;

public class bai8 {
    public static void main(String[] args) {
        PhanSo pt1 = new PhanSo();
        PhanSo pt2 = new PhanSo();
        System.out.print("Nhap vao phan so thu 1: ");
        pt1.Nhap();
        pt1.Xuat();
        System.out.print("Nhap vao phan so thu 2: ");
        pt2.Nhap();
        pt2.Xuat();

        pt1.Sum(pt2.getA(),pt2.getB());

        pt1.Hieu(pt2.getA(),pt2.getB());

        pt1.Tich(pt2.getA(),pt2.getB());

        pt1.Thuong(pt2.getA(),pt2.getB());
    }
}
