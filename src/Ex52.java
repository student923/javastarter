import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Ex52 {
    public static void main(String[] args) {
        Random r = new Random();
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < 3) {
            numbers.add(r.nextInt(11));
        }

        //System.out.println(numbers);

        Scanner s = new Scanner(System.in);

        int kor = 0;
        int talal = 3;

        while (numbers.size() != 0) {
            System.out.println("Adj számot 0 és 10 között");
            int input = s.nextInt();

            //System.out.println("Számom" + input);

            if (numbers.contains(input)) {
                talal--;
                if(talal != 0){
                    System.out.println("Talált. Még ennyi van hátra: " + talal);
                }

            }

            numbers.remove(input);


            //System.out.println(numbers);
            kor++;
        }
        System.out.println("Ennyi kellett: " + kor);
    }
}
