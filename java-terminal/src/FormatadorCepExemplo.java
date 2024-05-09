public class FormatadorCepExemplo {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("237664");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExceltion e) {
            System.out.println("Erro ao formatar CEP. Não corresponde ao padrão esperado.");
        }
    }

    static String formatarCep (String cep) throws CepInvalidoExceltion {
        if (cep.length() != 8) 
            throw new CepInvalidoExceltion();
        
        return "23.765-064";
    }

}