package SaturdayProjects.week05;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your text");
        String email = scan.nextLine();

        System.out.println(getMyName(email));
    }

    public static String getMyName(String name) {
        String searchWord = "Alex";
        if (name.contains(searchWord)) {
            return "Read this email";
        } else {
            return "don't read";
        }

    }
}
