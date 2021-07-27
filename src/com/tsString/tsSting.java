package com.tsString;


import java.util.Arrays;

public class tsSting {
    public static void main(String[] args) {
        String str = "1212fearwae";
        char c = str.charAt(1);
        System.out.println(c);
        System.out.println(str.toCharArray());

        System.out.println(Arrays.toString(str.getBytes()));
    }
}
