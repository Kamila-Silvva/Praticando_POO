package ExercicioPOO.Funcionario;

public class Funcionario {
    private String nome;
    private String cargo;
    private String departamento;
    private float salario;

    public Funcionario(String nome, String cargo, String departamento, float salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            salario += salario * (percentual / 100);
            System.out.println("Salário com aumento de " + percentual + "%: " + salario);
        } else {
            System.out.println("Percentual de aumento deve ser maior que zero.");
        }
    }

    public void aumentarSalarioValor(double valor) {
        if (valor > 0) {
            salario += valor;
            System.out.println("Salário com aumento de " + valor + ": " + salario);
        } else {
            System.out.println("Valor do aumento deve ser maior que zero.");
        }
    }

    public void exibirInformacoes () {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
        System.out.println("Departamento: " + departamento);
    }
}
