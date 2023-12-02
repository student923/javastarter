import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        String op = s.next();

        int eredmeny = 0;

        if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("pumped") ) {
            switch (op) {
                case "+":
                    eredmeny = num1 + num2;
                    break;
                case "-":
                    eredmeny = num1 - num2;
                    break;
                case "*":
                    eredmeny = num1 * num2;
                    break;
                case "/":
                    eredmeny = num1 / num2;
                    break;
                case "pumped":
                    eredmeny = (num1*num1*num1) * (num2*num2*num2);
                    break;
            }
            System.out.println(eredmeny);
        } else {
            System.out.println("Invalid operator");
        }
    }
}
