public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimeExtrato() {
        System.out.println(" === Extrato da Conta Corrente ===");
        imprimirInfosComuns();
    }

}
