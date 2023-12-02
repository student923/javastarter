import java.util.Random;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("Write 6 names");
        Scanner scan = new Scanner(System.in);
        String name1 = scan.next();
        scan = new Scanner(System.in);
        String name2 = scan.next();
        scan = new Scanner(System.in);
        String name3 = scan.next();
        scan = new Scanner(System.in);
        String name4 = scan.next();
        scan = new Scanner(System.in);
        String name5 = scan.next();
        scan = new Scanner(System.in);
        String name6 = scan.next();

        Random random = new Random();
        int num = random.nextInt(6);



        if(num == 0){
            System.out.println("Tah winner is: " + name1);
        } else if (num == 1) {
            System.out.println("Tah winner is: " + name2);
        } else if (num == 2) {
            System.out.println("Tah winner is: " + name3);
        }else if (num == 3) {
            System.out.println("Tah winner is: " + name4);
        }else if (num == 4) {
            System.out.println("Tah winner is: " + name5);
        }else if (num == 5) {
            System.out.println("Tah winner is: " + name6);
        }
    }
}
