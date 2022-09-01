package dia_01_09_2022;

public class PrincipioResponsabilidadeUnica {
    public static void Executar(){
        ExecutarRefatorado();

    }

    private static void ExecutarLegado(){

        Funcionario estagiario = new Funcionario("Estagiario 1", 1500.00,
                TipoFuncionario.Estagiario);

        Funcionario vendedor = new Funcionario("Vendedor 1", 3500.00,
                TipoFuncionario.Vendedor);
        System.out.println("NOME | SALARIO");
        System.out.println(estagiario.getNome() + " | " +estagiario.getSalario());

        System.out.println(vendedor.getNome() + " | " + vendedor.getSalario());
    }
    private static void ExecutarRefatorado(){
        Estagiario estagiarioUm = new Estagiario("Estagiario um", 1500.00);
        System.out.println(estagiarioUm.getNome() + " |" + estagiarioUm.getSalario());
        Vendedor vendedorUm = new Vendedor("Vendedor um", 3500.00);
        System.out.println(vendedorUm.getNome() + " |" + vendedorUm.getSalario());

    }

}

