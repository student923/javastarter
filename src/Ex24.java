import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String marka = s.next();
        String slogen = "";
        String indul = "Y";

        while (indul.equals("Y")) {
            switch (marka) {
                case "Saab":
                    slogen = "Move your mind!";
                    break;
                case "Opel":
                    slogen = "Wir lieben autos!";
                    break;
                case "VW":
                    slogen = "Das auto!";
                    break;
                case "Skoda":
                    slogen = "Simply clever!";
                    break;
                case "Volvo":
                    slogen = "For life!";
                    break;
                default:
                    System.out.println("nem ismert!!!");
            }
            System.out.println(marka + " szlogenje pedig: " + slogen);
            System.out.println("Kíváncsi új szlogenre?");
            indul = s.next();

            if(indul.equals("Y")){
                System.out.println("Másik márk?");
                marka = s.next();
            }

        }


    }
}
