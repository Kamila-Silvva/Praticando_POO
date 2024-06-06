package br.com.Ecommerce;

public class Main {
    public static void main(String[] args) {

        Produto[] produtos = new Produto[3];
        produtos[0] = new Eletronico("Smartphone", 1500.00, "Samsung", 12);
        produtos[1] = new Vestuario("Camiseta", 25.00, "Camiseta básica", 42, "Azul");
        produtos[2] = new Livro("Harry Potter", 40.00, "Livro de fantasia",
                "J.K. Rowling", "Fantasia");

        for (Produto produto : produtos) {
            produto.exibirDetalhes();
            System.out.println();
        }

    }
}
