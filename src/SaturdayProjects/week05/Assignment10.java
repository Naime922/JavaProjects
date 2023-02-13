package SaturdayProjects.week05;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the start point (uppercase)");
        String start= scan.nextLine();
        System.out.println("Enter the end point(uppercase)");
        String end=scan.nextLine();
        System.out.println(getRoute(start, end));
    }
    public static String getRoute(String start, String end){
        String route="";
        switch (start){
            case "A":
                if(end.equals("B")){
                    route=route+ "right: "+ end+ " found.";
                } else if (end.equals("C")) {
                    route=route+ "right>down: "+ end+ " found.";
                } else if (end.equals("D")) {
                    route=route+ "right>down>left: "+ end+ " found.";
                }else {
                    route=route+ start+ "found.";
                }
                break;
            case "B":
                if(end.equals("C")){
                    route=route+ "down: "+ end+ " found.";
                } else if (end.equals("D")) {
                    route=route+ "down>left: "+ end+ " found.";
                } else if (end.equals("A")) {
                    route=route+ "down>left>up: "+ end+ " found.";
                }else {
                    route=route+ start+ " found.";
                }
                break;
            case "C":
                if(end.equals("D")){
                    route=route+ "left: "+ end+ " found.";
                } else if (end.equals("A")) {
                    route=route+ "left>up: "+ end+ " found.";
                } else if (end.equals("B")) {
                    route=route+ "left>up>right: "+ end+ " found.";
                }else {
                    route=route+ start+ " found.";
                }
                break;
            case "D":
                if(end.equals("A")){
                    route=route+ "up: "+ end+ " found.";
                } else if (end.equals("B")) {
                    route=route+ "up>right: "+ end+ " found.";
                } else if (end.equals("C")) {
                    route=route+ "up>right>down: "+ end+ " found.";
                }else {
                    route=route+ start+ " found.";
                }
                break;

        }return route;
    }
}
