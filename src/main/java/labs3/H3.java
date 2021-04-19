package labs3;

public class H3 {
    public static void main(String[] args) {

        int age = 10;
        age = age + 2;
        age += 1;

        int incrementedAge = age++;
        int incrementedage2 = ++age;

        System.out.println("age is: " + age);
        System.out.println("using age++ results in: " + incrementedAge + " being the value that is stored in the variable");
        System.out.println("using ++age results in: " + incrementedage2 + " being the value that is stored in the variable");

        int i = 3;
        int j = i < 3 ? i++ + ++i : ++i >>> 1;
        System.out.println("\n" + "the value of j is: " + j);

        int binLit1 = 0b1010;
        int binLit2 = 0b100;
        int sumOfBinLits = binLit1 + binLit2;
        System.out.println("\n" + "The sum of adding binlit1 and binlit2 is: " + sumOfBinLits);


    }
}


