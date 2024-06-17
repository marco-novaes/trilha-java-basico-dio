// Interface para Reprodutor Musical
public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface para Aparelho Telefônico
public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// Interface para Navegador na Internet
public interface NavegadorNaInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe iPhone que implementa todas as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música no iPhone...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada no iPhone.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música no iPhone: " + musica);
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero + " usando o iPhone.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada no iPhone...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iPhone...");
    }

    // Métodos da interface NavegadorNaInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página no iPhone: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador do iPhone...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página no iPhone...");
    }

    // Método principal para testar as funcionalidades
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Testando funcionalidades do Reprodutor Musical
        meuIPhone.tocar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.pausar();

        // Testando funcionalidades do Aparelho Telefônico
        meuIPhone.ligar("123-456-7890");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando funcionalidades do Navegador na Internet
        meuIPhone.exibirPagina("https://www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
