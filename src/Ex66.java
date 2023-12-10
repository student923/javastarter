import java.util.Scanner;

public class Ex66 {
    public static void main(String[] args) {

        String[] array = getBrandsFromUser();
        isFavouriteBrandInArray(array);

    }

    public static String[] getBrandsFromUser() {

        String[] carsArray = new String[3];
        Scanner scanner = new Scanner(System.in);

        String currentInput = "";
        int carsArrayIndex = 0;
        while (!((currentInput = scanner.next()).equals("x")) && carsArrayIndex < carsArray.length - 1) {
            carsArray[carsArrayIndex] = currentInput;
            carsArrayIndex++;
        }
        return carsArray;
    }


    public static void isFavouriteBrandInArray(String[] carsArray) {
        String myFavoriteCar = "Ferrari";

        for (int i = 0; i < carsArray.length; i++) {
            if (carsArray[i].equals(myFavoriteCar)) {
                System.out.println(carsArray[i] + " a kedvenc autómárkám.");
                //break az opcionális, optimalizálás miatt berakható, hogy ne nézze a tömb többi elemét, ha már megtalálta az egyezőt
                break;
            }
        }
    }
}
