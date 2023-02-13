package SaturdayProjects.week04;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Apartments!");
        System.out.println("Number of bedrooms you interested:");
        int numberOfBedrooms = input.nextInt();
        int startingPrice=0;

        if (numberOfBedrooms == 1 ){
            System.out.println("One bedroom selected ");
            startingPrice = 1100;
            System.out.println("Starting price: " + startingPrice);

        } else if (numberOfBedrooms == 2) {
            System.out.println("Two bedroom selected");
            startingPrice = 1850;
            System.out.println("Starting price: " + startingPrice);

        } else if (numberOfBedrooms == 3) {
            System.out.println("Three bedroom selected");
            startingPrice = 2550;
            System.out.println("Starting price: " + startingPrice);

        }else {
            System.out.println("No such bedrooms available");
            System.out.println("Starting price: " + startingPrice);
        }
    }


}
