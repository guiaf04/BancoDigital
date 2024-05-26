public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferencia(Conta conta, double valor);
    void retirarExtrato();
}
