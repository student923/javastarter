import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Ex56 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);

        Map<String, Integer> bills = new ConcurrentHashMap<>();
        int sum = 0;

        while (bills.size() < 3) {
            System.out.println("Milyen számla?");
            String nev = s.nextLine();
            System.out.println("Mennyi az adott számla díja?");
            int dij = n.nextInt();
            sum = sum + dij;
            bills.put(nev, dij);
        }

        for (Map.Entry mapElement : bills.entrySet()) {
            if (bills.containsValue(0))  {
                bills.remove(mapElement.getKey());
            }
        }




        //if(mapElement.containsValue(0))  bills.remove(mapElement.getKey());

        System.out.println(bills);
        System.out.println(sum);


        System.out.println("----------------------------TÖRLÉS------------------------------");

/*
        bills.entrySet()
                .removeIf(
                        entry -> (entry.getValue().equals(0)));
*/

        System.out.println("----------------------------TÖRLÉS------------------------------");


        System.out.println(bills);
        System.out.println(sum);
    }
}
