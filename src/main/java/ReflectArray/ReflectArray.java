package ReflectArray;

import java.lang.reflect.Array;

/**
 * @Author Gq
 * @Date 2021/11/7 16:19
 * @Version 1.0
 **/
public class ReflectArray {

    public static void main(String[] args) throws Exception {
        int[] intArray = new int[]{1,2,3};
        Class<?> componentClazz = intArray.getClass().getComponentType();
        System.out.println("component class: " + componentClazz.getName());
        int len = Array.getLength(intArray);
        System.out.println("int array len: " + len);
        System.out.println("index= 2 value=" + Array.getInt(intArray, 2));

        Class<?> clazz = Class.forName("java.lang.String");
        Object stringArray = Array.newInstance(clazz, 3);
        Array.set(stringArray, 2, "hello world");
        for (int i = 0; i < Array.getLength(stringArray); i++) {
            System.out.println("index="+i + " | " + "value=" + Array.get(stringArray, i));
        }

    }
}
