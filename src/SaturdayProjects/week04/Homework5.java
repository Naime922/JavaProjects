package SaturdayProjects.week04;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        // if temperature is less than 15 set message to "Cold Weather" otherwise set it to "Good Weather"
        // USE TERNARY OPERATOR
        // get temperature from user

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the temperature ?" );
        double temperature = input.nextDouble();

        String setMessage = temperature<15 ? "Cold Weather" : "Good Weather";
        System.out.println(setMessage);
    }
}
