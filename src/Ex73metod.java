import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex73metod {
    public static void main(String[] args) {

        Map<String, String> bevlista = getListFromUser();
       int sum =  calculateSum(bevlista);
        printOutResult(bevlista, sum);


    }


    public static Map<String, String> getListFromUser() {
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
        return bevlista;

    }
    public static int calculateSum(Map<String, String> bevlista){
        int sum = 0;
        for(Map.Entry mapElement: bevlista.entrySet()){
            sum = sum + Integer.parseInt(mapElement.getValue() + "");
        }
        return sum;
    }

    public static void printOutResult(Map<String, String> bevlista, int sum) {
        System.out.println(bevlista);
        System.out.println("darabszám: " + sum);
        System.out.println("termékszám: " + bevlista.size());
    }
}


