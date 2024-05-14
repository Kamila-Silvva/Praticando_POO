package br.com.Banco;

public class Main {
    public static void main(String[] args) {
        ContaBancaria Conta = new ContaBancaria("Kamila Silva");

        System.out.println("Titular: " + Conta.getTitular());
        System.out.println("Saldo: " + Conta.getSaldo());

        Conta.deposito(1);
        Conta.saque(401);

        System.out.println("Saldo disponível em conta após as ações realizadas: R$ " + Conta.getSaldo());
    }
}
