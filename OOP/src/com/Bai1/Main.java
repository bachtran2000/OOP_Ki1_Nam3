package com.Bai1;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int nDay, nMonth, nYear;
        System.out.print("Day: ");
        nDay = in.nextInt();

        System.out.print("Month: ");
        nMonth = in.nextInt();

        System.out.print("Year: ");
        nYear = in.nextInt();

        if (laNgayHopLe(nDay, nMonth, nYear)) {
            int tmpDay = nDay;
            int tmpMonth = nMonth;
            int tmpYear = nYear;


            timNgayHomTruoc(tmpDay, tmpMonth, tmpYear);

            tmpDay = nDay;
            tmpMonth = nMonth;
            tmpYear = nYear;


            timNgayHomSau(tmpDay, tmpMonth, tmpYear);
        } else {
            System.out.println("Ngay khong hop le!");
        }
    }

    public static boolean laNamNhuan(int nYear) {
        if ((nYear % 4 == 0 && nYear % 100 != 0) || nYear % 400 == 0) {
            return true;
        }
        return false;
    }

    public static int tinhSoNgayTrongThang(int nMonth, int nYear) {
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

    public static boolean laNgayHopLe(int nDay, int nMonth, int nYear) {
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

    public static void timNgayHomTruoc(int nDay, int nMonth, int nYear) {
        nDay--;
        if (nDay == 0) {
            nMonth--;
            if (nMonth == 0) {
                nMonth = 12;
                nYear--;
            }
            nDay = tinhSoNgayTrongThang(nMonth, nYear);
        }
        System.out.println("Yesterday: " + nDay + " / " + nMonth + " / " + nYear);
    }

    public static void timNgayHomSau(int nDay, int nMonth, int nYear) {
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
}
