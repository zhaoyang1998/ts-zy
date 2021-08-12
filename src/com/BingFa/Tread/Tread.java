package com.BingFa.Tread;

public class Tread {

    public static void main(String[] args) {

        Test test = new Test();
        test.start();

        for (int j = 0; j < 200; j++) {
            System.out.println("并发测试"+j);
        }
    }
}

class Test extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("这是一个测试" + i);
        }
    }

    public Test() {
    }
}