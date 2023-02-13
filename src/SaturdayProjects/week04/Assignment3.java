package SaturdayProjects.week04;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
// Instruction : Declare int variables: seniorCitizens, age
//   Create a Scanner object
//   Ask user to enter count for seniorCitizens and nonSeniorCitizens using message:
//“Enter current count for seniorCitizens and nonSeniorCitizens:”
//  Ask user to enter age:
//“What is new citizen’s age?”
// If citizen’s age is more than or equals to 65 then print” Senior Citizen” and increment
// seniorCitizens variable by 1.
//   If citizen’s age is less than 65 then print “Not-Senior Citizen” and increment nonSeniorCitizens
//  variable by 1.
//    At last, print another message:
//“New seniorCitizens count ValueOfVariable”
//“New nonSeniorCitizens count ValueOfVariable”
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter current  count for  Senior Citizens: ");
        int seniorCitizens = input.nextInt();
        System.out.println("Please enter current count for non Senior Citizens: ");
        int nonSenior = input.nextInt();
        System.out.println("What is new citizen’s age?");
        int age = input.nextInt();

        if(age>=65){
            System.out.println("Senior Citizen");
            seniorCitizens+=1;

        } else{
            System.out.println("Not-senior citizen");
            nonSenior+=1;

        }
        System.out.println("New senior citizen count is " + seniorCitizens);
        System.out.println("New non-senior citizen count is " + nonSenior);
        }


    }

