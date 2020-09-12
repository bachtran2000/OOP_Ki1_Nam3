package Bai5;

import java.security.PublicKey;
import java.util.Random;
import java.util.Scanner;

public class ThiSinh {
    private String maTS;
    private String hoten;
    private int D_Toan, D_Ly, D_Hoa;

    public ThiSinh(String maTS, String hoten, int d_Toan, int d_Ly, int d_Hoa) {
        this.maTS = maTS;
        this.hoten = hoten;
        D_Toan = d_Toan;
        D_Ly = d_Ly;
        D_Hoa = d_Hoa;
    }

    public ThiSinh() {
    }

    public String getMaTS() {
        return maTS;
    }

    public void setMaTS(String maTS) {
        this.maTS = maTS;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getD_Toan() {
        return D_Toan;
    }

    public void setD_Toan(int d_Toan) {
        D_Toan = d_Toan;
    }

    public int getD_Ly() {
        return D_Ly;
    }

    public void setD_Ly(int d_Ly) {
        D_Ly = d_Ly;
    }

    public int getD_Hoa() {
        return D_Hoa;
    }

    public void setD_Hoa(int d_Hoa) {
        D_Hoa = d_Hoa;
    }

    public void Nhap(){

        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao ma sinh vien: ");
        maTS = in.nextLine();
        System.out.print("Nhap ho ten: ");
        hoten = in.nextLine();
        System.out.print("Nhap diem toan: ");
        D_Toan = in.nextInt();
        System.out.print("Nhap diem ly : ");
        D_Ly = in.nextInt();
        System.out.print("Nhap diem hoa: ");
        D_Hoa = in.nextInt();
    }

    public void Xuat_info(){
        System.out.printf("%10s|%20s|%10d|%10d|%10d|%10d\n",maTS,hoten,D_Toan,D_Ly,D_Hoa,Sum());
    }

    public int Sum(){
        return (D_Toan+D_Ly+D_Hoa);
    }

    @Override
    public String toString() {
        return "ThiSinh{" +
                "maTS=" + maTS +
                ", hoten=" + hoten +
                ", D_Toan=" + D_Toan +
                ", D_Ly=" + D_Ly +
                ", D_Hoa=" + D_Hoa +
                '}';
    }


}
