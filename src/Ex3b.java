import java.util.Scanner;

public class Ex3b {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userDataA = scan.next();

         scan = new Scanner(System.in);
        String userDataB = scan.next();

        int a = Integer.parseInt(userDataA);
        int b = Integer.parseInt(userDataB);

        System.out.println("User data: " + 3*a*b);

    }
}
