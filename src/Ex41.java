import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        List<Integer> bills = new ArrayList<>();

        System.out.println("Villanyszámla:");
        bills.add(s.nextInt());

        System.out.println("Gáz:");
        bills.add(s.nextInt());

        System.out.println("Víz:");
        bills.add(s.nextInt());

        int sum = 0;

        for(Integer bill:bills){
            sum = sum + bill;
        }

        System.out.println("A számlák összege: " + sum);

        System.out.println(bills);
    }
}
