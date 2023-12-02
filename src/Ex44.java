import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String summer = "";

        List<String> sumprog = new ArrayList<>();


        while (!summer.equals("x")){
            System.out.println("Írj egy nyári progit!");
            summer = s.next();
            if(!summer.equals("x") && !sumprog.contains(summer)){
                sumprog.add(summer);
            } else if (sumprog.contains(summer)) {
                System.out.println("Ilyen már van, törlöm!");
                sumprog.remove(summer);
                if(sumprog.isEmpty()){
                    System.out.println("üres");
                    break;
                }
            }

        }

        System.out.println(sumprog);
    }
}
