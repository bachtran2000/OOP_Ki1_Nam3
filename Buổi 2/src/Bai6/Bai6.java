package Bai6;

import java.util.ArrayList;

public class Bai6 {
    public static void main(String[] args) {
        ArrayList <DaThuc> listdt1 = new ArrayList();
        DaThuc dt1 = new DaThuc();
        dt1.Nhap();
        listdt1.add(dt1);
        dt1.Xuat();

        DaThuc dt2 = new DaThuc();
        dt2.Nhap();

    }
}
