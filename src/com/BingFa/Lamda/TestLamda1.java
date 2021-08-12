package com.BingFa.Lamda;

/**
 * 推导lamda表达式
 */
public class TestLamda1 {


    // 3 静态内部类
    static class Like2 implements Ilike{
        @Override
        public void lamda() {
            System.out.println("I like Lamda2");
        }
    }

    public static void main(String[] args) {
        Ilike like = new Like();
        like.lamda();

        Like2 like2 = new Like2();
        like2.lamda();


        //4 局部内部类

        class Like3 implements Ilike{
            @Override
            public void lamda() {
                System.out.println("I like Lamda3");
            }
        }

        Like3 like3 = new Like3();
        like3.lamda();


        //5 匿名内部类
        like = new Ilike() {
            @Override
            public void lamda() {
                System.out.println("I like Lamda4");
            }
        };
        like.lamda();

        //用lamda简化
        like  = () -> {
            System.out.println("I like Lamda5");
        };
        like.lamda();



    }
}

//1 定义一个函数式接口
interface  Ilike {
    void lamda();
}

// 2  实现类

class Like implements Ilike{
    @Override
    public void lamda() {
        System.out.println("I like Lamda");
    }
}