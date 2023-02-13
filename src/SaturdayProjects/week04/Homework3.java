package SaturdayProjects.week04;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        // think of the first number as temperature
        // second number is atmospheric pressure
        // and your code is doing diagnostics
//        NIST uses a temperature of 20 °C (293.15 K, 68 °F) and
//        an absolute pressure of 1 atm (14.696 psi, 101.325 kPa).
//       This standard is also called normal temperature and pressure (abbreviated as NTP).
        int normalTemp = 20;
        int normalAtm = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter temperature as a Celsius:");
        int temperature = scan.nextInt();
        System.out.println("Please enter atmospheric pressure");
        int atmPressure = scan.nextInt();

        if (temperature == normalTemp && atmPressure == normalAtm) {
            System.out.println("Normal temperature and pressure ");
        } else if (temperature < normalTemp) {
            System.out.println("its cold temperature ");
            if (atmPressure < normalAtm || atmPressure > normalAtm) {
                System.out.println("Not a normal pressure");

            }else if (atmPressure == normalAtm){
                System.out.println("Normal pressure");
            }

        }else if (temperature > normalTemp) {
                System.out.println("Its worm enough.");
                if (atmPressure < normalAtm || atmPressure > normalAtm) {
                    System.out.println("Not a normal pressure");

                }else if (atmPressure == normalAtm){
                    System.out.println("Normal pressure");
                }
            } else {
                System.out.println("Not valid entry ");
            }
        }
    }






