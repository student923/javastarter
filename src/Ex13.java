import java.util.Random;

public class Ex13 {
    public static void main(String[] args) {

        Random randi = new Random();
        int num1 = randi.nextInt(90) + 1;

        int num2 = randi.nextInt(90) + 1;
        while (num2 == num1){
             num2 = randi.nextInt(90) + 1;
        }


        int num3 = randi.nextInt(90) + 1;
        while (num3 == num1 || num3 == num2){
             num3 = randi.nextInt(90) + 1;
        }

        int num4 = randi.nextInt(90) + 1;
        while (num4 == num1 || num4 == num2 || num4 == num3){
            num4 = randi.nextInt(90) + 1;
        }

        int num5 = randi.nextInt(90) + 1;
        while (num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4){
            num5 = randi.nextInt(90) + 1;
        }

        System.out.println("Az öt szám: " + num1 + " " + num2 + " " + num3+ " " + num4+ " " + num5);
    }
}
