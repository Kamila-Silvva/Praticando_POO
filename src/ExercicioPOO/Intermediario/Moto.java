package ExercicioPOO.Intermediario;

public class Moto extends Veiculo {
    int cilindro;

    public Moto(String marca, String modelo, int ano, int cilindro) {
        super(marca, modelo, ano);
        this.cilindro = cilindro;
    }

    public void infoVeiculos () {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cilindro: " + this.cilindro);
    }

    void empinarMoto () {
        System.out.println("Empinar Moto");
    }
}
