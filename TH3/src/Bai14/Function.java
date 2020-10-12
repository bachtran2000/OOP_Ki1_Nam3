package Bai14;

import java.util.ArrayList;

public class Function {
    Matrix mt1 = new Matrix();
    Matrix mt2 = new Matrix();
    Matrix mtc = new Matrix();

    public void Tong() {
        int flag = 0;
        System.out.println("Nhap thong so ma tran 1: ");
        mt1.Nhap();

        System.out.println("Nhap thong so ma tran 2: ");
        mt2.Nhap();
        if (mt1.dong == mt2.dong) {
            if (mt1.cot == mt2.cot) {

                for (int i = 0; i < mt1.dong; i++, mtc.dong = mt1.dong) {
                    for (int j = 0; j < mt1.cot; j++, mtc.cot = mt1.cot) {
                        mtc.a[i][j] = mt1.a[i][j] + mt2.a[i][j];
                        flag = flag + 1;
                    }
                }
            }
        }
        if (flag != 0) {
            System.out.println("Tong cua 2 ma tran vua nhap la: ");
            mtc.Xuat();
        } else System.out.println("Kich thuoc ma trang khong giong nhau!");


    }

    public void Hieu() {
        int flag = 0;
        System.out.println("Nhap thong so ma tran 1: ");
        mt1.Nhap();

        System.out.println("Nhap thong so ma tran 2: ");
        mt2.Nhap();
        if (mt1.dong == mt2.dong) {
            if (mt1.cot == mt2.cot) {

                for (int i = 0; i < mt1.dong; i++, mtc.dong = mt1.dong) {
                    for (int j = 0; j < mt1.cot; j++, mtc.cot = mt1.cot) {
                        mtc.a[i][j] = mt1.a[i][j] - mt2.a[i][j];
                        flag = flag + 1;
                    }
                }
            }
        }
        if (flag != 0) {
            System.out.println("Tong cua 2 ma tran vua nhap la: ");
            mtc.Xuat();
        } else System.out.println("Kich thuoc ma trang khong giong nhau!");
    }

}
