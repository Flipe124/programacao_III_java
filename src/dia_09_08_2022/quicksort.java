package dia_09_08_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quicksort {
    public static  void main(String [] args){
        try {
            Integer[] array = new Integer[] {9, 1, 8, 2, 7, 3};
            System.out.println("Antes: " + getDataArray(array));

            System.out.println("Depois: " + getDataArray(quicksort(array)));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    private static String getDataArray(Integer[] array){
        String data = "";
        for(Integer value : array){
            data += value + ", ";
        }
        return data;
    }

    private static Integer[] quicksort(Integer[] array){
        if(array.length < 2){
            return array;
        }

        Integer indice = (array.length -1)/ 2;
        Integer pivo = array[indice];

        List<Integer> low = new ArrayList<Integer>();
        List<Integer> high = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();

        for (Integer value : array){
            if (value < pivo){
                low.add(value);
            } else if (value > pivo){
                high.add(value);
            }
        }

        low = Arrays.asList(quicksort(low.toArray(new Integer[low.size()])));
        high = Arrays.asList(quicksort(high.toArray(new Integer[high.size()])));

        result.addAll(low);
        result.add(pivo);
        result.addAll(high);

        return result.toArray(new Integer[result.size()]);
    }
}
