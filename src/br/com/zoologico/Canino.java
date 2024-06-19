package br.com.zoologico;

public class Canino extends Mamifero{
    String raca;
    String cor;

    public Canino(String nome, int idade, double peso, String temPelos, String tipodeSangue, String raca, String cor) {
        super(nome, idade, peso, temPelos, tipodeSangue);
        this.raca = raca;
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void infoAnimal (){
        super.infoAnimal();
        System.out.println("Raça: " + raca);
        System.out.println("Cor: " + cor);
    }
}
