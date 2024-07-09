package CursoUdemy.Exercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite o número: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("Impar");
        }
    }
}
