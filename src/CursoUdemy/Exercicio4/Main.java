package CursoUdemy.Exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int CodigoFuncionario, horasTrabalhadas;
        double valorHora, salario;

        System.out.println("Código do funcionário: ");
        CodigoFuncionario = scanner.nextInt();
        System.out.println("Horas Trabalhadas: ");
        horasTrabalhadas = scanner.nextInt();
        System.out.println("Valor da Hora: ");
        valorHora = scanner.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.println("Funcionário: " + CodigoFuncionario);
        System.out.printf("Salário: %.2f\n", salario);
    }
}
