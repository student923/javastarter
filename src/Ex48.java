
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex48 {
    public static void main(String[] args) {



        Set<String> frut = new HashSet<>();



        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            String f = s.next();
            frut.add(f);
        }

        System.out.println(frut);
    }
}
