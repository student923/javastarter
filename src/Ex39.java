import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {

        List<String> favMovie = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Írj egy filmet!");
            String movie = s.nextLine();
            if (favMovie.contains(movie)) {
                System.out.println("Már ilyen van!!");
                i--;

            } else {
                favMovie.add(movie);
            }


        }

        for (String movie : favMovie) {
            System.out.println(movie);
        }

    }
}
