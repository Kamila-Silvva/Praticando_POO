package br.com.Intermediario;

public class Carro extends Veiculo{
    int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public void infoVeiculos () {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Número de Portas: " + this.numeroDePortas);
    }

    void ligarArCondicionado () {
        System.out.println("Ligar Ar Condicionado");
    }
}
