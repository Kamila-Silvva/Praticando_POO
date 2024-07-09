package ExercicioPOO.Ecommerce;

public class Produto {

    String nome;
    double preco;
    String descricao;

    public Produto(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public void exibirDetalhes () {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Descrição: " + descricao);
    }
}
