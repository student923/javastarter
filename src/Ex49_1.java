import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex49_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Kedvec filmed?");

        Set<String> movie = new HashSet<>();

        for(int i =0; i < 5; i++){
            movie.add(s.nextLine());
        }

        for( String filmek:movie){
            System.out.println(filmek);
        }
    }
}
