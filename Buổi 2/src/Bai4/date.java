package Bai4;

import java.util.Scanner;

public class date {
    private int nDay, nMonth, nYear;
    Scanner in = new Scanner(System.in);

    public date(int day, int month, int year) {
        this.nDay = day;
        this.nMonth = month;
        this.nYear = year;
    }

    public date() {
    }

    public void Nhap() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao ngay: ");
        nDay = in.nextInt();
        System.out.print("Nhap vao thang: ");
        nMonth = in.nextInt();
        System.out.print("Nhap vao nam: ");
        nYear = in.nextInt();
    }

    public boolean laNamNhuan(int nYear) {
        if ((nYear % 4 == 0 && nYear % 100 != 0) || nYear % 400 == 0) {
            return true;
        }
        return false;
    }

    public int tinhSoNgayTrongThang(int nMonth, int nYear) {
        int nNumOfDays = 0;

        switch (nMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                nNumOfDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                nNumOfDays = 30;
                break;
            case 2:
                if (laNamNhuan(nYear)) {
                    nNumOfDays = 29;
                } else {
                    nNumOfDays = 28;
                }
                break;
        }

        return nNumOfDays;
    }

    public boolean laNgayHopLe(int nDay, int nMonth, int nYear) {
        boolean bResult = true; // Giả sử ngày hợp lệ


        if (!(nYear > 0)) {
            bResult = false;
        }


        if (!(nMonth >= 1 && nMonth <= 12)) {
            bResult = false;
        }


        if (!(nDay >= 1 && nDay <= tinhSoNgayTrongThang(nMonth, nYear))) {
            bResult = false;
        }

        return bResult;
    }

    public void timNgayHomSau(int nDay, int nMonth, int nYear) {
        nDay++;
        if (nDay > tinhSoNgayTrongThang(nMonth, nYear)) {
            nDay = 1;
            nMonth++;
            if (nMonth > 12) {
                nMonth = 1;
                nYear++;
            }
        }
        System.out.println("Tomorow: " + nDay + " / " + nMonth + " / " + nYear);
    }

    public void Check_date() {

        if (laNgayHopLe(nDay, nMonth, nYear)) {
            int tmpDay = nDay;
            int tmpMonth = nMonth;
            int tmpYear = nYear;

            timNgayHomSau(tmpDay, tmpMonth, tmpYear);
        } else {
            System.out.println("Ngay khong hop le!");
        }
    }
}
