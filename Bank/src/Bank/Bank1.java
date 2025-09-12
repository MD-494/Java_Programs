package Bank;

public class Bank1 {
        public static void main(String[] args) {

            BankAccount account = new BankAccount(10000);

            account.deposit(2000);
            System.out.println("After withdrawing: " + account.getBalance());

            account.withDraw(500);
            System.out.println("Before withdrawing: " + account.getBalance());

            System.out.println("Current Balance is " + account.getBalance());
        }
}
