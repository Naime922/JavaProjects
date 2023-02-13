package SaturdayProjects.week03;

import java.util.Scanner;

public class Snowman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter word?");
        String word = input.nextLine();
        System.out.println(word.substring(0,3));
        String word2 = input.nextLine();
        word2.replace("bat","Snow");
        System.out.println(word2);
    }
}
