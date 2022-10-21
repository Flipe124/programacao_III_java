package dia_06_10_2022;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String []args){


    }
    private static  String pesquisaEmLargura(Hashtable<String, ArrayList<String>> hashtable, String verticeInicial){
        Queue<String> queue = new LinkedList<String>();

//        queue = enfilirarDados();




        while (queue.size() > 0){
            String pessoa = queue.poll();
            ArrayList<String> verificados = new ArrayList<String>();

            if("Harrison".equals(pessoa)){
                return "Harrison foi encontrado!";
            }

            if (verificados.contains(pessoa)){
                continue;
            }

            queue = enfilirarDados(queue, (ArrayList<String>) hashtable.get(pessoa));
        }

        return "Harrison não foi encontrado!";
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
