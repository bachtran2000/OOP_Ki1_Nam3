package com.company;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class WriteFile {
    public static boolean ghiFile(ArrayList<String> dsc, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            for (String string : dsc) {
                bw.write(string);
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
}
