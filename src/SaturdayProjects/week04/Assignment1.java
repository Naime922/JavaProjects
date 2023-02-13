package SaturdayProjects.week04;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
//        Instruction : Let’s say you’ve got a 100 dollar gift card  you want to buy something in your online store.
//                Write a program that will help you to buy something and display leftover balance after purchase. If item is not
//        in the list, display message: “Invalid item!”. If price is more than 100 dollar, display message: “Sorry, not
//        enough funds on your gift card!”.
        int gift = 100;

        int charger = 15;
        int usbCable = 10;
        int headPhone = 30;
        int pant = 50;
        int hat = 25;
        int socks  = 5;
        int blanket = 60;
        int pillow = 40;

        Scanner input=new Scanner(System.in);
        System.out.println();
        System.out.println("Congrats you've got 100$ Gift card!!");
        System.out.println("Please select the item you want to buy :) ");
        System.out.println(" Smart Phone = 300$\n" +
                " Laptop = 400$\n" +
                " Charger = 15$\n" +
                " Usb Cable = 10$\n" +
                " Head Phone = 30$\n" +
                " Pants = 50$\n" +
                " Hat = 25$\n" +
                " Socks  = 5$\n" +
                " Blanket = 60$\n" +
                " Pillow = 40$");
        String item = input.nextLine();

        if(item.equals("Smart Phone")){
            System.out.println("Sorry not enough funds on your gift card!");
            
        } else if (item.equals("Laptop")) {
            System.out.println("Sorry not enough funds on your gift card!");
            
        } else if (item.equals("Charger")) {
            gift -= charger;
            System.out.println("Your current balance is: " + gift);
            
        } else if (item.equals("Usb Cable")) {
            gift-=usbCable;
            System.out.println("Your current balance is: " + gift);

        } else if (item.equals("Head Phone")) {
            gift-=headPhone;
            System.out.println("Your current balance is: " + gift);

        } else if (item.equals("Pants")) {
            gift-=pant;
            System.out.println("Your current balance is: " + gift);

        } else if (item.equals("Hat")) {
            gift-=hat;
            System.out.println("Your current balance is: " + gift);

        } else if (item.equals("Socks")) {
            gift-=socks;
            System.out.println("Your current balance is: " + gift);

        } else if (item.equals("Blanket")) {
            gift-=blanket;
            System.out.println("Your current balance is: " + gift);
        } else if (item.equals("Pillow")) {
            gift-=pillow;
            System.out.println("Your current balance is: " + gift);

        }else {
            System.out.println("Invalid item!");
        }


    }
}
