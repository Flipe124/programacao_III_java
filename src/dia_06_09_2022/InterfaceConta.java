package dia_06_09_2022;

public interface InterfaceConta {
    void creditar(Double valor);
    void debitar(Double valor);
    Double getSaldo();
    void investir(Double valor);
}
