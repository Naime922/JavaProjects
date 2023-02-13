package SaturdayProjects.week1;

import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int hour = input.nextInt();
        int minute = input.nextInt();
        int second = input.nextInt();
        input.nextLine();
        String amorpm = input.nextLine();

        System.out.print(hour+":"+minute+":"+ second  + amorpm );


    }
}
