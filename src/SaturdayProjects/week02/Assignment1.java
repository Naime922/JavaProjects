package SaturdayProjects.week02;

public class Assignment1 {
    public static void main(String[] args) {
        int num = 123;

        int num1 = num %10;
        int num2 =(num %100)/10;
        int num3 = num/100;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num1+num2+num3);

    }
}
