
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Alice", "123.456.789-00");
        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente1);

        contaCorrente.depositar(1000);
        contaPoupanca.depositar(500);
        contaCorrente.transferir(200, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
