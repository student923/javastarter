import java.util.ArrayList;
import java.util.List;

public class Ex69 {
    public static void main(String[] args) {

        List<String> favFruits = getFruitList();
        printFruitListWithFor(favFruits);
        printFruitListWithForeach(favFruits);


    }

    public static List<String> getFruitList() {
        List<String> favFruits = new ArrayList<>();
        favFruits.add("Apple");
        favFruits.add("Banana");
        favFruits.add("Melon");
        favFruits.add("Mango");
        favFruits.add("Orange");

        return favFruits;
    }

    public static void printFruitListWithFor(List<String> favfruits) {

        for (int i = 0; i < favfruits.size(); i++) {
            System.out.println(favfruits.get(i));
        }
    }

    public static void printFruitListWithForeach(List<String> favfruits) {

        for (String fruit : favfruits) {
            System.out.println("foreach " + fruit);
        }
    }


}
