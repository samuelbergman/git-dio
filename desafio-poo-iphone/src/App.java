import aparelho.Iphone;

public class App {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.selecionarMusica("Stairway to Heaven");
        iphone.tocar();
        iphone.pausar();
    }
}
