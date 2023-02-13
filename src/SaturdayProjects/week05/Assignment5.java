package SaturdayProjects.week05;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word ");
        String word = input.nextLine();
        System.out.println(getReverseString(word));

    }
    public  static  String getReverseString(String word){
        String reverse = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        return reverse;
    }
}
