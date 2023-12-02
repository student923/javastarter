import java.util.Random;
import java.util.Scanner;

public class Ex15gyak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Első játékos neve: ");
        String player1 = s.nextLine();

        System.out.println("Második játékos neve: ");
        String player2 = s.nextLine();

        int i = 1;

        int sum1 = 0;
        int sum2 = 0;

        while (i <= 4){

            Random r = new Random();

            int firstP = r.nextInt(1,6);
            int secondP = r.nextInt(1,6);

            if(i == 4){
                System.out.println("uccsó kör " + firstP + " " + secondP);
                sum1 = sum1 + firstP + firstP;
                sum2 = sum2 + secondP + secondP;
                i++;
            }else {
                System.out.println(firstP + " " + secondP);
                sum1 = sum1 + firstP;
                sum2 = sum2 + secondP;
                i++;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);

        if(sum1 > sum2){
            System.out.println(player1 + " nyert");
        }else {
            System.out.println(player2 + " nyert");
        }
    }
}
