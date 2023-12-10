import java.util.HashMap;
import java.util.Map;

public class Ex53 {
    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();

        fruits.put("Peach", 2);
        fruits.put("Melon", 2);
        fruits.put("Strawbery", 2);
        fruits.put("Apple", 2);
        fruits.put("Kiwi", 2);
        fruits.put("Babana", 2);
        fruits.put("Pineapple", 2);

        System.out.println(fruits);
        System.out.println(fruits.size());

        double sum = 0;

        for (Map.Entry mapElement:fruits.entrySet()){
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
            sum+= Double.parseDouble(mapElement.getValue() + "");

        }
        System.out.println(sum);
        System.out.println(sum/fruits.size());
    }
}
