public class Ex7 {
    public static void main(String[] args) {
        int user = Integer.parseInt(args[0]);

        System.out.println(user);

        if (user == 4 || user == 5 || user == 6){
            System.out.println("Italos nap");
        }else {
            System.out.println("Nem italos nap");
        }
    }
}
