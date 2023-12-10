import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex73 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Map<String, String> bevlista = new HashMap<>();

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Mit veszel és mennyit?");
            String bev = s.nextLine();
            String[] tomb = bev.split("-");
            bevlista.put(tomb[0], tomb[1]);
            sum = sum + Integer.parseInt(tomb[1]);
        }
        System.out.println(bevlista);
        System.out.println("darabszám: " + sum);
        System.out.println("termékszám: " + bevlista.size());

    }
}
