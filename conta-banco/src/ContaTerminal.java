import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe seu nome completo");
        String nomeCliente = scanner.nextLine();

        System.out.println("Informe o número da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe a agência");
        String agencia = scanner.next();

        System.out.println("Informe o saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
         + agencia + ", Conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
