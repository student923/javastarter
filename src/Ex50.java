import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex50 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Set<String> guests = new HashSet<>();

        System.out.println("Mennyit akarsz??");
        int db = s.nextInt();

        while (guests.size() < db) {
            System.out.println("Adj egy nevet!");
            guests.add(s.next().toUpperCase());
        }

        System.out.println(guests);
    }
}
