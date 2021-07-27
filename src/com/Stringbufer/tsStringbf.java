package com.Stringbufer;

import java.util.Arrays;

public class tsStringbf {
    public static void main(String[] args) {
        String a = "12";
        String b = "b";
        StringBuffer sb = new StringBuffer();
        sb.append(a).append(b).append(1);
        System.out.println(sb.toString());

    }
}
