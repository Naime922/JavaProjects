package SaturdayProjects.week02;

public class Car {
    private String color;
    // created string variable color
    private double mileage;
    // created double variable mileage

    public Car(String carColor,double carMileage){
        color = carColor;
        mileage = carMileage;
        // created constructor with  both mileage and color parameters
        // color initialized to carColor and mileage initialized to carMileage

    }

    public void printCarInfo(){
        System.out.println("The car color is " + color);
        System.out.println("The car mileage is " + mileage);

    }

}
