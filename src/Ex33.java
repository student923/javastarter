public class Ex33 {
    public static void main(String[] args) {
        //String[] carsArray = new String[7];

        String[] carsArray = {"Opel", "VW", "Saab", "Volvo", "Kia", "Skoda", "Rover"};

        String myFavoriteCar = "Saab";

        for(int i = 0; i < carsArray.length; i++){
            if(carsArray[i].equals(myFavoriteCar)){
                System.out.println("A kedvenc autom: " + carsArray[i]);
            }
        }


    }
}
