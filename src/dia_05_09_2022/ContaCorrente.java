package dia_05_09_2022;

public class ContaCorrente  implements InterfaceConta{
    private Double saldo;

    @Override
    public  void  creditar(double valor){
        if (valor <= 0.0){
            throw new RuntimeException("Valor inválido!");
        }
        this.saldo += valor;
    }
    @Override
    public  void  debitar(double valor){
        if (valor<= 0.0){
            throw new RuntimeException("Valor inválido para dabito!");
        }
        this.saldo -= valor;
    }

    @Override
    public  void  debitar(double valor){
        if ((this.saldo - valor) <= 0.0){
            throw new RuntimeException("Valor inválido para dabito!");
        }
    }

    @Override
    public Double  getSaldo(){
        return  this.saldo;
    }
}
