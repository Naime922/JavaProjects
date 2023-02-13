package SaturdayProjects.week04;

import java.util.Scanner;

public class PracticeWithYoldas {
    public static void main(String[] args) {
        // get string input from the user
        // check if it contains 'a' and 'b'
        // check if it contains 'a' or 'c'
        // check if it does NOT contain 'c'
        // check if it does not contain both 'c' and 'd'

        Scanner scan = new Scanner(System.in);
        System.out.println("PLease enter word?");
        String word = scan.nextLine();
        if (word.contains("a") && word.contains("b")) {
            System.out.println("its has a and b");
        }
        if (word.contains("a") || word.contains("c")) {
            System.out.println("its has a and c");

        }
        if (!word.contains("c")) {
            System.out.println("not contains c ");

        }
        if (!word.contains("c") && !word.contains("d")) {
            System.out.println("its does not contain c and d");
        }
    }
}