import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex55gyak {
    public static void main(String[] args) {
        Map<String, Integer> bev = new HashMap<>();

        Scanner s = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        Scanner e = new Scanner(System.in);

        String exit = "";
        int sum = 0;

        while (!exit.equals("n")){
            System.out.println("Mit akarsz vásárolni?");
            String cucc = s.nextLine();
            System.out.println("Mennyit akarsz vásárolni?");
            int db = d.nextInt();
            if(bev.containsKey(cucc)){
                System.out.println("Ez az elem már volt, darabszáma frissült!");
            }
            bev.put(cucc, db);
            sum = sum + db;


            System.out.println("Akarja folytatni a bevásásrlást?");
            exit = e.nextLine();
        }

        System.out.println(bev);
        System.out.println(sum);
    }
}
