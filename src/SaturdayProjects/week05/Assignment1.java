package SaturdayProjects.week05;

import java.util.Scanner;

public class Assignment1 {

    public static String getDay(int dayNumber){
        String day;


        switch (dayNumber){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "No Such Day is Available";
        }
        return day;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a day number");
        int day= scan.nextInt();
        System.out.println(getDay(day));
    }
}