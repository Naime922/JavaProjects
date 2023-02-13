package SaturdayProjects.week04;

import java.util.Scanner;

public class Assignment9 {
   public static void main(String[] args) {

//        Instruction : In the given program you have a quiz question and a scanner to catch user input which will
//        be stored on string a.
//                After the user inputs an answer (a, b, c)
//        we need to write a code to check if it is the correct or wrong to validate the answer

       Scanner input = new Scanner(System.in);
       System.out.println("What is the farthest planet in the solar system: \n"+
                            "A) Venus\n"+
                            "B) Pluto\n"+
                            "C) Neptune");
       String a = input.nextLine();

       if(a.equals("A")){
           System.out.println("A is wrong.. ");
       } else if (a.equals("B")) {
           System.out.println("B is wrong.. ");

       } else if (a.equals("C")) {
           System.out.println("C is correct!");

       }else {
           System.out.println(a + " is not valid answer.");
       }


   }
}
