import java.util.Arrays;
import java.util.List;

public class Ex72 {
    public static void main(String[] args) {
        List<String> loggedHours = Arrays.asList("Zuckerberg,4", "Steve,4", "Bill,1", "Bill,2", "Zuckerberg,4",
                "Bill,2", "Zuckerberg,1", "Zuckerberg,3", "Zuckerberg,1", "Zuckerberg,1",
                "Steve,4", "Bill,2", "Zuckerberg,3", "Bill,2", "Zuckerberg,4", "Steve,1",
                "Bill,3", "Steve,2", "Steve,2", "Bill,1", "Zuckerberg,4",
                "Bill,4", "Steve,4", "Bill,2", "Bill,3", "Zuckerberg,3",
                "Steve,4", "Zuckerberg,4", "Bill,2", "Zuckerberg,3");

        System.out.println(loggedHours);

        String name = "Zuckerberg";
        int compCount = 4;
        for(String company:loggedHours ){
            String[] companyArray = company.split(",");
        }
    }


}
