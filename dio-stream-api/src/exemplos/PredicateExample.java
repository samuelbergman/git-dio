package exemplos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "ruby", "c++", "c#", "go", "php", "scala");

        Predicate<String> tamanhoMaiorQueCinco = palavra -> palavra.length() > 5;

        palavras.stream().filter(t -> t.length() < 5).forEach(System.out::println);
    }
}
