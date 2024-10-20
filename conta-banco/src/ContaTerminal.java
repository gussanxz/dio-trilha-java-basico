
//TODO:Conhecer e importar a classe Scanner
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    // Exibir as mensagens para o nosso usuário
    System.out.println("Bem vindo ao Banco do Brasil! Estamos muito felizes por estar aqui conosco!");
    System.out.println("Para abrir uma conta, por favor, informe o número da conta. Ex: 1021");
    // Obter pela scanner os valores digitados no terminal
    int numeroConta = scanner.nextInt();

    System.out.println("Agora, informe o número da agência. Ex: 067-8");
    String numeroAgencia = scanner.next();

    System.out.println("Por favor, informe seu nome:");
    String nomeCliente = scanner.next();

    System.out.println("Por favor, informe seu sobrenome:");
    String sobrenomeCliente = scanner.next();

    System.out.println("Informe o saldo que gostaria de depositar:");
    double saldo = scanner.nextDouble();
    // Exibir a mensagem conta criada
    System.out.println("Olá, " + nomeCliente + " " + sobrenomeCliente
        + "! Obrigado por criar uma conta em nosso banco. Sua agência é " + numeroAgencia + " e sua conta é "
        + numeroConta + ". Seu saldo no valor de R$" + saldo + " já está disponível para saque.");
  }

}