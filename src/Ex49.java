import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex49 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Set<String> movie = new HashSet<>();

        for (int i = 0; i< 5; i++){
            movie.add(s.next());
        }

        for(String film:movie){
            System.out.println(film);
        }
    }
}
