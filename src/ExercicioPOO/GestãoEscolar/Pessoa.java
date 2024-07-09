package ExercicioPOO.GestãoEscolar;

public class Pessoa {
    String nome;
    String cpf;
    String dataDeNascimento;

    public Pessoa(String nome, String cpf, String dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public void apresentar () {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " +  cpf);
        System.out.println("Data de Nascimento: " + dataDeNascimento);
    }
}
