public class Main {
    public static void main(String[] args) {

        Cliente venilton = new Cliente("Venilton", 35);

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferencia(poupanca, 100);

        cc.retirarExtrato();
        poupanca.retirarExtrato();

        cc.transferencia(poupanca, 100);
    }
}