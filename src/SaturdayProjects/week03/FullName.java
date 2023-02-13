package SaturdayProjects.week03;

import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter f and l name ?");
        String first = input.nextLine();
        System.out.println("Please enter last name?");
        String last = input.nextLine();
        String fulname = first + " " + last;
        System.out.println(fulname);
        String initials = fulname.charAt(0)+".  "+ fulname.charAt(6);
        System.out.println(initials);
    }
}
