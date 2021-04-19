package labs8;

public class h8Start {
    public static void main(String[] args) {
        Personh8 a = new Personh8("Jan", 45, Genderh8.MALE);
        Personh8 b = new Personh8("Wil", 50, Genderh8.FEMALE);
        Personh8 c = new Personh8("Bob", 60, Genderh8.UNKNOWN);
        Personh8 d = new Personh8("Jan", 45, Genderh8.MALE);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}

