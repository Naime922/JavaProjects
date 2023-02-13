package Mortgage;

public class MainClass {
    public static void main(String[] args) {
        HousePrices housePrices1 = new HousePrices("David", "like new", "House", 5, 50000, 30, new StatesTax("New York") );
        System.out.println(housePrices1.getPriceTotal());
        System.out.println(housePrices1.getPriceEachMonth());
        System.out.println(housePrices1.getUsername());

        System.out.println("===============");
        HousePrices housePrices2 = new HousePrices("Fernando", "new", "Apartment", 3,40000, 30,new StatesTax("Ohio"));
        System.out.println(housePrices2.getPriceTotal());
        System.out.println(housePrices2.getPriceEachMonth());
        System.out.println(housePrices2.getUsername());

        System.out.println("=================");
        HousePrices housePrices3 = new HousePrices("Emily", "Old", "condo", 4,30000, 36,new StatesTax("Florida"));
        System.out.println(housePrices3.getPriceTotal());
        System.out.println(housePrices3.getPriceEachMonth());
        System.out.println(housePrices3.getUsername());

        System.out.println("=================");
        HousePrices housePrices4 = new HousePrices("Rinda", "Renew Required", "Condo", 1,50000, 35,new StatesTax("New Jersey"));
        System.out.println(housePrices4.getPriceTotal());
        System.out.println(housePrices4.getPriceEachMonth());
        System.out.println(housePrices4.getUsername());
    }
}
