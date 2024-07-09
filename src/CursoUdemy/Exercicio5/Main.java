package CursoUdemy.Exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int codPeca1, codPeca2, quantidadePeca1, quantidadePeca2;
        double valorUnitarioPeca1, valorUnitarioPeca2, Total;

        System.out.println("Código da primiera peça: ");
        codPeca1 = scanner.nextInt();

        System.out.println("Quantidade: ");
        quantidadePeca1 = scanner.nextInt();

        System.out.println("Valor unitário: ");
        valorUnitarioPeca1 = scanner.nextDouble();

        System.out.println("Código da segunda peça: ");
        codPeca2 = scanner.nextInt();

        System.out.println("Quantidade: ");
        quantidadePeca2 = scanner.nextInt();

        System.out.println("Valor unitário: ");
        valorUnitarioPeca2 = scanner.nextDouble();

        Total = valorUnitarioPeca1 * quantidadePeca1 + valorUnitarioPeca2 * quantidadePeca2;

        System.out.printf("Valor total a pagar: %.2f\n", Total);

        scanner.close();

    }
}
