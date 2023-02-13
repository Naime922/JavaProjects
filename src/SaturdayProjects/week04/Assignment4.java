package SaturdayProjects.week04;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
//        Instruction : In this assignment you are given two string variables word1 and word2.
//        You need to check if they are equal using an if.
//        Comparison should be case sensitive. “java” and “JaVa” are not equal.
//                If they are equal, print output “word1 equals word2”
//        Else, print output “word1 does not equal word2”
//        Ex:
//        word1 = “java”
//        word2 =”java”
//        output:
//        “word1 equals word2”
       Scanner scan = new Scanner(System.in);
        System.out.println("Please enter word1");
        String word1 = scan.nextLine();
        System.out.println("Please enter word2");
        String word2= scan.nextLine();

        if (word1.equals(word2)){
            System.out.println("word1 equals word2");
        }else {
            System.out.println("Word1 does not equal word2");


        }
    }
}
