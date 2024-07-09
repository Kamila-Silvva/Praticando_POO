package ExercicioPOO.zoologico;

public class Ave extends Animal {
    String temPenas;
    String podeVoar;

    public Ave(String nome, int idade, double peso, String temPenas, String podeVoar) {
        super(nome, idade, peso);
        this.temPenas = temPenas;
        this.podeVoar = podeVoar;
    }

    public String getTemPenas() {
        return temPenas;
    }

    public void setTemPenas(String temPenas) {
        this.temPenas = temPenas;
    }

    public String getPodeVoar() {
        return podeVoar;
    }

    public void setPodeVoar(String podeVoar) {
        this.podeVoar = podeVoar;
    }

    public void infoAnimal() {
        super.infoAnimal();
        System.out.println("Tem penas: " + temPenas);
        System.out.println("Pode voar: " + podeVoar);
    }
}
