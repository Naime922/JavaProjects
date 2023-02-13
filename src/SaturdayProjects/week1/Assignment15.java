package SaturdayProjects.week1;

import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 Numbers bellow:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int sum;
        sum = num1 + num2 + num3;
        System.out.println("Sum of numbers: " + sum);

    }
}
