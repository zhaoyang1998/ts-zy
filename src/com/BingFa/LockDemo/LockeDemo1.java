package com.BingFa.LockDemo;

public class LockeDemo1 {
    public static void main(String[] args) {

        Makeup g1 = new Makeup(0,"小慧");
        Makeup g2 = new Makeup(1,"小红");

        g1.start();
        g2.start();
    }
}



class Lipstick{

}

class Mirror{

}

class Makeup extends Thread{

    //定义资源
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice;
    String name;

    public Makeup(int choice, String name) {
        this.choice = choice;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            makeuo();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //化妆
    }

    private void makeuo() throws InterruptedException {
        if (choice==0){
            synchronized (lipstick){
                System.out.println(this.name+"获得口红");
                Thread.sleep(1000);
            }
            synchronized (mirror){
                System.out.println(this.name+"获得镜子");
            }
        }else{
            synchronized (mirror){
                System.out.println(this.name+"获得镜子");
                Thread.sleep(2000);

            }
            synchronized (lipstick){
                System.out.println(this.name+"获得口红");
            }
        }
    }

}