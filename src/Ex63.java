import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args) {

        List<Integer> data = getTriangleFromConsole();
        boolean valid = isValidTriange(data);
        System.out.println(valid);
    }

    public static List<Integer> getTriangleFromConsole() {

        List<Integer> triangelData = new ArrayList<>();

        System.out.println("Write 3 num!");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        System.out.println("Write 3 num!");
        scan = new Scanner(System.in);
        int num2 = scan.nextInt();

        System.out.println("Write 3 num!");
        scan = new Scanner(System.in);
        int num3 = scan.nextInt();

        triangelData.add(num1);
        triangelData.add(num2);
        triangelData.add(num3);

        return triangelData;
    }

    public static boolean isValidTriange(List<Integer> data) {

        if ((data.get(0) < data.get(1) + data.get(2)) && (data.get(1) < data.get(0) + data.get(2)) && (data.get(2) < data.get(1) + data.get(0))) {
            return true;
        } else {
            return false;
        }
    }
}
