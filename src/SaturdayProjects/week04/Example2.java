package SaturdayProjects.week04;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        //    Take values of length and breadth
//    of a rectangle from user and check
//    if it is square or not
        Scanner input = new Scanner(System.in);
        System.out.println("please enter length");
        int length = input.nextInt();
        System.out.println("please enter breadth");
        int breadth = input.nextInt();

        if(length == breadth){
            System.out.println("its square");

        }else {
            System.out.println("its not");

        }
    }
}
