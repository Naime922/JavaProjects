package SaturdayProjects.week02;

public class Assignment8 {
    public static void main(String[] args) {
        int num1 = Integer.MAX_VALUE;
        System.out.println(num1);
        //2147483647 max value can hold
        num1++;
        //2147483647 + 1
        System.out.println(num1);
        /* -2147483648 it will turn to a beginning */
    }
}
