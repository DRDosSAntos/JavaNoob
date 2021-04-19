package labs12;

import labs10.Human;
import labs8.Genderh8;

import java.util.Objects;

@MyAnnotation("hallo david")
public class Personh12 {



    private int age;
    private String name;
    private Genderh8 gender;
    private String dateOfBirth;

    public Personh12(String name, int age) {

       this(name,age, Genderh8.UNKNOWN);
    }

    public Personh12(String name, int age, Genderh8 gender){
        this(name, age, gender, "01-01-1970");
    }

    public Personh12(String name, int age, Genderh8 gender, String dateOfBirth) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genderh8 getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setGender(Genderh8 gender) {
        this.gender = gender;
    }

    @Override
    @MyAnnotation
    public String toString() {
        return "Personh8{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personh12)) return false;
        Personh12 personh8 = (Personh12) o;
        return age == personh8.age && Objects.equals(name, personh8.name) && gender == personh8.gender;
    }

    @Override
    @MyAnnotation2
    public int hashCode() {
        return Objects.hash(age, name, gender);
    }
//public void haveBirthday(){
    //this.age = this.age + 100;
    //if (this.age > 130) throw new AgeException();

    @Override
    public void finalize(){
        System.out.println("Finalize werkt");

    }


    String greet() {
        return "Hello, my name is <name>. Nice to meet you!";
    }
}



