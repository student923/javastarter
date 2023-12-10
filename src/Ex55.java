import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        Scanner n = new Scanner(System.in);

        Map<String, Integer> bevesarlo = new HashMap<>();
        while (bevesarlo.size() < 3) {
            System.out.println("Mit akarsz venni?");
            String item = s.nextLine();
            if(!bevesarlo.containsKey(item)){
                System.out.println("Mennyit akarsz ebből venni?");
                int db = n.nextInt();
                bevesarlo.put(item, db);
            }else {
                System.out.println("Ilyen már van! Frissítsd a mennyiséget!");
                int db = n.nextInt();
                bevesarlo.put(item, db);
            }
        }

        String folyt = "";

        System.out.println("Szeretné folytani a bevásárlást?");
        folyt = s2.nextLine();

        while (!folyt.equals("n")) {
            System.out.println("Mit akarsz venni?");
            String item = s.nextLine();
            if(!bevesarlo.containsKey(item)){
                System.out.println("Mennyit akarsz ebből venni?");
                int db = n.nextInt();
                bevesarlo.put(item, db);
            }else {
                System.out.println("Ilyen már van! Frissítsd a mennyiséget!");
                int db = n.nextInt();
                bevesarlo.put(item, db);
            }
            System.out.println("Szeretné folytani a bevásárlást?");
            folyt = s2.nextLine();

        }


        System.out.println(bevesarlo);
    }
}
