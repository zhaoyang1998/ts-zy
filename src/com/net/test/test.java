package com.net.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress test1 = InetAddress.getByName("www.baidu.com");
        System.out.println(test1);

        System.out.println(test1.getCanonicalHostName());

    }
}
