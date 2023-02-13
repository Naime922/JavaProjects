package SaturdayProjects.week06;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {


        int[] number =new int[10];
        for (int i = 0; i < number.length; i++) {
            int randomNumber= (int)(Math.random()*100);
            number[i]=randomNumber;
        }
        for (int elements:number) {
            System.out.print(elements+" " );
        }


    }
}
