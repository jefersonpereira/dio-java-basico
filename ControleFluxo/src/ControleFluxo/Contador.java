package ControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.print("\nDigite o primeiro número: ");
                int parametro1 = scanner.nextInt();

                System.out.print("\nDigite o segundo número: ");
                int parametro2 = scanner.nextInt();

                if (parametro1 > parametro2) {
                    throw new ParametrosInvalidosException("\nO segundo parâmetro deve ser maior que o primeiro");
                }

                contar(parametro1, parametro2);

            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("\nDeseja encerrar o programa? Digite 'sair' para sair ou qualquer outra tecla para continuar: ");
            String escolha = scanner.next();
            if (escolha.equalsIgnoreCase("sair")) {
                continuar = false;
                System.out.println("Encerrando o programa.");
            }
        }

        scanner.close();
    }

    public static void contar(int parametro1, int parametro2) {
        for (int i = 1; i <= (parametro2 - parametro1); i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}





