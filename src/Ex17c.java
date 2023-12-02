import java.util.Random;
import java.util.Scanner;

public class Ex17c {
    public static void main(String[] args) {

        String me = "";

        int mepont = 0;
        int compPont = 0;
        int round = 1;

        while (!me.equals("x") && round != 11) {

            System.out.println("Kő? Papír? Olló?");
            Scanner s = new Scanner(System.in);
            me = s.nextLine();
            if (!me.equals("x")) {
                System.out.println("Én választásom: " + me);

                Random r = new Random();
                int comp = r.nextInt(1, 4);
                String comps = "";

                switch (comp) {
                    case 1:
                        comps = "Kő";
                        break;
                    case 2:
                        comps = "Papír";
                        break;
                    case 3:
                        comps = "Olló";
                        break;
                }

                System.out.println("Számítógép válasza: " + comps);

                if (me.equals("Kő") && comps.equals("Olló")) {
                    System.out.println("Kör: " + round + " Én nyertem");
                    if (round != 3 && round != 7) {
                        mepont = mepont + 3;
                    } else if (round == 3) {
                        mepont = mepont + 6;
                    } else if (round == 7) {
                        mepont = mepont + 9;
                    }
                    System.out.println("Én pontjaim: " + mepont);
                    System.out.println("Számítógép pontjai: " + compPont);

                } else if (me.equals("Olló") && comps.equals("Papír")) {
                    System.out.println("Kör: " + round + " Én nyertem");
                    if (round != 3 && round != 7) {
                        mepont = mepont + 3;
                    } else if (round == 3) {
                        mepont = mepont + 6;
                    } else if (round == 7) {
                        mepont = mepont + 9;
                    }
                    System.out.println("Én pontjaim: " + mepont);
                    System.out.println("Számítógép pontjai: " + compPont);
                } else if (me.equals("Papír") && comps.equals("Kő")) {
                    System.out.println("Kör: " + round + " Én nyertem");
                    if (round != 3 && round != 7) {
                        mepont = mepont + 3;
                    } else if (round == 3) {
                        mepont = mepont + 6;
                    } else if (round == 7) {
                        mepont = mepont + 9;
                    }
                    System.out.println("Én pontjaim: " + mepont);
                    System.out.println("Számítógép pontjai: " + compPont);
                } else if (me.equals(comps)) {
                    System.out.println("Kör: " + round + " Döntetlen");
                    if (round != 3 && round != 7) {
                        mepont = mepont + 1;
                        compPont = compPont + 1;
                    } else if (round == 3) {
                        mepont = mepont + 2;
                        compPont = compPont + 2;
                    } else if (round == 7) {
                        mepont = mepont + 3;
                        compPont = compPont + 3;
                    }
                    System.out.println("Én pontjaim: " + mepont);
                    System.out.println("Számítógép pontjai: " + compPont);


                } else if (!(me.equals("Kő") || me.equals("Papír") || me.equals("Olló") || me.equals("x"))) {
                    System.out.println("Hibás eszköz! Válassz újat");
                    round--;
                } else {
                    System.out.println("Kör: " + round + " Vesztettem");
                    if (round != 3 && round != 7) {
                        compPont = compPont + 3;
                    } else if (round == 3) {
                        compPont = compPont + 6;
                    } else if (round == 7) {
                        compPont = compPont + 9;
                    }
                    System.out.println("Én pontjaim: " + mepont);
                    System.out.println("Számítógép pontjai: " + compPont);
                }
            }
            round++;

        }

        System.out.println("Én pontjaim: " + mepont);
        System.out.println("Számítógép pontjai: " + compPont);

    }
}
