import java.util.ArrayList;
import java.util.List;

public class Listek {
    public static void main(String[] args) {

        List<String> randomNames = new ArrayList<>();
        List<String> randomNums = new ArrayList<>();


        System.out.println(randomNames.isEmpty());
        System.out.println(randomNames.size());
        randomNames.add("Tomi");
        System.out.println(randomNames.isEmpty());
        System.out.println(randomNames.size());


    }
}
