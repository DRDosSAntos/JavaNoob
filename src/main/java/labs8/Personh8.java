package labs8;

import java.util.Objects;

public class Personh8 {

    private int age;
    private String name;
    private Genderh8 gender;

    public Personh8(String name, int age, Genderh8 gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public void setGender(Genderh8 gender) {
        this.gender = gender;
    }

    @Override
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
        if (!(o instanceof Personh8)) return false;
        Personh8 personh8 = (Personh8) o;
        return age == personh8.age && Objects.equals(name, personh8.name) && gender == personh8.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, gender);
    }
//public void haveBirthday(){
        //this.age = this.age + 100;
        //if (this.age > 130) throw new AgeException();
}



