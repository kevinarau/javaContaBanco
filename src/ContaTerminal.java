
import java.util.Locale;
import java.util.Scanner;
             public class ContaTerminal {

                 public static void main( String [] args   ) {

                     Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


                     System.out.println(" Por favor,  digite sua conta." );
                     int numero  = scanner.nextInt();


                     System.out.println(" Por favor, digite o numero sua agencia");
                     String Agencia = scanner.next();


                     System.out.println(" Digite seu nome" );
                     String nome = scanner.next();

                     System.out.println("Digite seu sobrenome");
                     String sobrenome = scanner.next();


                     System.out.println("Digite seu saldo" );
                     double  Saldo = scanner.nextDouble();

                     String mensagemAgradecimento = String.format("Olá kevin araujo, Obrigado por criar uma conta em nosso banco. Sua agência é % 132-4, sua conta é 1324  e seu saldo de 243,43 já está disponível para saque. 243,43",
                             nome , sobrenome, Agencia, numero, Saldo );
                     long agradecer = scanner.next();



             System.out.println("Nome do Cliente " + nome +  sobrenome);
             System.out.println("Conta  = "  + numero);
             System.out.println("Agência = " + Agencia);
             System.out.println(" Meu saldo = " + Saldo );
             System.out.println("agradecer" + mensagemAgradecimento);


         scanner.close();
         }
    }