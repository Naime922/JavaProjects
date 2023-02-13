package SaturdayProjects.week04;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        // get a number from user
        // if the number is larger than zero, get another number from user,
        // if second number is larger than 5 print "ok" else print "not ok"
        // if first number is less than or equal to zero, print "too cold to check"
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int number = scan.nextInt();
        if (number>0) {
            System.out.println("Please enter another number ");
            int number2 = scan.nextInt();
            if (number2>5){
                System.out.println("OK");
            }else {
                System.out.println("NOT OK");
            }
        }else if (number<=0){
            System.out.println("Too cold to check");
        }


    }
}
