package SaturdayProjects.week1;

import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String phoneNumber;
        int areaCode, localNumber;
        System.out.println("Please enter your area code below:");
        areaCode = input.nextInt();
        System.out.println("Please enter your local number: ");
        localNumber = input.nextInt();
        input.nextLine();
      //  phoneNumber = areaCode + localNumber;
        System.out.println("Calling number: " +"("+ areaCode +")"+"-"+ localNumber);

    }
}
