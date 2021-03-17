package JavaProgrammingMasterclassforSoftwareDevelopers.Bank;

public class VipAccount {
    private String name;
    private double credit_limit;
    private String email_address;

    public VipAccount() {
        this("Undefined", 0, "Undefined");
    }

    public VipAccount(String name, double credit_limit) {
        this(name, credit_limit, "Undefined");
    }

    public VipAccount(String name, double credit_limit, String email_address) {
        this.name = name;
        this.credit_limit = credit_limit;
        this.email_address = email_address;
    }

    public String getName() {
        return name;
    }

    public double getCredit_limit() {
        return credit_limit;
    }

    public String getEmail_address() {
        return email_address;
    }
}
