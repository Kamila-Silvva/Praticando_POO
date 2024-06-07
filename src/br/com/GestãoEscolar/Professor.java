package br.com.GestãoEscolar;

public class Professor extends Pessoa {
    String disciplina;
    double salario;

    public Professor(String nome, String cpf, String dataDeNascimento, String disciplina, double salario) {
        super(nome, cpf, dataDeNascimento);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void ensinar () {
        super.apresentar();
        System.out.println("Ensina: " + disciplina);
        System.out.println("Salário: R$: " +  salario);
    }

}
