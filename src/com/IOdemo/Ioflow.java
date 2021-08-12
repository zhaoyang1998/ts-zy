package com.IOdemo;

import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ioflow {
    private static void out(){

        File f = new File("/Users/zhaoyang/Desktop/hadoop学习/JavaSuden/test.txt");

        try {
            OutputStream out = new FileOutputStream(f);

            String ceshi = "小河流水";

            out.write(ceshi.getBytes());

            out.close();

            System.out.println("写完了");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        out();
    }
}
