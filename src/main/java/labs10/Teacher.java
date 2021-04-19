package labs10;

import labs8.Genderh8;

public class Teacher extends Personh10 {

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Genderh8 gender) {
        super(name, age, gender);
    }

    public Teacher(String name, int age, Genderh8 gender, String dateOfBirth) {
        super(name, age, gender, dateOfBirth);
    }
    @Override
    public String greet() {
        return "I'm tired of working. This is inhuman!(T)";
    }
}
