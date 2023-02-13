package SaturdayProjects.week07;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment1 {
//    Get a String message from the user and turn the first letter of each word into an uppercase letter and
//    print them on the screen
//    Write a program which is going to perform the following actions;
//    a) Accept the String message, which is entered by user
//    b) Split each of the word and store the elements in an array.
//    c) By using the iteration (for each loop), toUpperCase () and substring () method make the first
//    letter of each word upper case.
//    d) Create your own method named getWords () and call it in the main method.
//    e) Your method will return String value.
//    Ex:
//    Input: “I am a detailed oriented quality assurance engineer”
//    Output: “I Am A Detailed Oriented Quality Assurance Engineer”


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter message");
        String message = scanner.nextLine();

        String []messageArray = message.split(" ");
        System.out.println(getWords(messageArray));

    }

    public static String getWords(String[] arr){
        String word="";
        for (String letter:arr) {
            letter =letter.substring(0,1).toUpperCase()+letter.substring(1);
            word += letter + " ";
        }
        return word;
    }
}

