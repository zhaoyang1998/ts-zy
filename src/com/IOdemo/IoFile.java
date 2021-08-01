package com.IOdemo;

import java.io.File;
import java.io.IOException;

public class IoFile {
    public static void main(String[] args) {
        File fi = new File("/Users/zhaoyang/Desktop/hadoop学习/JavaSuden/test");
        try {
            fi.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(fi.getAbsolutePath());
    }
}
