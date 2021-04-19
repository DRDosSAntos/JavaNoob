package labs9;

import labs8.Genderh8;

public class Start9 {
    public static void main(String[] args) {
        Personh9 ins1 = new Personh9("renee",30);
        Personh9 ins2 = new Personh9("jan",30, Genderh8.MALE);
        Personh9 ins3 = new Personh9("jan",30, Genderh8.MALE, "01-01-1988");


        System.out.println(ins1.getName());
        System.out.println(ins1.getAge());
        System.out.println(ins1.getGender());
        System.out.println(ins1.getDateOfBirth());

        System.out.println(ins2.getName());
        System.out.println(ins2.getAge());
        System.out.println(ins2.getGender());
        System.out.println(ins2.getDateOfBirth());

        System.out.println(ins3.getDateOfBirth());



    }
}
