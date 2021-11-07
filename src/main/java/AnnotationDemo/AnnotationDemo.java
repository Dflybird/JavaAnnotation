package AnnotationDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @Author Gq
 * @Date 2021/11/7 16:56
 * @Version 1.0
 **/


public class AnnotationDemo {

    @RunM
    public void method1() {
        System.out.println("method1()");
    }


    public void method2() {
        System.out.println("method2()");
    }
}
