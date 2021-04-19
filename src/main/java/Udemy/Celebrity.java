package Udemy;

public class Celebrity extends VipCustomer {

    private String movies;
    private int numberOfAwards;

    public Celebrity(String name, double creditLimit, String eMailAddress, String movies, int numberOfAwards) {
        super(name, creditLimit, eMailAddress);

        this.movies = movies;
        this.numberOfAwards = numberOfAwards;
    }
}
