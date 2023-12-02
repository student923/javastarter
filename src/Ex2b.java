import java.util.Scanner;

public class Ex2b {
    public static void main(String[] args) {

        System.out.println("Give A");
        Scanner scan = new Scanner(System.in);
        String userDataA = scan.next();

        System.out.println("Give B");
        scan = new Scanner(System.in);
        String userDataB = scan.next();



        int a = Integer.parseInt(userDataA);
        int b = Integer.parseInt(userDataB);

        System.out.println(a%b);

    }
}
