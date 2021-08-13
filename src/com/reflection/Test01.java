package com.reflection;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import jdk.nashorn.internal.ir.CallNode;

/**
 * 什么是反射
 */
public class Test01 extends Object{
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取累的class对象

        Class c1=Class.forName("com.reflection.User");
        System.out.println(c1);

        Class c2=Class.forName("com.reflection.User");
        Class c3=Class.forName("com.reflection.User");
        Class c4=Class.forName("com.reflection.User");

        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
    }




}


//实体类
class User{
    private String name ;
    private int id;
    private int age;

    public User(){}
    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}