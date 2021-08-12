package com.BingFa.Sleep;

/**
 * 测试礼让线程
 * 礼让不一定成功，主要看CPU心情
 */
public class TestYield {
    public static void main(String[] args) {
        MyYield myYield = new MyYield();
        new Thread(myYield,"小红").start();
        new Thread(myYield,"小黑").start();
    }
}


class MyYield implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始执行");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"线程结束执行");
    }
}