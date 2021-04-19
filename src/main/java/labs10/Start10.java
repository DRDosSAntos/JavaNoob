package labs10;

import labs8.Genderh8;

public class Start10 {
    public static void main(String[] args) {
        Personh10 jan = new Personh10("Jan",20, Genderh8.MALE);
        //Personh10 android = new Personh10("Android", 5);
        //Personh10 employee = new Personh10("Employee",30, Genderh8.FEMALE);

        Android android = new Android();
        Employee employee = new Employee("Employee", 25);
        Teacher teacher = new Teacher("Teacher", 55, Genderh8.FEMALE);

        Android androidCharge = new Android();
        System.out.println(androidCharge.charge(1));


//        System.out.println(jan.greet());
//        //System.out.println(android.greet());
//        System.out.println(employee.greet());
//        System.out.println(teacher.greet());

    }
}
