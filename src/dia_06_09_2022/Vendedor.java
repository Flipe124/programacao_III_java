package dia_06_09_2022;

public class Vendedor extends AbstractFuncionario {
    public Vendedor(String nome, Double salario) {
        super(nome, salario);
    }

    public Vendedor(String nome, Double salario,
                    String endereco) {
        super(nome, salario, endereco);
    }

    @Override
    Double getSalario() {
        return this.salario + (this.salario * 0.10);
    }
}