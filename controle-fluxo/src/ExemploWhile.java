import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

     public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho!");
            mesada -= valorDoce;
        }
     }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}