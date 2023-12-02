import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {

        List<String> favMovie = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Írj egy filmet!");
            favMovie.add(s.nextLine());
        }

        for (String movie : favMovie) {
            System.out.println(movie);
        }

    }
}
