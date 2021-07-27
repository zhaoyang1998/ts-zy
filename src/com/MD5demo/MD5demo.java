package com.MD5demo;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

public class MD5demo {
    public static void main(String[] args) {

        String pass = "passw0rd" ;

        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            byte[] bytes = md.digest(pass.getBytes("utf-8"));
            System.out.println(Arrays.toString(bytes));
            String mdstr = new String(bytes);
            //System.out.println(mdstr);
            String str = Base64.getEncoder().encodeToString(bytes);
            System.out.println(str);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }


    }
}
