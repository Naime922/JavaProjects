package SaturdayProjects.week04;

import java.util.Scanner;

public class PracticeTask {
    public static void main(String[] args) {

        // get an int from user
        // if it is greater than 100, print "PASSED"

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number");
        int number = input.nextInt();
        if(number>100){
            System.out.println("PASSED");

        }



    }
}
