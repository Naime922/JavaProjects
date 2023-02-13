package SaturdayProjects.week05;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number1");
        int num1 = scan.nextInt();
        System.out.println("Please enter number2");
        int num2 = scan.nextInt();
        System.out.println(getNumber(num1,num2));

    }

    public static String getNumber(int num1, int num2){
        String total = "";
        for (int i = num1; i < num2; i++) {
            if(i%3==0){
                total+= i+ " ";
            }
        }
        return total;
    }
}
