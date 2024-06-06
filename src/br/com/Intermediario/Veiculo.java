package br.com.Intermediario;

public class Veiculo {
    String marca;
    String modelo;
    int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void infoVeiculos () {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    void acelerar () {
        System.out.println("Acelerar");
    }

    void frear () {
        System.out.println("Frear");
    }
}
