package SaturdayProjects.week04;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number");
        int number = input.nextInt();
        switch (number){
            case 5:
                System.out.println("ok");
                break;
            case 3 :
                System.out.println("Maybe");
            case 1:
                System.out.println("No");
                break;
            default:
                System.out.println("dunno");


        }
    }
}
