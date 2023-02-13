package SaturdayProjects.week04;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
//        Instruction : The video game machine gives coupons according to how well you play the game. You
//        can redeem 10 coupons for a candy bar or 3 coupons for a gumball. You prefer candy bars to
//        gumballs. Write a program that defines a variable initially assigned to the number of coupons you
//        win. Next, the program should output how many candy bars and gumballs you can get if you spend
//        all of your coupons on candy bars first, and any remaining coupons on gumballs.
//                If your coupons are not enough for any redeem, display message:
//              “Not enough coupons”

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of coupons:");
        int coupon=input.nextInt();

        int priceCandy = 10;
        int priceGumball=3;

        if (coupon>=priceCandy) {
            int candy = coupon/priceCandy;
            System.out.println("Number of candy: " + candy);
             coupon%=priceCandy;
            if (coupon>=priceGumball){
                int gumball= coupon/priceGumball;
                System.out.println("Number of gumball: " + gumball);
            } else if (coupon<priceGumball) {
                System.out.println("Not enough coupons for gumball..");

            }
        } else if (coupon<priceCandy && coupon>=priceGumball ) {

                int gumball=coupon/priceGumball;
                System.out.println("Number of gumball is: " + gumball);
                System.out.println("Not enough coupons for candy..");


        }else {
            System.out.println("Not enough coupons");
        }


    }

    }

