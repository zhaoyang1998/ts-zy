package com.BingFa.Sleep;

public class Sleep2 implements Runnable {
//    private boolean flag = true;
    private  int i;
    public static void main(String[] args) {
        Sleep2 sleep2 = new Sleep2();
        new Thread(sleep2, "小红").start();
        new Thread(sleep2, "小黑").start();

    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            buy();
            if (i>=10){
                break;
            }
        }
    }
    //synchronized 同步方法 锁的是this
    private synchronized void buy(){
        System.out.println(Thread.currentThread().getName()+"这是第几张票"+i++);
    }

}

