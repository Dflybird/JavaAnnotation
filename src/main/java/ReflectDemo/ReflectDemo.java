package ReflectDemo;

import java.lang.reflect.Constructor;

/**
 * @Author Gq
 * @Date 2020/9/11 15:50
 * @Version 1.0
 **/
public class ReflectDemo {
    public static void main(String[] args) throws Exception {

        Class<?> clazz = null;

        //获取class对象的引用
        clazz = Class.forName("ReflectDemo.User");

        //第一种实例化方式
        User user1 = (User) clazz.newInstance();
        user1.setAge(11);
        user1.setName("user1");
        System.out.println("user1: "+user1);
        System.out.println("======================");

        //第二种实例化方式
        Constructor<?> constructor1 = clazz.getConstructor(int.class, String.class);
        User user2 = (User) constructor1.newInstance(12, "user2");
        System.out.println("user2: "+user2);
        System.out.println("======================");

        Constructor<?> constructor2 = clazz.getDeclaredConstructor(String.class);
        //将private的构造函数设为可访问
        constructor2.setAccessible(true);
        User user3 = (User) constructor2.newInstance("user3");
        user3.setAge(13);
        System.out.println("user3: "+user3);
        System.out.println("======================");

        //获取所有构造参数
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (int i = 0; i < constructors.length; i++) {
            Class<?>[] parametersClass = constructors[i].getParameterTypes();
            System.out.println("构造函数["+i+"]:"+constructors[i].toString());
            System.out.print("参数类型["+i+"]:(");
            for (int j = 0; j < parametersClass.length; j++) {
                System.out.print(parametersClass[j].getName()+", ");
            }
            System.out.println(")");
        }

        Class<?> IntegerClass = Integer.class;
        Class<?> intClass = int.class;
        System.out.println("Integer: " + IntegerClass + " | int: " + intClass);
    }

}
