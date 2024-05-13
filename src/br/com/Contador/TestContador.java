package br.com.Contador;

public class TestContador {
    public static void main(String[] args) {
        Contador  contador = new Contador();

        Contador.Zerar();
        System.out.println("Valor 1: " + Contador.getContador());

        Contador.Incrementar();
        System.out.println(" Valor 2: " + Contador.getContador());

        Contador cont = new Contador();

        Contador.Incrementar();
        System.out.println(" Valor 3: " + Contador.getContador());
        Contador.Incrementar();
        System.out.println(" Valor 4: " + Contador.getContador());
        Contador.Incrementar();
        System.out.println(" Valor 5: " + Contador.getContador());

        Contador.Zerar();
        System.out.println(" Valor 6: " + Contador.getContador());


    }
}
