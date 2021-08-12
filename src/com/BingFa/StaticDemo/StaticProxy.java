package com.BingFa.StaticDemo;

import jdk.nashorn.internal.ir.CallNode;

public class StaticProxy {

    public static void main(String[] args) {
        You you = new You();

        WeddingCompany weddingCompany = new WeddingCompany(you);
        weddingCompany.happyMarry();
    }

}



interface Marry{
    void happyMarry();
}

//真实角色
class You implements Marry{
    @Override
    public void happyMarry() {
        System.out.println("结婚了");
    }
}

class WeddingCompany implements Marry{
    private Marry target;
    public WeddingCompany(Marry target) {
        this.target=target;
    }


    @Override
    public void happyMarry() {
        before();
        this.target.happyMarry();
        after();
    }

    private void after() {
        System.out.println("结婚结束了");
    }

    private void before() {
        System.out.println("结婚准备了");
    }
}