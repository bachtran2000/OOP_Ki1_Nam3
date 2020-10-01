package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class processStudent {
    public static void quanly() {
        ArrayList<Student> ds = new ArrayList();
        int n;
        System.out.print("Nhap n = ");
        n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu: " + (i + 1));
            Student sv = new Student();
            sv.nhap();
            ds.add(sv);
        }

        boolean kq = ghiFile(ds, "Student.txt");
        if (kq == true)
            System.out.println("Luu thanh cong");
        else
            System.out.println("Luu that bai");
        System.out.println("File bạn đã nhập: ");
        ArrayList<String> dsout= new ArrayList<>(100);
        dsout = docFile("Student.txt");
        int i;
        for (i=0;i<dsout.size();i++) {
            System.out.println(dsout.get(i));
        }
    }

    public static boolean ghiFile(ArrayList<Student> ds,String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            for (Student string : ds) {
                bw.write(String.valueOf(string));
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static ArrayList<String> docFile(String path) {
        ArrayList<String> ds = new ArrayList<String>();
        try {
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            while (line != null) {
                if (line.length() > 0)
                    ds.add(line);
                line = br.readLine();
            }
            br.close();
            isr.close();
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return ds;
    }

}

