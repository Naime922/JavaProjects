package SaturdayProjects.week05;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the message");
        String message = scan.nextLine();
        System.out.println(isContainWord(message));
    }

    public static boolean isContainWord(String message){
        String searchWord = "apple";
        boolean word = message.contains(searchWord);
        while (word){
            return true;

        }
        return false;


    }
}


