import java.util.Random;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        System.out.println("ROCK/SCISSORS/PAPER");
        Scanner s = new Scanner(System.in);
        String userData = s.next();
        //System.out.println(userData);
        userData = userData.toUpperCase();
        System.out.println("Felhasználó választása: " + userData);

        if (userData.equals("ROCK") || userData.equals("SCISSORS") || userData.equals("PAPER")) {
            System.out.println("Great, goood luck");
        } else {
            System.out.println("Not a valid option");
        }

        Random randi = new Random();
        int num = randi.nextInt(1, 4);
        String comChose = "";

        System.out.println(num);

/*
        if(num == 1){
            comChose = "ROCK";
        } else if (num == 2) {
            comChose = "SCISSORS";
        }else {
            comChose = "PAPER";
        }
*/
        switch (num) {
            case 1:
                comChose = "ROCK";
                break;
            case 2:
                comChose = "SCISSORS";
                break;
            case 3:
                comChose = "PAPER";
                break;
        }

        System.out.println("Computer választása: " + comChose);

        if (userData.equals("ROCK") && comChose.equals("SCISSORS")) {
            System.out.println("Felhaználó Nyert!");
        } else if (userData.equals("PAPER") && comChose.equals("ROCK")) {
            System.out.println("Felhaználó Nyert!");
        } else if (userData.equals("SCISSORS") && comChose.equals("PAPER")) {
            System.out.println("Felhaználó Nyert!");

        } else if (userData.equals(comChose)) {
            System.out.println("döntetlen!");

        } else {
            System.out.println("computer Nyert!");
        }


    }
}
