package SaturdayProjects.week02;

public class Assignment7 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        System.out.println("num1: " + num1);
        // num1= 1 (num1 : 1)
        System.out.println("num2: " + num2);
        //num2 =2 (num2: 2)


        int temp = num1;
        //temp = 1
        num1 = num2;
        // num1 became 2
        num2 = temp;
        //num 2 became 1
        System.out.println("num1: "+ num1);

        System.out.println("num2: " + num2);

    }
}
