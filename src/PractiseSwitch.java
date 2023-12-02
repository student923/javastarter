import java.util.Scanner;

public class PractiseSwitch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("stored data: " + name);

        switch (name) {
            case "Pista":
                System.out.println("Yes, he is!");
                break;
            default:
                System.out.println("No, he isn't");
        }
    }
}

