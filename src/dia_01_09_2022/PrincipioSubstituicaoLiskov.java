package dia_01_09_2022;

public class PrincipioSubstituicaoLiskov {
    public static void Executar(){
        ExecutarLegado();
    }

    public static void ExecutarLegado(){
        Estagiario estagiarioDois =
                new Estagiario("Estagiário Dois", 1500.00);
        estagiarioDois.setEndereco("RUA CBA 123");

        Vendedor vendedorDois =
                new Vendedor("Vendedor Dois", 3500.00);
        vendedorDois.setEndereco("RUA HJS 789");

        System.out.println("NOME | SALÁRIO | ENDEREÇO");

        System.out.println(estagiarioDois.getNome() + " | " +
                estagiarioDois.getSalario() + " | " +
                estagiarioDois.getEndereco());

        System.out.println(vendedorDois.getNome() + " | " +
                vendedorDois.getSalario() + " | " +
                vendedorDois.getEndereco());

        System.out.println("================================");

        imprimir(estagiarioDois);
        imprimir(vendedorDois);
    }

    public static void imprimir(AbstractFuncionario funcionario) {
        System.out.println(funcionario.getNome() + " | " + funcionario.getSalario() + " | " + funcionario.getEndereco());
        //Imprimir(vendedor);
        //Imprimir(estagiario);
    }
}
