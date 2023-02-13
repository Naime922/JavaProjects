package SaturdayProjects.week05;

import java.util.Scanner;

public class Assignment4 {
//    Instruction : Write a program that will print out a new word which is merged by the inputs entered by user.
//    If either of the entered inputs does not have exactly 3 characters, print “cannot merge”
//    Merge their characters one by one and print together like below:
//    Declare the variables
//- Create Scanner object
//- Create String method named getMergedWord()
//- Call the method in main method.
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter word one");
    String word1 = input.nextLine();
    System.out.println("Please enter word two");
    String word2 = input.nextLine();
    System.out.println(getMergeWord(word1 ,word2));


}
public static String getMergeWord(String word1,String word2) {

    String merge = "";
    if (word1.length() == 3 && word2.length() == 3) {




         merge = merge + word1.charAt(0) + word2.charAt(0) + word1.charAt(1) + word2.charAt(1) + word1.charAt(2) + word2.charAt(2);
    } else {
        merge = "Cannot merge";
    }
    return merge;
}

}
