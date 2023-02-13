package SaturdayProjects.week05;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter word");
        String word = scan.nextLine();
        System.out.println(getLastWord(word));

    }
    public static char getLastWord(String word){
        char lastLetter = word.charAt(word.length()-1);

return lastLetter;
    }

}
