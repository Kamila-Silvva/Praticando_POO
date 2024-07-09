package ExercicioPOO.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Alexandre", "CEO", "Dono da porra toda", 1000000);
        funcionario.exibirInformacoes();
        funcionario.aumentarSalario(50);
    }
}
