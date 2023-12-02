import java.util.Scanner;

public class ReadFromUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userData = scan.next();

        System.out.println("User data: " + userData);
    }
}
