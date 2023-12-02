import java.util.Scanner;

public class Ex24c {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String mark = "";
        String restart = "";

        while (!restart.equals("N")) {

            if(restart.equals("Y")){
                System.out.println("Na akkor adj be egy új márkát!");
            }else {
                System.out.println("Adj be egy márkát!");
            }

            mark = s.nextLine();

            switch (mark) {
                case "Saab":

                    System.out.println("Move your mind!");
                    break;
                case "Opel":
                    System.out.println("Wir lieben autos!");
                    break;
                case "VW":
                    System.out.println("Das auto!");
                    break;
                case "Skoda":
                    System.out.println("Simply clever!");
                    break;
                case "Volvo":
                    System.out.println("For life!");
                    break;
                default:
                    System.out.println("nem ismert!!!");
            }
            System.out.println("Kérsz új szlogent?");
            restart = s.nextLine();
        }
    }
}
