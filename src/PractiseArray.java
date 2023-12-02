public class PractiseArray {
    public static void main(String[] args) {
        int[] firstArray = new int[5];

        String[] secondArray = {"dinnye", "alma", "körte"};

        firstArray[0] = 11;
        secondArray[2] = "eper";

        System.out.println(secondArray[2]);


        System.out.println(secondArray.length);

        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i+1;
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }



    }
}
