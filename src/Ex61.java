import java.util.Scanner;

public class Ex61 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ageFilter(s.nextInt());
      ;
    }

    public static void ageFilter(int age){
        if(age < 18){
            System.out.println("na takarodj");
        }else {
            System.out.println("jöhetsz");
        }
    }



}
