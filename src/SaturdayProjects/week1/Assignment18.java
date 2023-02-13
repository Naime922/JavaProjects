package SaturdayProjects.week1;

import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the portal.");
        System.out.println("To register please enter your personal information bellow:");
        System.out.println("Please enter your firstname:");
        String firtsname = scanner.nextLine();
        System.out.println("Please enter your lastname:");
        String lastname = scanner.nextLine();
        System.out.println("Please enter your email:");
        String email = scanner.nextLine();
        System.out.println("Please enter your street address:");
        String street = scanner.nextLine();
        System.out.println("Please enter your state:");
        String state = scanner.nextLine();
        System.out.println("Please enter your city:");
        String city = scanner.nextLine();
        System.out.println("Please enter full address:");
        String address = scanner.nextLine();
        System.out.println("Please enter your zipcode:");
        int zipcode = scanner.nextInt();
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        System.out.println("Please enter height:");
        double height = scanner.nextDouble();
        System.out.println("Please enter your weight:");
        double weight = scanner.nextDouble();
        System.out.println("Are you married:");
        boolean married = scanner.nextBoolean();
        System.out.println("Please enter your personal phone number:");
        long personal = scanner.nextLong();
        System.out.println("Please enter your work phone number:");
        long work = scanner.nextLong();

        System.out.println("MEMBER INFORMATION");

        System.out.println("Full name: "+ firtsname );
        System.out.println("Address: "+address);
        System.out.println("Contacts: " + personal + work );
        System.out.println("Email: "+ email);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
        System.out.println("Married? "+married);






    }
}
