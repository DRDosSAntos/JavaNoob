package Udemy;

import java.util.Scanner;

public class Methods {

    private int position;
    private String playerName;
    private int playerScore;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String leaderboardPart1() {

        System.out.println("Please enter your name");
        Scanner input = new Scanner(System.in);
        String playerName = input.nextLine();
        return playerName;

    }

    public int leaderboardPart2() {

        System.out.println("Please enter your score");
        Scanner input2 = new Scanner(System.in);
        int playerScore = input2.nextInt();
        input2.close();
        return playerScore;

    }

    public String calculate(int playerScore) {

        if (playerScore > 1000) {
            return "1st place"; //position = 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return "2nd place";//position = 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return "3rd place";//position = 3;
        } else {
            return "4th place";//position = 4;
        }
    }
}



