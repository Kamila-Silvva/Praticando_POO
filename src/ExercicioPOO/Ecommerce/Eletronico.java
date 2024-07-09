package ExercicioPOO.Ecommerce;

public class Eletronico extends Produto {
    int garantia;

    public Eletronico(String nome, double preco, String descricao, int garantia) {
        super(nome, preco, descricao);
        this.garantia = garantia;
    }

    public void exibirDetalhes () {
        super.exibirDetalhes();
        System.out.println("A garantia e de " + garantia + "anos");
    }
}
