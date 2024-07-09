package ExercicioPOO.Ecommerce;

public class Livro extends Produto{
    String autor;
    String genero;

    public Livro(String nome, double preco, String descricao, String autor, String genero) {
        super(nome, preco, descricao);
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Autor: " + autor);
        System.out.println("Gênero: " + genero);
    }
}
