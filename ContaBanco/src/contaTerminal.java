import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        /*
         * int numero = 0;
         * String agencia = "";
         * String nome = "";
         * double saldo = 0;
         */

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", Obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + " sua conta é " + numero + " e seu saldo " + saldo
                + ", já está disponível para saque");

        scanner.close();

    }
}
