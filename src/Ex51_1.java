import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Ex51_1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        Set<String> summer = new HashSet<>();

       String nyr = "";

        while (!nyr.equals("x")){
            System.out.println("Nyári tennivaló?");
            nyr = s.nextLine();
            if(summer.contains(nyr)){
                System.out.println("Ilyen már van!!");
            }

            if(!nyr.equals("x")){
                summer.add(nyr);
            }


        }

        System.out.println(summer);
    }
}

