package com.Systemruntimedemo;

import java.util.Arrays;

public class Sysrundemop {
    public static void main(String[] args) {
//        int[] num1 = {1,2,3,4,5,6};
//        int[] num2 = new int[num1.length];
//
//        //参数（源数组，原数组的起始位置，目标数组，目标数组的起始位置，长度）
//        System.arraycopy(num1,0,num2,0,num1.length);
//        System.out.println(Arrays.toString(num1));
//        System.out.println(Arrays.toString(num2));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));

        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器核数"+rt.availableProcessors());

    }
}
