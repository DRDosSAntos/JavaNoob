package labs7;

import labs7.Gender;
import labs7.Person;

public class LabsH7 {

    public static void main(String[] args) {
        Person p = new Person("Jan", 45);

        int zijnAge = p.getAge();
        System.out.println(zijnAge);

        System.out.println(p.getName());

        System.out.println(p.getGender());

        Gender nieuweGender = Gender.MALE;
        p.setGender(nieuweGender);
        System.out.println(p.getGender());

        System.out.println(Person.universalRights);

        System.out.println(Gender.values().length);

        try {
            p.haveBirthday();
            System.out.println(p.getAge());
        } catch(RuntimeException ae){
            System.out.println("Dood! Mensen worden niet ouder dan 130");
        } finally{
            System.out.println("Labs 7.1 en 7.2 compleet.");
        }

    }
}
