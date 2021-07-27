package com.catdemo;

/**
 * 1.实现cloneable接口(标记接口)
 * 2.重写Object类中的clone方法
 */
public class cat implements Cloneable{

    private String name;
    private int age;

    public cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public cat() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重写Object的克隆方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
