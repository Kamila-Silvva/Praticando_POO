package ExercicioPOO.zoologico;

public class Main {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];
        animais[0] = new Canino("Cachorro", 3, 10.7, "Sim", "Quente", "S/R","Marrom");
        animais[1] = new Felino("Gato", 5, 10.7, "Sim", "Quente", "S/R","Laranja");
        animais[2] = new Papagaio("Papagaio", 50, 5.9, "Sim", "Sim", "Colorido", "Sim");

        for (Animal animal : animais) {
            animal.infoAnimal();
            System.out.println(" ");
        }
    }
}
