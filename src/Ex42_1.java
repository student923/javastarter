import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex42_1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        float sumTemp = 0;
        int counntTemp = 9;
        int counntFev = 0;
        List<Float> temperature = new ArrayList<>();
        List<Float> fever = new ArrayList<>();

        while ((counntTemp > 0)) {
            System.out.println("Add a temp: ");
            float t = s.nextFloat();
            if (t > 36 && t < 43) {
                temperature.add(t);
                counntTemp--;
            }

        }

        for (Float tem : temperature) {

            if (tem > 38) {
                counntFev++;
                fever.add(tem);
            }
            sumTemp = sumTemp + tem;
        }

        System.out.println(sumTemp / 9);
        System.out.println("Láz: " + counntFev);
        System.out.println(fever);
    }
}
