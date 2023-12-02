import java.util.Arrays;
import java.util.List;

public class Ex47 {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Rumour", "Babel", "Babel","Babel", "Babel","Babel", "Babel","Babel", "Babel","Babel",
                "Babel","Babel", "Babel","Rumour","Babel", "Babel", "Rumour","Rumour", "Rumour","Babel",
                "Babel", "Rumour","Rumour", "Rumour", "Babel", "Rumour", "Rumour", "Rumour", "Rumour",
                "Rumour", "Rumour", "Babel", "Rumour","Rumour", "Rumour","Babel", "Babel", "Rumour",
                "Rumour", "Rumour", "Rumour");

        int babel = 0;
        int romur = 0;

        for(String ertek: data){
            if(ertek.equals("Babel")){
                babel++;
            }else {
                romur++;
            }
        }
        System.out.println("babel" + babel);
        System.out.println("rumor" + romur);

        if(babel>romur){
            System.out.println("Babel nyert!");
        }else {
            System.out.println("Rumor nyert!");
        }
    }
}
