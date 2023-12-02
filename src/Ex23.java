import java.util.Random;

public class Ex23 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(4);

        switch (num){
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
            case 3:
                System.out.println("D");
                break;
        }
    }
}
