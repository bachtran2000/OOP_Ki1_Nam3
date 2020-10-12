package Bai10;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
    ArrayList<ThiSinh> ts = new ArrayList();
    ThiSinh TS = new ThiSinh();

    public void Nhap_TS() {
        while (true) {
            String chon;
            System.out.print("Nhap thong tin thi sinh khoi(A/B/C/N de thoat): ");
            chon = new Scanner(System.in).nextLine();
            switch (chon) {
                case "A":
                    ThiSinh khoia = new KhoiA("", "", "", "");
                    khoia.Nhap();
                    ts.add(khoia);
                    break;
                case "B":
                    ThiSinh khoib = new KhoiB();
                    khoib.Nhap();
                    ts.add(khoib);
                    break;
                case "C":
                    ThiSinh khoic = new KhoiC();
                    khoic.Nhap();
                    ts.add(khoic);
                    break;
                case "n":
                    return;
            }
        }
    }

    public void Xuat_TS() {
        for (int i = 0; i < ts.size(); i++) {
            ts.get(i).Xuat();
        }
    }

    @Override
    public String toString() {
        return "TuyenSinh{" +
                "ts=" + ts +
                ", TS=" + TS +
                '}';
    }

    public void find_TS() {
        int flag = 0;
        System.out.print("Nhap vao SBD can tim: ");
        String f_SBD = new Scanner(System.in).nextLine();
        for (int i = 0; i < ts.size(); i++) {
            if (ts.get(i).getSBD().equals(f_SBD)) {
                ts.get(i).Xuat();
                flag = flag + 1;
            }
            if (flag == 0) System.out.println("Khong tim thay");
        }
    }

    public void WriteFile() {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("Tuyensinh.txt");
            FileWriter fw = new FileWriter(f);
            //Bước 2: Ghi dữ liệu
            for (int i = 0; i < ts.size() ; i++) {
                fw.write("SBD: "+ts.get(i).getSBD()+" $ Ho va ten: "+ts.get(i).getHT()+" $ Dia chi: "+ts.get(i).getDC()+" $ Uu tien: "+ts.get(i).getUT()+" $ Diem toan: "+ts.get(i).getDT()+" $ Diem ly: "+ts.get(i).getDL());
            }
            //Bước 3: Đóng luồng
            fw.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }

    public void ReadFile(){
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("Tuyensinh.txt");
            FileReader fr = new FileReader(f);
            //Bước 2: Đọc dữ liệu
            BufferedReader br = new BufferedReader(fr);
            String line;
            System.out.println("File da ghi:");
            while ((line = br.readLine()) != null){

                System.out.println(line);
            }
            //Bước 3: Đóng luồng
            fr.close();
            br.close();
        } catch (Exception ex) {
            System.out.println("Loi doc file: "+ex);
        }
    }

}
