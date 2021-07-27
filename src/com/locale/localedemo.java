package com.locale;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class localedemo {
    public static void main(String[] args) {

        //创建一个本地语言环境，该对象会根据参数设置来自动选择相关联的语言环境
        Locale locale_cn = new Locale("zh","CN");
        Locale locale_us = new Locale("en", "US");

        //获取默认的语言系统
        Locale locale_default = Locale.getDefault();

        //获取
        Scanner input = new Scanner(System.in);

        //用于绑定的工具类
        ResourceBundle r = ResourceBundle.getBundle("com.locale.info",locale_cn);
        System.out.println(r.getString("system.name"));
        System.out.println(r.getString("input.username"));
        String username = input.nextLine();
        System.out.println(r.getString("input.password"));
        String pass = input.nextLine();
        if ("admin".equals(username)&&"123".equals(pass)){
            System.out.println(r.getString("login.success"));
        }else{
            System.out.println(r.getString("login.error"));
        }

    }
}
