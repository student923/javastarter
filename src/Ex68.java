import java.util.Scanner;

public class Ex68 {
    public static void main(String[] args) {
        int db = getNumberOfEggs();
        int[] egges = getFillEggsArrayWithPrices(db);
        int sum = calculateSum(egges);
        printCalculatedAverge(sum, db);

    }

    public static int getNumberOfEggs() {
        Scanner s = new Scanner(System.in);
        System.out.println("Hány árat akarsz?");
        int db = s.nextInt();
        return db;
    }

    public static int[] getFillEggsArrayWithPrices(int eggCount) {
        Scanner s2 = new Scanner(System.in);

        int[] eggs = new int[eggCount];
        System.out.println("darabszám"+ eggCount);


        for (int i = 0; i < eggs.length; i++) {
            System.out.println(i);
            System.out.println("Árat adj!");
            eggs[i] = s2.nextInt();
        }
        return eggs;
    }

    public static int calculateSum(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static void printCalculatedAverge(int sum, int eggCount) {
        int ave = sum / eggCount;
        System.out.println("átlag: "+ave);

    }
}
