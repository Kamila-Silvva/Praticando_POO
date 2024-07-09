package ExercicioPOO.zoologico;

public class Mamifero extends Animal{
    String temPelos;
    String tipodeSangue;

    public Mamifero(String nome, int idade, double peso, String temPelos, String tipodeSangue) {
        super(nome, idade, peso);
        this.temPelos = temPelos;
        this.tipodeSangue = tipodeSangue;
    }

    public String getTemPelos() {
        return temPelos;
    }

    public void setTemPelos(String temPelos) {
        this.temPelos = temPelos;
    }

    public String getTipodeSangue() {
        return tipodeSangue;
    }

    public void setTipodeSangue(String tipodeSangue) {
        this.tipodeSangue = tipodeSangue;
    }

    public void infoAnimal () {
        super.infoAnimal();
        System.out.println("Tem pelos: " + temPelos);
        System.out.println("Tipo de Sangue: " + tipodeSangue);
    }
}
