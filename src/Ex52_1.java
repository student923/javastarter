import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Ex52_1 {
    public static void main(String[] args) {
        Random r = new Random();

        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < 3){
            numbers.add(r.nextInt(0, 11));
        }

        System.out.println(numbers);

        Scanner s = new Scanner(System.in);
        int round = 3;
        int ossz  = 0;




        while (numbers.size() > 0){
            System.out.println("Tippelj egy számra!");
            int input = s.nextInt();

            if(numbers.contains(input)){
                round--;
                System.out.println("Talált. " + round + " kör van még hátra");
            }
            numbers.remove(input);
            ossz++;
        }

        System.out.println("Ennyi kört tippeltél összesen:" + ossz);

    }
}
