package Bai3_1;

import java.util.Scanner;

public class Chuoi {
    static Scanner in = new Scanner(System.in);
    protected static int soKyTuInHoa = 0, soKyTuInThuong = 0, soChuSo = 0;
    protected static int space = 0, ktDacBiet = 0;

    public static void count(String chuoi) {
        for (int i = 0; i < chuoi.length(); i++) {

            if (Character.isUpperCase(chuoi.charAt(i))) {
                soKyTuInHoa++;
            }

            if (Character.isLowerCase(chuoi.charAt(i))) {
                soKyTuInThuong++;
            }

            if (Character.isDigit(chuoi.charAt(i))) {
                soChuSo++;
            }

            if (Character.isSpaceChar(chuoi.charAt(i))) {
                space++;
            }
            if (!(Character.isLetter(chuoi.charAt(i)))) {
                if (!(Character.isSpaceChar(chuoi.charAt(i)))) {
                    if (!(Character.isDigit(chuoi.charAt(i))))
                        ktDacBiet++;
                }
            }
        }
    }

    public static String IO() {
        String chuoi;
        System.out.print("Nhập vào 1 chuỗi bất kỳ: ");
        chuoi = in.nextLine();

        System.out.println("Chuoi vua nhap la: " + chuoi);
        return chuoi;
    }

    public static void main(String[] args) {
        String chuoi = null;
        chuoi = IO();
        count(chuoi);
        System.out.println("Trong chuỗi " + chuoi);
        System.out.println("Có " + soKyTuInHoa + " ký tự in hoa");
        System.out.println("Có " + soKyTuInThuong + " ký tự in thường");
        System.out.println("Có " + soChuSo + " số");
        System.out.println("Có " + space + " ký tự khoảng trắng");
        System.out.println("Có " + ktDacBiet + " ký tự đặt biệt");
    }
}
