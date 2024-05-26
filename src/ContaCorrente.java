public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void retirarExtrato() {
        System.out.println("===EXTRATO CONTA CORRENTE===");
        super.imprimeInfoComuns();
    }
}
