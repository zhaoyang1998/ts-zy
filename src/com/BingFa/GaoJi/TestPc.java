package com.BingFa.GaoJi;

import jdk.nashorn.internal.ir.CallNode;

public class TestPc {
    public static void main(String[] args) {
        SynContainer container=new SynContainer();

        new Peoductor(container).start();
        new Consumer(container).start();
    }
}

//生产者
class Peoductor extends Thread{
    SynContainer container;

    public Peoductor(SynContainer container) {
        this.container = container;
    }

    //生产方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            container.push(new Chicken(i));
            System.out.println("生产了"+i+"只鸡");
        }
    }
}

//消费者
class Consumer extends Thread{
    SynContainer container;

    public  Consumer(SynContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("消费了-->"+container.pop().id);

        }
    }
}

//产品
class Chicken{
    int id;
    public Chicken(int id) {
        this.id = id;
    }
}

//缓冲区
class SynContainer{

    //需要一个容器大小
    Chicken[] chickens=new Chicken[10];

    int count;

    //生产者放入产品
    public synchronized void push(Chicken chicken){
        //如果容器满了 需要等待消费
        if (count == chickens.length){
            System.out.println("满了-->"+chickens.length);
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //通知消费者消费

        }
        chickens[count] = chicken;
        count++;

        //可以通知消费者消费了
        this.notifyAll();


        // 如果没有慢我们就需要投入产品
    }



    //消费者消费
    public synchronized Chicken pop(){
        if (count == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {

            }
        }

        count--;
        Chicken chicken = chickens[count];
        this.notifyAll();
        return chicken;
    }

}















