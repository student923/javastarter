import java.util.Random;

public class Ex31 {
    public static void main(String[] args) {
        Random r = new Random();

        int num1 = r.nextInt(1, 90);
        int num2 = r.nextInt(1, 90);
        int num3 = r.nextInt(1, 90);
        int num4 = r.nextInt(1, 90);
        int num5 = r.nextInt(1, 90);

        int[] randomArray = new int[5];

        randomArray[0] = num1;
        randomArray[1] = num2;
        randomArray[2] = num3;
        randomArray[3] = num4;
        randomArray[4] = num5;


        for (int i = 0; i < randomArray.length; i++){
            System.out.println(randomArray[i]);
        }


    }
}
