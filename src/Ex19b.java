import java.util.Random;

public class Ex19b {
    public static void main(String[] args) {

        Random r = new Random();
        int randomnum1;
        int randomnum2;


        do {
             randomnum1 = r.nextInt(1, 22);
             randomnum2 = r.nextInt(1, 22);
        }while (randomnum1 == randomnum2);
    }
}
