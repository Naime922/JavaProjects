package SaturdayProjects.week04;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number =scan.nextInt();


        if (number%2 == 0){
            System.out.println(number + " is even ");

        } else {
            System.out.println(number + " is odd");

        }
    }
}
