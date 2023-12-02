public class Ex32 {
    public static void main(String[] args) {

        int[] evenNum = new int[50];
        int[] oddNum = new int[50];
        int j = 0;
        int k = 0;

        for(int i = 1; i < 101; i++){
            if(i % 2 == 0){
                evenNum[j] = i;
                j++;
            }
        }

        for(int i = 1; i < 101; i++){
            if(i % 2 != 0){
                oddNum[k] = i;
                k++;
            }
        }

        for (int i = 0; i < evenNum.length; i++){
            System.out.println(evenNum[i]);
        }


        System.out.println("-------------------------------------");

        for (int i = 0; i < oddNum.length; i++){
            System.out.println(oddNum[i]);
        }
    }
}
