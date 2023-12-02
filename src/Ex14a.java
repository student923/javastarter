import java.util.Random;

public class Ex14a {
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

        System.out.println("Az ötös Lottó számai: " + num1 + " " + num2 + " " + num3+ " " + num4+ " " + num5);

//-------------------------------------------------------------------------------------------------------------------

        int hat1 = randi.nextInt(45) + 1;

        int hat2 = randi.nextInt(45) + 1;
        while (hat2 == hat1){
            hat2 = randi.nextInt(45) + 1;
        }


        int hat3 = randi.nextInt(45) + 1;
        while (hat3 == hat1 || hat3 == hat2){
            hat3 = randi.nextInt(45) + 1;
        }

        int hat4 = randi.nextInt(45) + 1;
        while (hat4 == hat1 || hat4 == hat2 || hat4 == hat3){
            hat4 = randi.nextInt(45) + 1;
        }

        int hat5 = randi.nextInt(45) + 1;
        while (hat5 == hat1 || hat5 == hat2 || hat5 == hat3 || hat5 == hat4){
            hat5 = randi.nextInt(45) + 1;
        }

        int hat6 = randi.nextInt(45) + 1;
        while (hat6 == hat1 || hat6 == hat2 || hat6 == hat3 || hat6 == hat4 || hat6 == hat5) {
            hat6 = randi.nextInt(45) + 1;
        }

        System.out.println("Az hatos Lottó számai: " + hat1 + " " + hat2 + " " + hat3+ " " + hat4+ " " + hat5 + " " + hat6);

        //------------------------------------------------------------------------------------------------------

        int s1 = randi.nextInt(35) + 1;

        int s2 = randi.nextInt(35) + 1;
        while (s2 == s1){
            s2 = randi.nextInt(35) + 1;
        }


        int s3 = randi.nextInt(35) + 1;
        while (s3 == s1 || s3 == s2){
            s3 = randi.nextInt(35) + 1;
        }

        int s4 = randi.nextInt(35) + 1;
        while (s4 == s1 || s4 == s2 || s4 == s3){
            s4 = randi.nextInt(35) + 1;
        }

        int s5 = randi.nextInt(35) + 1;
        while (s5 == s1 || s5 == s2 || s5 == s3 || s5 == s4){
            s5 = randi.nextInt(35) + 1;
        }

        int s6 = randi.nextInt(35) + 1;
        while (s6 == s1 || s6 == s2 || s6 == s3 || s6 == s4 || s6 == s5) {
            s6 = randi.nextInt(35) + 1;
        }

        int s7 = randi.nextInt(35) + 1;
        while (s7 == s1 || s7 == s2 || s7 == s3 || s7 == s4 || s7 == s5 || s7 == s6) {
            s7 = randi.nextInt(35) + 1;
        }

        System.out.println("Az skandináv Lottó számai: " + s1 + " " + s2 + " " + s3+ " " + s4+ " " + s5 + " " + s6 + " " + s7);
    }
}

