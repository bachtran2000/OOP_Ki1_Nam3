package Bai12;

import java.util.Scanner;

public class CBGV extends Person {
    protected float LC, Thuong, Phat, Luong_lv, Luong_tl;

    public CBGV(String HT, String AGE, String QQ, float LC, float thuong, float phat, float luong_lv, float luong_tl) {
        super(HT, AGE, QQ);
        this.LC = LC;
        Thuong = thuong;
        Phat = phat;
        Luong_lv = luong_lv;
        Luong_tl = luong_tl;
    }

    public CBGV(String HT, String AGE, String QQ) {
        super(HT, AGE, QQ);
    }

    public CBGV() {

    }

    public float getLC() {
        return LC;
    }

    public void setLC(float LC) {
        this.LC = LC;
    }

    public float getThuong() {
        return Thuong;
    }

    public void setThuong(float thuong) {
        Thuong = thuong;
    }

    public float getPhat() {
        return Phat;
    }

    public void setPhat(float phat) {
        Phat = phat;
    }

    public float getLuong_lv() {
        return Luong_lv;
    }

    public void setLuong_lv(float luong_lv) {
        Luong_lv = luong_lv;
    }

    public float getLuong_tl() {
        return Luong_tl;
    }

    public void setLuong_tl(float luong_tl) {
        Luong_tl = Luong_tl;
    }

    @Override
    public String getHT() {
        return super.getHT();
    }

    @Override
    public void setHT(String HT) {
        super.setHT(HT);
    }

    @Override
    public String getAGE() {
        return super.getAGE();
    }

    @Override
    public void setAGE(String AGE) {
        super.setAGE(AGE);
    }

    @Override
    public String getQQ() {
        return super.getQQ();
    }

    @Override
    public void setQQ(String QQ) {
        super.setQQ(QQ);
    }

    public void Nhap() {
        System.out.println("Ho ten: ");
        HT = new Scanner(System.in).nextLine();
        System.out.println("Nam sinh: ");
        AGE = new Scanner(System.in).nextLine();
        System.out.println("Nhap que quan: ");
        QQ = new Scanner(System.in).nextLine();
        System.out.println("Nhap luong cung: ");
        LC = new Scanner(System.in).nextFloat();
        System.out.println("Nhap vao thuong: ");
        Thuong = new Scanner(System.in).nextFloat();
        System.out.println("Nhao vao phat: ");
        Phat = new Scanner(System.in).nextFloat();
    }

    public float tt(){
        Luong_tl = LC + Thuong - Phat;
        return getLuong_tl();
    }

    @Override
    public String toString() {
        return super.toString() +
                "LC=" + LC +
                ", Thuong=" + Thuong +
                ", Phat=" + Phat +
                ", Luong_lv=" + Luong_lv +
                ", Luong_tl=" + tt();
    }

    public String TTCB(){
        return super.TTCB()+"| Luong cung: "+LC+"| Thuong: "+Thuong+"| Phat: "+Phat+"| Luong thuc linh: "+tt();
    }
}
