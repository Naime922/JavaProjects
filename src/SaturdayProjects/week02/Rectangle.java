package SaturdayProjects.week02;

public class Rectangle {


    private int height;
    private int width ;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
        height = 4;

        width = 5;

    }
    public int printArea(){
        int area = height * width ;
         return area;


    }
}
