package ReflectMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author Gq
 * @Date 2021/10/31 16:46
 * @Version 1.0
 **/
public class ReflectMethod {

    public static void main(String[] args) throws Exception {

        Class<?> clazz = Class.forName("ReflectMethod.Circle");

        Method[] methods = clazz.getMethods();
        for (Method m : methods) {
            System.out.println(m + " == from  class: " + m.getDeclaringClass());
        }

        System.out.println("===getDeclaredMethods===");
        Method[] methods2 = clazz.getDeclaredMethods();
        for (Method m : methods2) {
            System.out.println(m + " == from  class: " + m.getDeclaringClass());
        }

        System.out.println("===invoke Method===");
        Circle circle = (Circle) clazz.newInstance();

        Method draw = clazz.getMethod("draw", String.class, int.class);
        draw.invoke(circle, "circle", 2);

        Method drawCircle = clazz.getDeclaredMethod("drawCircle");
        drawCircle.setAccessible(true);
        drawCircle.invoke(circle);

        Method getRadius = clazz.getDeclaredMethod("getRadius");
        Integer radius = (Integer) getRadius.invoke(circle);
        System.out.println("radius: " + radius);
    }
}
