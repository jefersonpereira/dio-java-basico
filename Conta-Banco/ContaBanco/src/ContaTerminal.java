
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in); //construtor scanner

        // Solicitando o número da conta
        System.out.print("Por favor, digite o seu número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do teclado

        // Solicitando o número da agência
        System.out.print("Por favor, digite o seu número da agência: ");
        String agencia = scanner.nextLine(); // Limpa o buffer do teclado

        // Solicitando o nome do cliente
        System.out.print("Por favor, digite o seu nome: cliente: ");
        String nomeCliente = scanner.nextLine(); // Limpa o buffer do teclado

        // Solicitando o saldo
        System.out.print("Por favor, digite o seu saldo da conta: ");
        double saldo = scanner.nextDouble(); // Limpa o buffer do teclado

        // Criando e exibindo a mensagem final
        String mensagem = "\n\nOlá Cliente: " + nomeCliente + ".\nMuito obrigado por criar uma conta em nosso banco.\nÉ um prazer atender-lhe!!! \nA sua agência é a de número: " + agencia + " e a sua conta é a: " + numeroConta + "\nO seu saldo " + saldo + " já está disponível para saque.\n\n";
        System.out.println(mensagem);

        // Fechando o scanner
        scanner.close();
    }
}
