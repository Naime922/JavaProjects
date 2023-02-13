package SaturdayProjects.week06;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
//        A sandwich is two pieces of bread with something in between. Print the string that is between the
//        first and last apperance of “bread” in the given string, or return string “nothing” if there are not two pieces of
//        bread.
//                Declare the variables
//        - Create Scanner object
//        - Create String method named getInbetween()
//                - Call the method in main method.


        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        System.out.println(getInbetween(word));

    }

    public static String getInbetween(String input) {
        int firstIndex = input.indexOf("bread");
        int lastIndex = input.lastIndexOf("bread");
        int totalIndex = input.length();

        if (firstIndex == -1 || lastIndex == -1 || firstIndex == lastIndex||totalIndex<=10) {
            return "nothing";
        }

        return input.substring(firstIndex + 5, lastIndex);


    }
}








