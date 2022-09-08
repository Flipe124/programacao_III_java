package dia_06_09_2022;

public class Estagiario extends AbstractFuncionario {

    public Estagiario(String nome, Double salario) {
        super(nome, salario);
    }

    public Estagiario(String nome, Double salario,
                      String endereco) {
        super(nome, salario, endereco);
    }

    @Override
    public Double getSalario() {
        return this.salario;
    }
}
