public class Ex34 {
    public static void main(String[] args) {

        int[] numbers = new int[21];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }

        for(int i = numbers.length-1; i > -1; i--){
            System.out.print(numbers[i] + ", ");
        }

    }
}
