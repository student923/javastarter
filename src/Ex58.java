import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Ex58 {
    public static void main(String[] args) {

        List<String> karibuliList = Arrays.asList("Salt", "Platán", "42", "Essencia", "Babel", "Borkonyha", "Costes", "42", "Borkonyha", "Rumour",
                "Platán", "Babel", "Stand", "Rumour", "Salt", "Platán", "42", "Rumour", "Rumour", "Borkonyha",
                "Rumour", "Borkonyha", "Babel", "Essencia", "Salt", "Platán", "Borkonyha", "42", "Babel",
                "Essencia", "42", "Stand", "Salt", "Costes", "42", "42", "Costes", "Stand", "Borkonyha", "Stand",
                "Costes", "Babel", "Essencia", "Stand", "Salt", "Platán", "Costes", "Salt", "Platán", "Salt",
                "Platán", "Essencia", "Rumour", "Salt", "Platán", "Rumour", "Stand", "Salt", "Essencia", "Babel",
                "Babel", "Essencia", "Rumour", "Essencia", "Salt", "Platán", "Borkonyha", "Stand", "Essencia",
                "Rumour", "Borkonyha", "Costes", "Babel", "Costes", "Salt", "Platán", "Essencia", "Stand",
                "Costes", "Borkonyha", "Essencia", "42", "Essencia", "42", "Stand", "Rumour", "Salt", "Platán",
                "Rumour", "Borkonyha", "Stand", "Babel", "Rumour", "Stand", "Salt", "Essencia", "Costes",
                "Costes", "42", "42", "Salt", "Platán", "Essencia", "Babel", "Costes", "Rumour", "Costes",
                "Stand", "Rumour", "Essencia", "Borkonyha", "Salt", "Platán", "Rumour", "Borkonyha", "42",
                "Babel", "Stand", "42", "Costes", "42", "Salt", "42", "Salt", "Essencia", "Borkonyha", "Essencia",
                "Borkonyha", "Rumour");

        Map<String, Integer> kraibuliMap = new ConcurrentHashMap<>();

        for (String karibuli : karibuliList) {
            if (kraibuliMap.containsKey(karibuli)) {
                int db = kraibuliMap.get(karibuli);
                kraibuliMap.put(karibuli, db + 1);
            } else {
                kraibuliMap.put(karibuli, 1);
            }
        }

        Integer sum = 0;
        for (Map.Entry mapElement : kraibuliMap.entrySet()) {
            sum = sum + Integer.parseInt((mapElement.getValue()) + "");
            System.out.println(mapElement.getValue());
        }

        System.out.println(kraibuliMap);
        System.out.println("Éttermek száma: " + kraibuliMap.size());
        System.out.println("Összes szavazat " + sum);


        kraibuliMap.remove("Essencia");

        System.out.println("rövidített ista: " + kraibuliMap);


        kraibuliMap.put("Stand", Integer.parseInt(kraibuliMap.get("Stand") + "") + 11);

        System.out.println("Növelt Stand szavazat " + kraibuliMap);


        int max = kraibuliMap.get("Salt");
        String maxie = "";

        for (Map.Entry mapElement : kraibuliMap.entrySet()) {
            if (Integer.parseInt((mapElement.getValue()) + "") > max) {
                max = Integer.parseInt((mapElement.getValue()) + "");
                maxie = (mapElement.getKey() + "");
            }
            //System.out.println(mapElement.getValue());
        }
        System.out.println("legtöbb szavazat: " + max);
        System.out.println("nyertes: " + maxie);


    }
}
