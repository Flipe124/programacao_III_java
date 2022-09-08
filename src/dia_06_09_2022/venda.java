package dia_06_09_2022;

public class Venda {
    private Produto produto = new Produto();

    public Produto getProduto() {
        return produto;
    }

    public void setValorProduto(Double valor) {
        this.produto.setValor(valor);
    }

    public void setNomeProduto(String nome){
        this.produto.setNome(nome);
    }
}
