package AnnotationDemo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author Gq
 * @Date 2021/11/7 18:14
 * @Version 1.0
 **/
public class AnnotationCore {

    public static void main(String[] args) throws Exception  {
        new AnnotationCore().runMain(args);
    }

    public void runMain(String[] args) throws Exception {
        Class<?>[] classes = new Class[args.length];
        int index = 0;
        for(String arg : args) {
            System.out.println(arg);
            classes[index++] = Class.forName(arg);
        }

        for(Class<?> clazz : classes) {
            Object o = clazz.newInstance();
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                Annotation annotation = method.getAnnotation(RunM.class);
                if (annotation == null) {
                    continue;
                }
                method.invoke(o);
            }
        }
    }
}
