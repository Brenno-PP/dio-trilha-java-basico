import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá Cliente! Qual o seu primeiro nome?");
        String nome = scanner.next();

        System.out.println("Qual o seu sobrenome?");
        String sobrenome = scanner.next();

        System.out.println("Por favor, informe o número da sua agência:");
        String agencia = scanner.next();

        System.out.println("Digite agora o número da sua conta:");
        int conta = scanner.nextInt();

        System.out.println("Informe o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");


    }
}
