package com.BingFa.sym;

import java.util.ArrayList;
import java.util.List;

public class UnsafeList {
    public static void main(String[] args) throws InterruptedException {

        List<String> list =new ArrayList<String>();
        for (int i = 0; i < 1000000; i++) {
            new Thread(()-> {
                synchronized (list){
                    list.add(Thread.currentThread().getName());
                }
            }).start();

        }

        Thread.sleep(3000);
        System.out.println(list.size());
    }
}
