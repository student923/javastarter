import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class Ex43 {
    public static void main(String[] args) {

        List<String> bevesarlas = new ArrayList<>();
        int count = 0;

        Scanner s = new Scanner(System.in);

        String cucc = "";

        while (!cucc.toUpperCase().equals("X")) {
            System.out.println("Adj hozzá a bevásárló listához!");
            cucc = s.next();
            if (!bevesarlas.contains(cucc) && !cucc.equals("x")) {
                bevesarlas.add(cucc);
                count++;
            } else if(!cucc.equals("x")){
                System.out.println("Ilyen már van! Adj másikat hozzá!");
            }

        }
        System.out.println(bevesarlas);

        System.out.println("Adj egy elemet amit kötöröljek a listából!");

        String delete = s.next();

        bevesarlas.remove(delete);

        System.out.println(bevesarlas);
    }
}
