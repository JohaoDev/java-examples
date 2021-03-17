package JavaProgrammingMasterclassforSoftwareDevelopers.Bank;

public class Main {
    public static void main(String[] args) {
        Account johaoAccount = new Account("ZXC123", 0.00, "Johao Perlaza",
                "perlazajohao@gmail.com", "+593978970998");
        //BankAccount bank = new BankAccount();

        System.out.println("Balance Initial: " + johaoAccount.getBalance());
        johaoAccount.depositFunds(100);
        johaoAccount.withdrawFunds(90);
        johaoAccount.withdrawFunds(15);

        VipAccount nicolasAccount = new VipAccount("Johao Nicolas",
                150.80, "jperlaza@ec.krugercorp.com");

        System.out.println(nicolasAccount.getName());
        System.out.println(nicolasAccount.getCredit_limit());
        System.out.println(nicolasAccount.getEmail_address());
    }
}
