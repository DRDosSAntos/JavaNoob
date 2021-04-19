package labs9;

import labs7.Person;

public class Finalize {
    public static void main(String[] args) {
        // instance aanmaken
        Personh9 piet = new Personh9("piet", 30);
        // object op null zetten (beschikbaar maken voor garbage collector)
        piet = null;

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.gc();


    }
}
