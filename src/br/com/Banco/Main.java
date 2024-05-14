package br.com.Banco;

public class Main {
    public static void main(String[] args) {
        ContaBancaria Conta = new ContaBancaria("Kamila Silva");

        System.out.println("Titular: " + Conta.getTitular());
        System.out.println("Saldo: " + Conta.getSaldo());

        Conta.deposito(2500);
        Conta.saque(1500);

        System.out.println("Saldo disponível em conta após as ações realizadas: R$ " + Conta.getSaldo());
    }
}
