public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void retirarExtrato() {
        System.out.println("===EXTRATO CONTA POUPANCA===");
        super.imprimeInfoComuns();
    }
}
