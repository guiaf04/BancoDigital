public class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    int agencia;
    int numero;
    double saldo;
    Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        if(valor <= saldo)
            this.saldo -= valor;
        else throw new RuntimeException("Saldo insuficiente");
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferencia(Conta conta, double valor) {
        try{
            this.sacar(valor);
        } catch (Exception e) {
            throw new RuntimeException("Saldo insuficiente");
        }
        conta.depositar(valor);
    }

    @Override
    public void retirarExtrato() {
        imprimeInfoComuns();
    }

    public void imprimeInfoComuns() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente;
    }
}
