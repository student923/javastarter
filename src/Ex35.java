public class Ex35 {
    public static void main(String[] args) {
        int[] ages = { 5, -3, 0, 21, 55, 18, 32, 255, 42};

        for(int i = 0; i < ages.length; i++){
            if(ages[i] >= 0 && ages[i] < 122){
                System.out.println(ages[i]);
            }
        }
    }
}
