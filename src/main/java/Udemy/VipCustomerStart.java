package Udemy;

public class VipCustomerStart {
    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName() + "\n" + person1.getCreditLimit() + "\n" + person1.geteMailAddress());

        VipCustomer person2 = new VipCustomer("\nDavid\n", 1000);
        System.out.println(person2.getName() + person2.getCreditLimit());

        VipCustomer person3 = new VipCustomer("\nRaoul\n", 500, "\nraoul@yahoo.com");
        System.out.println(person3.getName() + person3.getCreditLimit() + person3.geteMailAddress());

    }
}
