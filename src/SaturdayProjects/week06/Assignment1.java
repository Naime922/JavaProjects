package SaturdayProjects.week06;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
//        Given a string, consider the prefix of string made of the first n chars of the string. Does that prefix
//        string appear somewhere else in the string?
//                Write a program which return boolean value (true/false) based on the input
//        Assume that the string is not empty and that n is in the range from 1 till str.length().

//        Declare the variables
//                - Create Scanner object
//        - Create boolean method named appearsMore()
//                - Call the method in main method.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter word.");
        String str = input.nextLine();
        System.out.println("Please enter number ");
        int n = input.nextInt();
        System.out.println(appearsMore(str,n));
        System.out.println(str.length());
    }
    public static boolean appearsMore(String str, int n) {
        String prefix = str.substring(0, n);
        int count = 0;
        for (int i = 0; i < str.length()-n+1; i++) {
            if (str.substring(i, i + n).startsWith(prefix)) {
                count++;
            }
        }
        System.out.println(prefix + " appears " + count + " times");
        return count > 1;
    }
}
