package noob.classes;

import java.util.Scanner;

public class UserInput {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = in.nextLine();
        System.out.println("Username is: " + userName);
        System.out.println("Enter Age");
        int age = in.nextInt();
        System.out.println("Age is: " + age);
    }
}
