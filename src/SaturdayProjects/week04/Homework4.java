package SaturdayProjects.week04;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 digit number:");
        int num1 = scan.nextInt();
        System.out.println("Please enter second 2 digit number:");
        int num2 = scan.nextInt();

        if (num1 > num2){
            System.out.println("The greatest number is:\t" + num1);
        } else if (num2>num1) {
            System.out.println("The greatest number is:\t" +num2 );

        }else{
            System.out.println("The number " + num1 + " and " + num2 + " is equal. ");

        }
    }
}
