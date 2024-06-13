package br.com.Livro;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("O juiz", "Maya Passos", 350, 150);
        livro.exibirDetalhes();
        livro.avancarPagina();
        livro.retrocederPagina();
        livro.exibirPaginaAtual();
    }
}
