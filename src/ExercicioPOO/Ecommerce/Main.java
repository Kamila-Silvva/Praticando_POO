package ExercicioPOO.Ecommerce;

public class Main {
    public static void main(String[] args) {

        Produto[] produtos = new Produto[3];
        produtos[0] = new Eletronico("Smartphone", 1800.00, "Samsung", 2);
        produtos[1] = new Vestuario("Vestido", 69.90, "Vestido longo", 42, "Azul e branco");
        produtos[2] = new Livro("Tessa", 69.90, "O lado bom precisa do ruim para poder existir",
                "Bruna Pallazzo", "Fantasia");

        for (Produto produto : produtos) {
            produto.exibirDetalhes();
            System.out.println();
        }

    }
}
