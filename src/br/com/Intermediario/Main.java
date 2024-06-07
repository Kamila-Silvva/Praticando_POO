package br.com.Intermediario;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Ferrari", "Daytona SP3", 2023, 2);
        carro.infoVeiculos();
        carro.acelerar();
        carro.frear();
        carro.ligarArCondicionado();

        Moto moto = new Moto("Honda", "L80", 2024, 180);
        moto.infoVeiculos();
        moto.acelerar();
        moto.frear();
        moto.empinarMoto();
    }
}
