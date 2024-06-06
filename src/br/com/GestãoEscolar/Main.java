package br.com.GestãoEscolar;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Kamila", "03531940180", "22-09-2003",
                "UC28200708", "Ads");
        aluno.estudar();

        Professor professor = new Professor("Kamila", "03531940180",
                "22-09-2003", "Programação Orientada a Objetivos", 10.000);
        professor.ensinar();

    }
}
