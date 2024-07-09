package CursoUdemy.Exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double Raio, Area, Pi =  3.14159;

        System.out.print("Escreva o valor do raio: ");
        Raio = scanner.nextDouble();

        Area = Pi * Raio * Raio;

        System.out.printf("Área: %.4f\n", Area);

        scanner.close();
    }
}