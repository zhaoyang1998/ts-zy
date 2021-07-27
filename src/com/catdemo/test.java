package com.catdemo;

public class test {
    public static void main(String[] args) {

        cat xm=new cat("喵喵小白",2);
        try {
            cat newcat = (cat) xm.clone();
            System.out.println("xm="+xm);
            System.out.println("newcat="+newcat);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();

        }

    }
}
