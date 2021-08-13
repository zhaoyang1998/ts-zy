package com.reflection;

import com.sun.xml.internal.xsom.impl.Ref;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class Test12 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("com.reflection.Student2");

        //通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }


        //获得注解的value的值
        Tablezy zyation = (Tablezy)c1.getAnnotation(Tablezy.class);
        String value = zyation.value();
        System.out.println(value);

        //获得类指定的注解
        Field f = c1.getDeclaredField("name");
        Fieldzy annotation = f.getAnnotation(Fieldzy.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.length());
        System.out.println(annotation.type());

    }
}

@Tablezy("db_student")
class Student2{

    @Fieldzy(columnName = "db_id",type = "int",length = 10)
    private int id;
    @Fieldzy(columnName = "db_age",type = "int",length = 10)
    private int age;
    @Fieldzy(columnName = "db_name",type = "int",length = 10)
    private String name;

    public Student2() {
    }

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface  Tablezy{
    String value();
}

//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Fieldzy{
    String columnName();
    String type();
    int length();
}