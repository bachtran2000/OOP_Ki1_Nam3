package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadFile {
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
