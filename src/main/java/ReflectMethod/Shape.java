package ReflectMethod;

/**
 * @Author Gq
 * @Date 2021/10/31 16:41
 * @Version 1.0
 **/
public class Shape {

    public void draw() {
        System.out.println("draw");
    }

    public void draw(String name, int count) {
        System.out.println("draw name: " + name + " | count: " + count);
    }
}
