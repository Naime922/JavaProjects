package SaturdayProjects.week1;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;

        System.out.println("Please enter item 1 and the price of the item?");
        item1 = scan.nextLine();
        price1 = scan.nextDouble();
        System.out.println("Please enter item 2 and the price of the item?");
        scan.nextLine();
        item2 = scan.nextLine();
        price2 =scan.nextDouble();
        System.out.println("Please enter item 3 and the price of the item?");
        scan.nextLine();
        item3 =scan.nextLine();
        price3 = scan.nextDouble();
        totalPrice = price1 + price2 + price3;
        report = "item1: " + item1 + " Price: " + price1 +", Item 2: " + item2 + " Price: " + price2 + ", Item 3: " + item3 +" Price: " + price3 ;



        System.out.println("Total price is: " + totalPrice);

        System.out.println(report);

    }
}
