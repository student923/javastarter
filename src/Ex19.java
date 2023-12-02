import java.util.Random;

public class Ex19 {
    public static void main(String[] args) {
        Random r = new Random();
        int randomnum1 = r.nextInt(1, 22);
        int randomnum2 = r.nextInt(1, 22);


        while (randomnum1 == randomnum2){
            randomnum2 = r.nextInt(1, 22);
        }
    }
}
