package SaturdayProjects.week05;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System .in);
        System.out.println("Type a word");
        String word= scan.nextLine();
        System.out.println(getMiddleChars(word));

    }
    public static String getMiddleChars(String word){
        String middle="";
        if(word.length()%2!=0 && word.length()>=5){
            //nebahat
            middle+=word.substring(word.length()/2-1,word.length()/2+2);

        }else {
            middle+="invalid";
        }
        return middle;
    }
    }

