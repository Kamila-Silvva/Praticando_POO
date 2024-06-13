package br.com.Gereciamento;

public class Moto extends Veiculo{
    public int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }
    public double calcularCustoManutencao(){
        return 300;
    }
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + cilindradas);

    }
}
