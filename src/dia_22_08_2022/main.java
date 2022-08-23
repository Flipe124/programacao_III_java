package dia_22_08_2022;

public class main {
    public static void main(String[] args){
        System.out.println("Fatorial de 5 é: ");
        calcularFatorial(5);
    }
    private static Integer calcularFatorial(Integer valor){
        if(valor == 0)
            return 1;

        return valor * calcularFatorial(valor - 1);
    }
}
