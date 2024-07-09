package CursoUdemy.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1, valor2, soma;

        System.out.println("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        valor2 = scanner.nextInt();

        soma = valor1 + valor2;

        System.out.println("Soma: " + soma);
    }
}
