package ReflectMethod;

/**
 * @Author Gq
 * @Date 2021/10/31 16:44
 * @Version 1.0
 **/
public class Circle extends Shape {

    private void drawCircle() {
        System.out.println("drawCircle");
    }

    public int getRadius() {
        return 5;
    }

    @Override
    public void draw() {
        System.out.println("drawCircle override");
    }
}
