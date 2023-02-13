package SaturdayProjects.week02;

public class Bird {
    String color ;
    double weight;
    boolean fly;

    public Bird(String color, double weight, boolean fly) {
        this.color = color;
        this.weight = weight;
        this.fly = fly;
    }

    public Bird(String color) {
        this.color = color;
    }

    public void isFly(){
        fly = true;

    }

    @Override
    public String toString() {
        return "Bird{" +
                "fly=" + fly +
                '}';
    }
}
