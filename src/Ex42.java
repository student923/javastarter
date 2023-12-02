import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {

        List<Float> data = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        Float sum = 0f;
        int laz = 0;


        for (int i = 0; i < 9; i++) {
            if(i == 0 || i == 3 || i == 6){
                System.out.println("Testhőmérséklet reggel?");
                data.add(s.nextFloat());
                sum = sum + data.get(i);
                if (data.get(i) > 37) {
                    laz++;
            }
            }else if(i == 1 || i == 4 || i == 7){
                System.out.println("Testhőmérséklet délben?");
                data.add(s.nextFloat());
                sum = sum + data.get(i);
                if (data.get(i) > 37) {
                    laz++;
                }
            } else if (i == 2 || i == 5 || i == 8) {
                System.out.println("Testhőmérséklet este?");
                data.add(s.nextFloat());
                sum = sum + data.get(i);
                if (data.get(i) > 37) {
                    laz++;
                }
            }
        }

        System.out.println(data);
        System.out.println("Értékek összege: " + sum);
        System.out.println("Átlagos hőmérsékelt: " + (sum / 9));
        System.out.println("Egyiszer volt lázas: " + laz);
    }
}
