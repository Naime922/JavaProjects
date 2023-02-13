package SaturdayProjects.week04;

import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        // ask number from user between  0  and 5
        // generate a random number between 0 - 5
        // check if the user number and random number are equal
        // if equals print "you win" else "you lose"
        // Note: if number user provide is between 0 - 5 run program, else print valid"
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter numbers between 0-5 ");
        int number=scan.nextInt();

        int randomNumber = (int) (Math.random()*6);

        if (number >5 || number<0){
            System.out.println("Not valid entry..");

        } else if (number == randomNumber) {
            System.out.println("Congrats you win!!");

        }else {
            System.out.println("You lose the lucky number was: " + randomNumber);

        }

    }
}
