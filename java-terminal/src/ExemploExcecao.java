import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) throws ParseException {

        Number valor = 0;

        try {
            valor = NumberFormat.getInstance().parse("a1.75");
        }
        catch (ParseException e) {
            System.out.println("Erro ao converter valor.");
        }

        System.out.println(valor);
    }
}
