package CursoUdemy.Exercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite o valor: ");
        numero = scanner.nextInt();

        if (numero >= 0) {
            System.out.println("Positivo");
        }
        else {
            System.out.println("Negativo");
        }
    }
}
