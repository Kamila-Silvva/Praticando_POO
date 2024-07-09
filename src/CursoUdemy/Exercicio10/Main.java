package Exericio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hora = 24, hora_inicio, hora_final, duracao;

        System.out.println("Começo: ");
        hora_inicio = scanner.nextInt();

        System.out.println("Final: ");
        hora_final = scanner.nextInt();

        if (hora_inicio < hora_final) {
            duracao = hora_final - hora_inicio;
        } else {
            duracao = hora_inicio - hora_final;
        }

        System.out.println("O jogo durou: " + duracao + " Horas");

    }
}
