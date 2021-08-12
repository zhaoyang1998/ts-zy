package com.BingFa.Lamda;

public class Testlamda2 {
    public static void main(String[] args) {

        Ilove love = new MyLove();
        love.love(1);

        love = (int a) ->{
            System.out.println("这是我的"+a+"倍爱");
        };
        love.love(2);

        //简化1 参数类型
        love = (a) ->{
            System.out.println("这是我的"+a+"倍爱");
        };
        love.love(3);

        //简化2 简化括号
        love = a ->{
            System.out.println("这是我的"+a+"倍爱");
        };
        love.love(4);

        //简化3 简化花括号
        love = (a) -> System.out.println("这是我的"+a+"倍爱");
        love.love(5);

        /**
         *  lamda 表达式只能有一行的时候 可以去掉花括号
         *  前提是接口为参数式类型
         *  多个参数也可以去掉参数类型 要去掉就都去掉 必须加上括号
         */

    }
}

interface Ilove{
    void love (int a );
}

class MyLove implements Ilove{
    @Override
    public void love(int a) {
        System.out.println("这是我的"+a+"倍爱");
    }
}
