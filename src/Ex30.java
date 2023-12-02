public class Ex30 {
    public static void main(String[] args) {

        String[] week = new String[7];

        week[0] = "Monday";
        week[1] = "Tueasday";
        week[2] = "Wednesday";
        week[3] = "Thursday";
        week[4] = "Friday";
        week[5] = "Saturday";
        week[6] = "Sunday";

        String[] week2 ={"Monday", "Tueasday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        week[3] = "Joker";



        for (int i = 0; i < week.length; i++){
            System.out.println(week[i]);
        }
        System.out.println("--------------------------------");

        for (int i = 0; i < week2.length; i++){
            System.out.println(week2[i]);
        }

        System.out.println("--------------------------------");


        System.out.println(week2[4]);
    }
}
