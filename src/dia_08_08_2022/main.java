package dia_08_08_2022;

import java.util.NoSuchElementException;

public class main {
    public static void main(String[] args){
        try {
            int[] array = new int[] {1,3,5,7,9,11};
            System.out.println("O indice do valor 9 é: " + binarySearch(array, 9));
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    private static int binarySearch(int[] array, int value) {
        int startArray = 0;
        int endArray = array.length -1;

        while (startArray <= endArray){
            int kick = (startArray + endArray) /2;
            int random = array[kick];

            if (random == value){
                return kick;
            }

            if (random > value){
                endArray = kick -1;
            } else {
                startArray = kick +1;
            }
        }
        throw new NoSuchElementException("Indíce não encontrado!");
    }


}
