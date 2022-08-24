package dia_23_08_2022;

import java.util.Arrays;
import  java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Hashtable<String, Double> produtos =
                new Hashtable<String, Double>();
        produtos.put("Pera", 1.59);
        produtos.put("Maça", 2.99);

        System.out.println("Produto | valor");

        for (Map.Entry<String, Double> produto : produtos.entrySet()){
            System.out.println(produto.getKey() + " | " + produto.getValue());
        }
    }
}
