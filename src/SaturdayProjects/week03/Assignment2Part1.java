package SaturdayProjects.week03;

public class Assignment2Part1 {
    public static void main(String[] args) {
        String address = "231332 leaf ave, Lake City 3132";

        if (address.isEmpty()) {
            System.out.println("No address found");

        } else {
            System.out.println("The address is " + address.toUpperCase());

        }

        String address2 = "";

        if (address2.isEmpty()){
            System.out.println("No address found!");
        }else{
            System.out.println("The address is " + address2.toUpperCase());
        }

    }
}