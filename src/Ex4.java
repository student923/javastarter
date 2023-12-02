import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        System.out.println("Tippeljen! Fej vagy írás?");
        Scanner scan = new Scanner(System.in);
        String userData = scan.next();
        int userChose = Integer.parseInt(userData);
        if(userChose == 0 || userChose == 1){
            System.out.println("Imput saved");
        }else {
            System.out.println("Return");
        }

        Random random = new Random();
        int compCoin = random.nextInt(2);

        System.out.println(userData + " " + compCoin);

        if(userChose == compCoin){
            System.out.println("Congrat!");
        }else {
            System.out.println("no luck!");
        }
    }
}
