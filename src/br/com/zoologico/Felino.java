package br.com.zoologico;

public class Felino extends Mamifero{
    String especie;
    String habitat;

    public Felino(String nome, int idade, double peso, String temPelos, String tipodeSangue, String especie, String habitat) {
        super(nome, idade, peso, temPelos, tipodeSangue);
        this.especie = especie;
        this.habitat = habitat;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void infoAnimal () {
        super.infoAnimal();
        System.out.println("Especie: " + especie);
        System.out.println("Habitat: " + habitat);
    }
}
