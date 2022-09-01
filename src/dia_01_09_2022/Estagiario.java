package dia_01_09_2022;

import dia_30_08_2022.AbstractFuncionario;

public class Estagiario extends AbstractFuncionario {

    public Estagiario(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getSalario() {
        return this.salario;
    }
}
