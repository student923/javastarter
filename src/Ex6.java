import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(4);

        if (num == 0) {
            System.out.println("A");
        } else if (num == 1) {
            System.out.println("B");
        } else if (num == 2) {
            System.out.println("C");
        } else if (num == 3) {
            System.out.println("D");
        }
    }
}