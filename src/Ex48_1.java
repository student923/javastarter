import java.util.HashSet;
import java.util.Set;


public class Ex48_1 {
    public static void main(String[] args) {
         Set<String> fruit = new HashSet<>();

         fruit.add("Alma");
         fruit.add("Körte");
         fruit.add("Dinnye");
         fruit.add("Eper");
         fruit.add("Banán");


         for(String it:fruit){
             System.out.println(it);
         }

    }

}
