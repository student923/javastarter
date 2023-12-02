import java.util.Scanner;

public class Ex20b {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        do {
            num = s.nextInt();
        } while (num <= 0);

        System.out.println("Greít! " + num + " is a positiv number");
    }

}

