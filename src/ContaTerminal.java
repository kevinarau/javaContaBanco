
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura dos dados da conta
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        String numeroConta = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, colocar seu CPF");
        String cpfcliente = scanner.nextLine();


        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();



        // Mensagem de agradecimento com os dados da conta
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numeroConta + ", seu cpf"  + cpfcliente +  " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
