import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);

        int size = n.nextInt();


        Map<String, String> phoneBook = new HashMap<>();

        do{
            String name = s.nextLine();
            String number = s.nextLine();
            phoneBook.put(name, number);
        }while (phoneBook.size()< size);


    }
}
