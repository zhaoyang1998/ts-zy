package com.IOdemo;

import java.io.File;

public class IoFind {

    public static void main(String[] args) {
        File ceshi = new File("/Users/zhaoyang/Desktop/hadoop学习");
        String ext = "txt";
        FindFile(ceshi,ext);
    }


    private static void FindFile(File target, String ext){

        //为空的时候
        if (target==null){return;}

        //为目录的情况
        if (target.isDirectory()){
            File[] files = target.listFiles();
            for (File f : files) {

                //文件为目录的情况
                if (f.isDirectory()){
                    FindFile(f,ext);
                }else {
                    String fs = f.toString();
                    if (fs.endsWith(ext)){
                        System.out.println(fs);
                    }
                }
            }
        }else {
            String fs = target.toString();
            if (fs.endsWith(ext)){
                System.out.println(fs);
            }
        }


    }
}
