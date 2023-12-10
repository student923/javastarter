import java.util.Scanner;

public class Ex62 {
    public static void main(String[] args) {
        System.out.println(getValidConsole());
        System.out.println(getValidConsole());
        System.out.println(getValidConsole());
    }

    public static int getValidConsole() {
        Scanner s = new Scanner(System.in);
        int ageFromUser = s.nextInt();

        if (ageFromUser > -1 && ageFromUser < 141) {
            return ageFromUser;
        } else {
            return -1;
        }

    }
}
