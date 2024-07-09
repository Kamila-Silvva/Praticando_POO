package ExercicioPOO.Banco;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.00;
    }

    public void deposito (double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("O valor de: R$ " + valor + " Foi depositado com sucesso!");
        } else {
            System.out.println("O valor não corresponde a forma de deposito disponivél");
        }
    }

    public void saque (double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("O saque de: R$ " + valor + " Foi Realizado com Sucesso!");
        } else {
            System.out.println("Saldo insuficiente para saque. O valor disponível para saque é de: R$ " + saldo);
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
