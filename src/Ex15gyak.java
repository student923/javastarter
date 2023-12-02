import java.util.Random;
import java.util.Scanner;

public class Ex15gyak {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Első játékos neve:");
        String player1 = scan.nextLine();

        System.out.println("Második  játékos neve:");
        String player2 = scan.nextLine();

        int i = 1;
        Random r = new Random();
        //int dobas = r.nextInt(6)+1;

        int sum1= 0;
        int sum2= 0;

        while (i <= 8 ){
            if( i % 2 == 0 && i != 8){
                int dobas = r.nextInt(6)+1;
                System.out.println(i + "-dik " + dobas);
                sum1 = sum1 + dobas;
                i++;
            }else if(i == 8 ) {
                int dobas = r.nextInt(6)+1;
                System.out.println(i + "-dik " + dobas);
                sum1 = sum1 + dobas + dobas;
                i++;
            } else if (i % 2 == 1 && i != 7) {
                int dobas2 = r.nextInt(6)+1;
                System.out.println(i + "-dik " + dobas2);
                sum2 = sum2 + dobas2;
                i++;
            }else if(i == 7 ) {
                int dobas2 = r.nextInt(6)+1;
                System.out.println(i + "-dik " + dobas2);
                sum2 = sum2 + dobas2 + dobas2;
                i++;

            }
        }

        System.out.println("első " + sum1);
        System.out.println("második " + sum2);

        if (sum1 > sum2){
            System.out.println( player1 + " gyerek nyert");
        }else {
            System.out.println(player2 + " gyerek nyert");
        }
    }
}
