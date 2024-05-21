public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Fulano");

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cc.depositar(100);
        cc.imprimeExtrato();

        cc.transferir(cp, 100);  
        cp.imprimeExtrato();

        cc.imprimeExtrato();
    }
}
