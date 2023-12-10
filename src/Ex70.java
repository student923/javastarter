import java.util.ArrayList;
import java.util.List;

public class Ex70 {
    public static void main(String[] args) {

        List<String> names = getListWithName();
        List<String> upperNames =transformListToUpperCase(names);
        printList(upperNames);

    }

    public static List<String> getListWithName(){
        List<String> names = new ArrayList<>();

        names.add("david");
        names.add("zsolt");
        names.add("lászló");

        return names;
    }


    public static List<String> transformListToUpperCase(List<String> names){
        List<String> upperNames = new ArrayList<>();

        for(String name:names){
            upperNames.add(name.toUpperCase());
        }
        return upperNames;
    }

    public static void printList(List<String> upperNames){
        System.out.println(upperNames);
    }
}
