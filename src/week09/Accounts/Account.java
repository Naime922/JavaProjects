package week09.Accounts;

public abstract class Account {

    private String accountNumber;
    private double balance;
    private String accountType;

    public Account(String accountType) {
        this.balance = 0;
        this.accountType = setAccountType(accountType);
        this.accountNumber=setAccountNumber();

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String setAccountNumber() {
        //Assign a random number between 1000000-10000000 to accountNumber.
        int accountNum=(int)(1000000 + (Math.random() * (10000000 - 1000000)));
        this.accountNumber =Integer.toString(accountNum);
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public String setAccountType(String accountType) {
        //In the setAccountType method change the return type to String and pass the String accountType parameter
        // that you are getting by the constructor to this method
        //and make it all uppercase and assign it to object's accountType variable.
        this.accountType = accountType.toUpperCase();
        return accountType;
    }
    public abstract void addMoney(double amount);

    public abstract void withdrawMoney(double amount);
}
