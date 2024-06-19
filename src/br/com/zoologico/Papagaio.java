package br.com.zoologico;

public class Papagaio extends Ave {
    String cor;
    String podeFalar;

    public Papagaio(String nome, int idade, double peso, String temPenas, String podeVoar, String cor, String podeFalar) {
        super(nome, idade, peso, temPenas, podeVoar);
        this.cor = cor;
        this.podeFalar = podeFalar;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPodeFalar() {
        return podeFalar;
    }

    public void setPodeFalar(String podeFalar) {
        this.podeFalar = podeFalar;
    }

    @Override
    public void infoAnimal() {
        super.infoAnimal();
        System.out.println("Cor: " + cor);
        System.out.println("Pode falar: " + podeFalar);
    }
}
