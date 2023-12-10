import java.util.Random;
import java.util.Scanner;

public class Ex65 {
    public static void main(String[] args) {

        String userHand = getUserHand();
        String computerHand = getComputerHand();
        String winner = decideHowWin(getUserHand(), getComputerHand());
        printWhoWin(computerHand, userHand);

    }

    public static String getUserHand() {
        System.out.println("ROCK/SCISSORS/PAPER??");
        Scanner s = new Scanner(System.in);
        String userHand = s.next();
        //System.out.println(userHand);
        userHand = userHand.toUpperCase();
        System.out.println("Felhasználó választása: " + userHand);

        return userHand;
    }

    public static String getComputerHand() {

        Random randi = new Random();
        int num = randi.nextInt(1, 4);
        String computerHand = "";

        System.out.println(num);

        switch (num) {
            case 1:
                computerHand = "ROCK";
                break;
            case 2:
                computerHand = "SCISSORS";
                break;
            case 3:
                computerHand = "PAPER";
                break;
        }

        System.out.println("Computer választása: " + computerHand);
        return computerHand;
    }

    public static String decideHowWin(String computerHand, String userHand) {

        String winner = "";

        if (userHand.equals("ROCK") && computerHand.equals("SCISSORS")) {
            System.out.println("Felhaználó Nyert!");
            winner = "user";
        } else if (userHand.equals("PAPER") && computerHand.equals("ROCK")) {
            System.out.println("Felhaználó Nyert!");
            winner = "user";
        } else if (userHand.equals("SCISSORS") && computerHand.equals("PAPER")) {
            System.out.println("Felhaználó Nyert!");
            winner = "user";

        } else if (userHand.equals(computerHand)) {
            System.out.println("döntetlen!");
            winner = "dönttelen";

        } else {
            System.out.println("computer Nyert!");
            winner = "computer";
        }


        return winner;
    }

    public static void printWhoWin(String computerHand, String userHand) {
        System.out.println(decideHowWin(computerHand, userHand));

    }

}
