import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        System.out.println("Write 3 num!");
        Scanner scan = new Scanner(System.in);
        Integer num1 = Integer.valueOf(scan.next());
         scan = new Scanner(System.in);
        Integer num2 = Integer.valueOf(scan.next());
         scan = new Scanner(System.in);
        Integer num3 = Integer.valueOf(scan.next());

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);


        if( (num1 < num2 + num3) && (num2 < num1 + num3) && (num3 < num2 + num1) ){
            System.out.println("Király!");
        }else {
            System.out.println("Shit!");
        }
    }
}
