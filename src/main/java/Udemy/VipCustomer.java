package Udemy;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String eMailAddress;

    public VipCustomer(String name, double creditLimit, String eMailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.eMailAddress = eMailAddress;
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit, "UNKNOWN");
    }

    public VipCustomer() {
        this("Default name", 0, "Default eMail");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }
}
