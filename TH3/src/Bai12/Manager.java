package Bai12;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Manager {
    ArrayList<CBGV> cbgv_list = new ArrayList<CBGV>();
    CBGV cbgv = new CBGV();

    public void menu(){
        System.out.println("1. Nhap thong tin CBGV");
        System.out.println("2. Hien thi thong tin ca nhan");
        System.out.println("3. Ghi vao file va xuat ra man hinh");
        System.out.println("4. Thoat");
        System.out.print("Chon: ");
    }

    public void Nhap(){
        while (true){
            cbgv.Nhap();
            cbgv_list.add(cbgv);
            System.out.print("Thoat?(y/n): ");
            String c = new Scanner(System.in).nextLine();
            if (c.equals("Y") || c.equals("y"))
                break;
        }
    }

    public void Xuat(){
        for (int i = 0; i < cbgv_list.size(); i++) {
            System.out.println(cbgv_list.get(i).TTCB());
        }
    }

    public void WriteFile(){
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("CBGV.txt");
            FileWriter fw = new FileWriter(f);
            //Bước 2: Ghi dữ liệu
            for (int i = 0; i < cbgv_list.size(); i++) {
                fw.write(cbgv_list.get(i).TTCB());
                fw.write("\n");
            }
            //Bước 3: Đóng luồng
            fw.close();
            System.out.println("Ghi thanh cong file!");
        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }

    public void ReadFile() {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("CBGV.txt");
            FileReader fr = new FileReader(f);
            //Bước 2: Đọc dữ liệu
            BufferedReader br = new BufferedReader(fr);
            String line;
            System.out.println("File da ghi:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            //Bước 3: Đóng luồng
            fr.close();
            br.close();
        } catch (Exception ex) {
            System.out.println("Loi doc file: " + ex);
        }
    }

}
