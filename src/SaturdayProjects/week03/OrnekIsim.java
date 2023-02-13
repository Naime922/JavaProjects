package SaturdayProjects.week03;
import java.util.Scanner;
public class OrnekIsim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your first and last names with a space between them");

        String fullName = scanner.nextLine();
        System.out.println("My name is " + fullName + " for your name");
        String initials = fullName.charAt(0) + ". " + fullName.charAt(fullName.indexOf(" ")+1) + ".";
        System.out.println(initials);





    }
}