package SaturdayProjects.week04;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {

   /*
/     Less than 2 : ineligible
        2 : toddler
        3-5 : early childhood
        6-7 : young reader
        8-10 : elementary
        11-12 :middle
        13 : impossible
        14-16 : high school
        17-18 : scholar
        grater than 18 : ineligible
*/


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scan.nextInt();

        if (age<2){
            System.out.println("ineligible");
        } else if (age==2) {
            System.out.println("toddler");
            
            
        } else if (age>=3 && age<=5) {
            System.out.println("Early childhood");
            
        } else if (age>=6 && age<= 7) {
            System.out.println("Young reader");
            
        } //else if (age) {
            
        }
    }


