package ExercicioPOO.Ecommerce;

public class Vestuario extends Produto{

    int tamanho;
    String cor;

    public Vestuario(String nome, double preco, String descricao, int tamanho, String cor) {
        super(nome, preco, descricao);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cor: " + cor);
    }
}
