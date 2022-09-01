package dia_30_08_2022;

public abstract class AbstractFuncionario{
    private String nome;
    protected Double salario; //só é visivel pela classe que herda ela

    public AbstractFuncionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    abstract Double getSalario();
}
