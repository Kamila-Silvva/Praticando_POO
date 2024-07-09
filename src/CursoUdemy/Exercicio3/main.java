package CursoUdemy.Exercicio3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorA, valorB, valorC, valorD, diferenca;

        System.out.println("Escreva os 4 valores: ");
        valorA = scanner.nextInt();
        valorB = scanner.nextInt();
        valorC = scanner.nextInt();
        valorD = scanner.nextInt();

        diferenca = valorA * valorB - valorC * valorD;

        System.out.println("Diferenca: " + diferenca);
    }
}
