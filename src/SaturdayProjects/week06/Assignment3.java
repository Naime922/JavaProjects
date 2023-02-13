package SaturdayProjects.week06;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        System.out.println(isEqual(sentence));
        System.out.println(sentence.length());



    }
    public static boolean isEqual(String word){
        boolean isEqual = true;
        int counterJava=0;
        String searchWord="java";

        for (int i = 0; i <=word.length()-searchWord.length() ; i++) {

            if(searchWord.equals(word.substring(i,i+searchWord.length()))){
                counterJava++;
            }

        }
        int counterPython=0;
        String searchWord1="python";
        for (int i = 0; i <=word.length()-searchWord1.length() ; i++) {
            if(searchWord1.equals(word.substring(i,i+searchWord1.length()))){
                counterPython++;
            }

        }
        if(counterJava==counterPython){
            isEqual = true;
        }
        else if (counterJava!=counterPython){
            isEqual = false;
        }
        return isEqual;
    }
}



