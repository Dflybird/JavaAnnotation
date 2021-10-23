package ReflectField;

public class Student extends Person {
    public String desc;
    private int score;

    @Override
    public String toString() {
        return "Student{" +
                "desc='" + desc + '\'' +
                ", score=" + score +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
