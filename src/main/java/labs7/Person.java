package labs7;

import labs7.AgeException;
import labs7.Gender;

public class Person {

    private int age;
    private String name;
    private Gender gender;
    public static final String universalRights = "All Humans are created equal";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = Gender.UNKNOWN;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender nieuweGender){
        this.gender = nieuweGender;
    }

    public void haveBirthday(){
        this.age = this.age + 100;
        if (this.age > 130) throw new AgeException();
    }


    // setter:
    // public void set<Fieldname>(<fieldtype> <identifier>){
    //      this.<fieldname> = identifier;
    //}


}



