package SaturdayProjects.week04;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        /**
         Note: get exam results from user as string
         Write a Java program to evaluate exam result of student
         ex:
         'A'-> Excellent!!!
         'B'-> Well done
         'C'-> Good
         'D'-> Need improvement
         'F'-> Fail
         For anything else print this is not a valid result
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your score");
        String result = scan.nextLine();

        switch (result ){
            case "A" :
                System.out.println("Excellent :) ");
                break;
            case "B":
                System.out.println("Well done!!");
                break;
            case "C":
                System.out.println("Good..");
                break;
            case "D":
                System.out.println("Need improvement..");
                break;
            case "F":
                System.out.println("Fail!!");
                break;
            default:
                System.out.println("Invalid result");



        }

    }
}
