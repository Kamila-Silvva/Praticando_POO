package CursoUdemy.Exercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Valor 1: ");
        valor1 = scanner.nextInt();
        System.out.println("Valor 2: ");
        valor2 = scanner.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("Multiplos");
        }
        else {
            System.out.println("Não são multiplos");
        }
    }
}
