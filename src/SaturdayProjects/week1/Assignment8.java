package SaturdayProjects.week1;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {

       // Assume the word is a String variable and already has a value.
        // Write a statement to display the message “Today’s-Of-The-Day is:” followed by the
        //value of word
        //• The message and the value of the word should appear together, on a single line
       // Ex: Today’s-Of-The-Day is:Java

        String word = new Scanner(System.in).nextLine();
        System.out.println("Today's-Of-The-Day is:"+word);
    }
}
