package br.com.Gereciamento;

public class Carro extends Veiculo{
    private int numerodePortas;

    public Carro(String marca, String modelo, int ano, int numerodePortas){
        super(marca, modelo, ano);
        this.numerodePortas = numerodePortas;
    }
    public double calcularCustoManutencao(){
        return 500;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Número de portas: " + numerodePortas);

    }
}
