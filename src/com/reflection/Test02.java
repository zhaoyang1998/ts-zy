package com.reflection;

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Persion xs=new Student();
        System.out.println(xs.name);

        //第一种获取
        Class c1 = xs.getClass();
        System.out.println(c1.hashCode());

        //直接拿到
        Class c2 = Class.forName("com.reflection.Student");
        System.out.println(c2.hashCode());

        String name = c1.getSuperclass().getName();
        System.out.println(name);
    }
}


class Persion{
    public String name;

    public Persion() {
    }

    public Persion(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Student extends Persion{
    public Student(){
        this.name = "学生";
    }
}

class Teacher extends Persion{
    public Teacher() {
        this.name = "老师";
    }
}