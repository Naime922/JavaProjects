package SaturdayProjects.week04;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        double number = scan.nextDouble();

        if(number>0){
            if(Math.abs(number)<1){

            } else if (number>1000000) {
                System.out.println("Positive large number");
            }else {
                System.out.println("Positive number");
            }

        } else if (number<0) {
            if (Math.abs(number)<1){
                System.out.println("Negative small number");

            }else if (Math.abs(number)>1000000){
                System.out.println("negative large number");
            }else {
                System.out.println("Negative number");
            }
            }

        }


    }

