import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        String agencia, nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, informe o nome do cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, informe o número da conta:");    
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua agência:");    
        agencia = scanner.next();

        System.out.println("Por favor, informe o saldo da conta:");
        saldo = scanner.nextDouble();
 
        System.out.println("Olá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
    }

}