package SaturdayProjects.week03;

public class Assignment3 {
    public static void main(String[] args) {

        String accountNum1 = "5248621725";
        if (accountNum1.startsWith("2") && accountNum1.length() == 7){
            System.out.println("Valid 7 digit account number.");

        }else {
            System.out.println("invalid 7 digit account number");
        }
        if(accountNum1.startsWith("5") && accountNum1.length() == 10){
            System.out.println("Valid 10 digit account number ");

        }else {
            System.out.println("Invalid 5 digit account number ");
        }
        if(accountNum1.startsWith("2") != accountNum1.startsWith("5")){
            System.out.println("invalid account number ");

        }

    }
}
