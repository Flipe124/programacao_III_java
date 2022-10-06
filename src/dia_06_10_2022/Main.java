package dia_06_10_2022;

import java.util.ArrayList;
import java.util.Queue;

public class Main {
    public static void main(String []args){


    }



    private static Queue<String> enfilirarDados(Queue<String> queue, ArrayList<String> lista){
      if (lista == null) {
          return queue;
      }

      for (String item : lista){
          queue.offer(item);
      }

      return queue;
    };
}
