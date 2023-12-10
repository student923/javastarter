import java.util.Scanner;

public class Ex64 {
    public static void main(String[] args) {

        int num1 = getNumberFromUser();
        int num2 = getNumberFromUser();
        String operator = getOperatorFromUser();

        int res = getCalculationResult(operator, num1, num2);
        showResultToTheUser(res);

    }

    public static int getNumberFromUser() {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        return num;
    }

    public static String getOperatorFromUser() {
        Scanner st = new Scanner(System.in);
        String op = st.nextLine();
        return op;
    }

    public static int getCalculationResult(String operator, int num1, int num2) {
        int eredmeny = 0;
        if (operator.equals("+")) {
            eredmeny = num1 + num2;
        } else if (operator.equals("-")) {
            eredmeny = num1 - num2;
        } else if (operator.equals("*")) {
            eredmeny = num1 * num2;
        } else if (operator.equals("/")) {
            eredmeny = num1 / num2;
        }
        return eredmeny;
    }

    public static void showResultToTheUser(int eredmeny) {

        System.out.println(eredmeny);
    }

}
