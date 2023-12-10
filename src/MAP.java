
import java.util.HashMap;
import java.util.Map;

public class MAP {
    public static void main(String[] args) {
        Map<String, String> randomNames = new HashMap<>();

        System.out.println(randomNames.isEmpty());
        randomNames.put("456EJR", "Zsolt B.");
        randomNames.put("457EJR", "Zsolt Sz.");
        System.out.println(randomNames.isEmpty());
        System.out.println(randomNames.size());
        System.out.println(randomNames.get("457EJR"));
        System.out.println(randomNames.containsKey("457EJR"));
        System.out.println(randomNames.containsValue("Zsolt B."));
        System.out.println(randomNames.remove("457EJR"));
        System.out.println(randomNames.get("457EJR"));



        Map<String, Integer> randomAges = new HashMap<>();
        randomAges.put("457EJR", 17);
        randomAges.put("455EJR", 37);
        randomAges.put("485EJR", 67);
        System.out.println(randomAges);

        System.out.println("----------------------------------------------");
        for (Map.Entry mapElement : randomAges.entrySet()){
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
        }



    }
}
