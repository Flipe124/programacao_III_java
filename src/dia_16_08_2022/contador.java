package dia_16_08_2022;

public class contador {
    public static void main(String[] args){
        System.out.println("Regressão com for: ");
        regressaoConFor(10);
    }

    private static  void regressaoConFor(int valor){
        for (int i = valor; i > 0; i--) {
            System.out.println(i);
        }
    }
}
