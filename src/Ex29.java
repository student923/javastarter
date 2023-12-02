import java.util.Random;

public class Ex29 {
    public static void main(String[] args) {
        Random r = new Random();

        int sz = r.nextInt(2);
        int act = r.nextInt(2);

        String szulo = "";
        String tev = "";

        switch (sz) {
            case 0:
                szulo = "Anya";
                break;
            case 1:
                szulo = "Apa";
                break;
        }

        if (szulo.equals("Apa")) {
            switch (act) {
                case 0:
                    tev = "barkácsolás";
                    break;
                case 1:
                    tev = "fűnyírás";
                    break;
            }
        } else if(szulo.equals("Anya")) {
            switch (act) {
                case 0:
                    tev = "sütés";
                    break;
                case 1:
                    tev = "játszózás";
                    break;
            }

        }

        System.out.println(szulo + "val " + tev + " tevékenységet végezzük");
    }
}
