package com.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 */
public class Test01 {

    //注解可以显示赋值  如果没有默认值 我们就必须给注解赋值
    @MyAnnotation(schools = {"西北大学","贵州大学"})
    public void test(){

    }
}


@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface  MyAnnotation{

    //注解的参数 ： 参数类型+参数名();
    String name() default  "";
    int age() default 0;
    int id () default -1;

    String[] schools();
}