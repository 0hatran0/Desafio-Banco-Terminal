import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o número da agancia: ");
        String agencia = scanner.next();

        System.out.print("Digite o nome do cliente: ");
        String nomeDoCliente = scanner.next();

        System.out.print("Digite o saldo do cliente: ");
        double saldo = scanner.nextDouble();

        System.out.println("\n"+"Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta "+ numero +" e seu saldo R$"+ saldo +" já está disponível para saque");

        scanner.close();
    }
}
