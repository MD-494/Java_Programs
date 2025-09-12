package Bank;

public class BankAccount {
    private double balance;

    /**
     * Parameterized constructor
     * @param balance
     */
    public BankAccount(double balance){
        this.balance = balance;
    }

    /**
     * Public method to deposit money into the account
     * @param deposit
     */
    public void deposit(double deposit){
        balance += deposit;
    }

    /**
     * Public method to withdraw money from the account
     * @param withdraw
     */
    public void withDraw(double withdraw){
        balance -= withdraw;
    }

    /**
     * Public method to check the current balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }
}
