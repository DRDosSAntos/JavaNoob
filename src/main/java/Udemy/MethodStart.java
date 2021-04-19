package Udemy;

public class MethodStart {

    public static void main(String[] args) {

        String lb1 = new Methods().leaderboardPart1();
        int lb2 = new Methods().leaderboardPart2();
        String calc = new Methods().calculate(lb2);

        System.out.println(lb1 + " managed to get " + calc + " on the leaderboards!");
    }
}
