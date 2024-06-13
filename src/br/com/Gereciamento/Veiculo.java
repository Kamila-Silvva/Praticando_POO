package br.com.Gereciamento;

public class Veiculo {
    public String marca;
    public String modelo;
    public int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public double calcularCustoManutencao(){
        return 0.0;
    }
    public void exibirDetalhes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("ano: " + ano);
    }
}

