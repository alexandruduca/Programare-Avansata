import java.util.Random;

public class Student {
    private String name;
    private double score;

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setScore() {
        Random random = new Random();
        this.score = random.doubles(5.0, 10.0)
                .findAny()
                .getAsDouble();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
