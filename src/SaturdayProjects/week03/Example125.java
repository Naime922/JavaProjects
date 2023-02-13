package SaturdayProjects.week03;

import java.util.Locale;

public class Example125 {
    public static void main(String[] args) {
        String name = "Carly";
        String color = "Read";
        System.out.println("Your name is "+name.substring(0,1).toUpperCase()+name.substring(1)+ " and your favorite color is "+ color.substring(0,1).toLowerCase(Locale.ROOT)+color.substring(1).replace("a","") );


    }
}
