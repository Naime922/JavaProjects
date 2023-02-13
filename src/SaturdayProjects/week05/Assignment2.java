package SaturdayProjects.week05;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1= scan.nextInt();

        System.out.println("Enter num2");
        int num2= scan.nextInt();

        System.out.println(getLargerNumber(num1, num2));

    }
    public static int getLargerNumber(int num1,int num2){
        int largerNum=(num1>num2)? num1 : num2;
        return largerNum;
    }
    }

