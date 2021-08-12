package com.BingFa.Runable;

//创建线程方法2 实现runnable接口  重写run方法
public class RunableDemo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("这是一个测试" + i);
        }
    }

    public static void main(String[] args) {
        //
        RunableDemo runableDemo = new RunableDemo();

        new Thread(runableDemo).start();

        for (int i = 0; i < 200; i++) {
            System.out.println("测试" + i);
        }
    }
}
