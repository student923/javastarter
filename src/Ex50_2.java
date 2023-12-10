import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex50_2 {
    public static void main(String[] args) {


        Set<String> guests = new HashSet<>();


        int con = 0;


        while (guests.size() < args.length) {

            guests.add(args[con].toUpperCase());
            con++;
        }

        System.out.println(guests);
    }
}


