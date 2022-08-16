import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO:conhecer e importar a classe Scanner
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    

       //Exibir as mensagens para o nosso usuário
        System.out.println("Digite o número da sua Conta");
        int conta = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();
        System.out.println("Digite seu saldo :");
        double saldo = scanner.nextDouble();
       // Obter pela scanner os valores digitados no terminal
       
       //Exibir a mensagem
       System.out.println("Olá " + nome + " "+ sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +",conta " + conta +" e seu saldo "+ saldo + " já está disponível para saque.");
      
    }
}
