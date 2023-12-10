import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Ex57 {
    public static void main(String[] args) {
        List<String> bookList = Arrays.asList("a", "b", "c", "d", "a", "b");

        Map<String, Integer> booksMap = new ConcurrentHashMap<>();

        System.out.println(bookList);

        for (String book1 : bookList) {
            if (booksMap.containsKey(book1)) {
                int originValue = booksMap.get(book1);
                booksMap.put(book1, originValue + 1);
            } else {
                booksMap.put(book1, 1);
            }

        }

        System.out.println(booksMap);
        Integer sum = 0;
        for (Map.Entry mapElement : booksMap.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue() + " darab");
            sum = sum + Integer.parseInt(mapElement.getValue() + "");
        }

        System.out.println(sum);


        for (Map.Entry mapElement : booksMap.entrySet()) {
           if(Integer.parseInt(mapElement.getValue() + "") == 1){
               booksMap.remove(mapElement.getKey());
           }
        }

        System.out.println(booksMap);
    }
}
