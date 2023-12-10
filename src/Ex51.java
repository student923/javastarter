import java.util.*;
import java.util.Set;

public class Ex51 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String summer = "";

        Set<String> sumprog = new HashSet<>();

        while (!summer.equals("x")){
            System.out.println("Nyári programod?");
            summer = s.next();
            sumprog.add(summer);
            if(summer.equals("x")){
                sumprog.remove(summer);
            }
        }
        System.out.println(sumprog);
    }
}
