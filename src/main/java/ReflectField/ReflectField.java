package ReflectField;

import java.lang.reflect.Field;

/**
 * @Author Gq
 * @Date 2020/9/11 16:58
 * @Version 1.0
 **/
public class ReflectField {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName("ReflectField.Student");

        Field field = clazz.getField("age");
        System.out.println("Student.age: "+ field);

        Field[] fields = clazz.getFields();
        for (Field f : fields) {
            System.out.println(f+" == from class:"+ f.getDeclaringClass());
        }

        System.out.println("=====getDeclaredFields======");
        Field[] fields2 = clazz.getDeclaredFields();
        for (Field f: fields2) {
            System.out.println(f+" == from class:"+ f.getDeclaringClass());
        }

        Object student = clazz.newInstance();
        Field name = clazz.getField("name");
        name.set(student, "student");
        Field age = clazz.getField("age");
        age.setInt(student, 10);
        Field score = clazz.getDeclaredField("score");
        score.setAccessible(true);
        score.setInt(student, 100);
        System.out.println(student);
    }

}

