import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Ex50_1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);

        Set<String> guest = new HashSet<>();

        System.out.println("Hány vendéget akarsz?");
        int num = n.nextInt();

        while (guest.size() < num){
            System.out.println("Vendég neve?");
            guest.add(s.nextLine());
        }

        System.out.println(guest);
    }
}
