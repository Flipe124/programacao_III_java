package dia_30_08_2022;

public class Vendedor extends AbstractFuncionario{
    public Vendedor(String nome, Double salario) {
        super(nome, salario);
    }
    @Override
    Double getSalario(){
        return this.salario + (this.salario * 0.10);
    }
}
