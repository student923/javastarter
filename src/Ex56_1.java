import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Ex56_1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Scanner d = new Scanner(System.in);

        Map<String, String> bills = new ConcurrentHashMap<>();

        int sum = 0;

        do{
            System.out.println("Számla?");
            String szamla = s.nextLine();
            System.out.println("Összege?");
            String ar = d.nextLine();
            bills.put(szamla, ar);
            sum = sum + Integer.parseInt(bills.get(szamla) + "");
        }while (bills.size()< 3);

        System.out.println(bills);
        System.out.println(sum);


        for(Map.Entry mapElement: bills.entrySet()){
                System.out.println(mapElement.getValue().equals("0"));
                if(mapElement.getValue().equals("0")){
                    bills.remove(mapElement.getKey());
                }
            }


        System.out.println(bills);


    }
}
