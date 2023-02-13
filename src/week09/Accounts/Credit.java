package week09.Accounts;

public class Credit extends Account{

    private double creditLimit;
    private double transactionFee;

    public Credit(double creditLimit) {
        super("credit");
        this.creditLimit = creditLimit;
        this.transactionFee=0.03;
    }

    @Override
    public void addMoney(double amount) {
        // * In addMoney method decrease the amount by %transactionFee and add it to the balance if the amount is equal or bigger than 0,
        //    * otherwise print "You cannot add negative amount".
        if (amount>=0){
            double balance=getBalance();
            balance=balance + (amount-amount*transactionFee);
            setBalance(balance);
        }else{
            System.out.println("You cannot add negative amount");
        }


    }

    @Override
    public void withdrawMoney(double amount) {
        // In withdrawMoney method decrease balance by amount and %transactionFee of the amount if balance is equal or greater than the total amount,
        //    * otherwise print "Insufficient balance"
        double balance=getBalance();
        if (creditLimit+balance>=amount){
            balance=balance-amount-amount*transactionFee;
            setBalance(balance);
        }else{
            System.out.println("Insufficient balance");
        }

    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }



}
