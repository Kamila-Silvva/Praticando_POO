package CursoUdemy.Exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double ValorA, ValorB, ValorC, Pi = 3.14159, Triangulo, Circulo, Trapezio, Quadrado, Retangulo;

        System.out.println("Valor A: ");
        ValorA = scanner.nextDouble();
        System.out.println("Valor B: ");
        ValorB = scanner.nextDouble();
        System.out.println("Valor C: ");
        ValorC = scanner.nextDouble();

        Triangulo = ValorA * ValorC / 2.0;
        Circulo = Pi * ValorC * ValorC;
        Trapezio = (ValorA + ValorB) / 2.0 * ValorC;
        Quadrado = ValorB * ValorB;
        Retangulo = ValorA * ValorB;

        System.out.printf("Triangulo: %.3f\n", Triangulo);
        System.out.printf("Circulo: %.3f\n",Circulo);
        System.out.printf("Trapezio: %.3f\n", Trapezio);
        System.out.printf("Quadrado: %.3f\n", Quadrado);
        System.out.printf("Retangulo: %.3f\n", Retangulo);

        scanner.close();
    }
}
