public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimeExtrato() {
        System.out.println(" === Extrato da Conta Poupança ===");
        imprimirInfosComuns();
    }
    

}
