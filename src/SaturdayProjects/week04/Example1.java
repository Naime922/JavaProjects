package SaturdayProjects.week04;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the number you want to check");
        int number = scan.nextInt();
        if(number>0){
            System.out.println("The number is positive");


        }else if (number<0){
            System.out.println("the number is negative");
        }else {
            System.out.println("The number is zero");
        }

    }
}
