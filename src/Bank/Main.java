package Bank;

public class Main {
    public static void main(String[] args) {
        Account johaoAccount = new Account("ZXC123", 0.00, "Johao Perlaza",
                "perlazajohao@gmail.com", "+593978970998");
        //BankAccount bank = new BankAccount();

        System.out.println("Balance Initial: " + johaoAccount.getBalance());
        johaoAccount.depositFunds(100);
        johaoAccount.withdrawFunds(90);
        johaoAccount.withdrawFunds(15);
    }
}
