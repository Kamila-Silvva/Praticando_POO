package ExercicioPOO.GestãoEscolar;

public class Aluno extends Pessoa {
    String matricula;
    String curso;

    public Aluno(String nome, String cpf, String dataDeNascimento, String matricula, String curso) {
        super(nome, cpf, dataDeNascimento);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void estudar () {
        super.apresentar();
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " +  curso);
    }
}
