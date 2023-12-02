import java.util.Random;
import java.util.Scanner;

public class PractiseRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        System.out.println(randomNumber);

        if (randomNumber == 0) {
            System.out.println("A dobott érték: Fej");
        } else {
            System.out.println("A dobott érték: Írás");
        }

        System.out.println("Tippeljen! Fej vagy írás?");

        Scanner scan = new Scanner(System.in);
        String tip = scan.next();

        int num = 0;

        if (tip.equals("Fej")) {
            num = 0;
        } else {
            num = 1;
        }


        if (randomNumber == num) {
            System.out.println("Gratula! Talált!");
        } else {
            System.out.println("Elbasztad!");
        }

    }
}
