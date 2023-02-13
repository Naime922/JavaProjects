package SaturdayProjects.week02;

public class Assignment14 {
    private String color;
    // variable created name color
    private double mileage;
    //variable created name mileage

    public Assignment14(String color, double mileage) {
        this.color = color;
        this.mileage = mileage;

        // Constructors created with both parameters color and mileage
    }
    public void printCarInfo(){
        System.out.println("The Car color is: " + color);
        System.out.println("The Car mileage is: "+ mileage);
    }
    public void drive(){
        mileage +=15;
        System.out.println("The car mileage is after driving: " + mileage);
    }


    public void drive(double drivenMileage){ // drivenMileage method created with double
        mileage += drivenMileage; // mileage + drivenMileage = drivenMileage
        System.out.println("You drive " + drivenMileage + " miles"); // print
        System.out.println();
        System.out.println("The mileage on the car is: " + mileage); //print

    }

    public void drive1(String route, double drivenMileage ){
        mileage += drivenMileage;
        System.out.println("You drive " + drivenMileage + " miles on route " + route );
        System.out.println("The mileage on the car is: " + mileage);
    }
}
