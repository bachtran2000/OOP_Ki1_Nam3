package Bai6;

import java.util.Scanner;

public class DaThuc {
    private int Bac_n;
    private float[] arr_hs = new float[100];

    public int getBac_n() {
        return Bac_n;
    }

    public void setBac_n(int bac_n) {
        Bac_n = bac_n;
    }

    public float[] getArr_hs() {
        return arr_hs;
    }

    public void setArr_hs(float[] arr_hs) {
        this.arr_hs = arr_hs;
    }

    public void Nhap(){
        System.out.print("Nhap bac cua da thuc: ");
        Scanner in = new Scanner(System.in);
        Bac_n = in.nextInt();
        System.out.println("Nhap vao he so cua da thuc: ");
        for (int i=0;i<Bac_n;i++){
            System.out.print("He so x^"+(i+1)+" = ");
            arr_hs[i]=in.nextFloat();
        }
    }

    public void Xuat(){
        System.out.print("Nhap vao doi tuong can xuat: (<"+getBac_n()+") ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print("Doi tuong da thuc co dang: ");
        for (int i=0;i<Bac_n;i++){
            if(i==(n-1))
                System.out.println(arr_hs[i]+" . x^"+(i+1));
        }
    }

}
