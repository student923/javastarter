import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex75 {
    public static void main(String[] args) {
        List<String> vmi = Arrays.asList("00171", "00181", "00190", "00200", "0021x", "00220");
        int pass = 0;
        int skip = 0;
        int failed = 0;

        for (String num : vmi) {
            //System.out.println(num.substring(4));
            if (num.substring(4).equals("1")) {
                pass++;
            } else if (num.substring(4).equals("0")) {
                skip++;
            } else if (num.substring(4).equals("x")) {
                failed++;
            }
        }
        System.out.println("Tesztesetek száma" + vmi.size());

        System.out.println("pass:" + pass);
        System.out.println("passaránya:" + ((double) pass / vmi.size()) * 100);

        System.out.println("skip:" + skip);
        System.out.println("skip aránya:" + ((double) skip / vmi.size()) * 100);

        System.out.println("failed:" + failed);
        System.out.println("failed aránya:" + ((double) failed / vmi.size()) * 100);

    }
}
