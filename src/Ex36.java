import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Hány árat akarsz?");
        int db = s.nextInt();


        int[] eggs = new int[db];


        int j = 0;

        while ( j < db){
            System.out.println("Árat adj!");
            int ar = s.nextInt();
            eggs[j] = ar;
            j++;
        }

        double sum = 0;



        for(int i = 0; i < eggs.length; i++){
            sum = sum + eggs[i];
        }

        System.out.println(sum/ eggs.length);


    }
}
