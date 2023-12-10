import java.util.HashMap;
import java.util.Map;

public class Ex53gyak {
    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();

        fruits.put("apple", 4);
        fruits.put("orange", 2);
        fruits.put("pinapple", 1);
        fruits.put("banana", 5);
        fruits.put("strowberry", 3);
        fruits.put("cherry", 3);
        fruits.put("cocus", 4);

        for(Map.Entry mapElement:fruits.entrySet()){
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());

        }
        double sum = 0;
        for(Map.Entry mapElement:fruits.entrySet()){
            sum = sum + Double.parseDouble( mapElement.getValue() + ""     );
        }

        System.out.println(sum/fruits.size());
    }
}
