package SaturdayProjects.week02;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("PLEASE ENTER TEMPERATURE IN CELSIUS: ");
        double celcius = scan.nextDouble();

        double covertedvalue ;
        covertedvalue =(celcius * 9/5) + 32;

              //  (celcius  * 1.8) + 32;

        System.out.println("Your fahrenheit degree is: " + covertedvalue);



    }
}
