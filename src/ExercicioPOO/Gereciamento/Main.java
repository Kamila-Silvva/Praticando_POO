package ExercicioPOO.Gereciamento;

public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[2];
        Carro[] Veiculo;
        veiculos[0] = new Carro("Honda","Civic", 2024, 4);
        veiculos[1] = new Moto("Honda", "Biz", 2024, 250);

        for (Veiculo veic : veiculos) {
            veic.exibirDetalhes();
            double custoManutencao = veic.calcularCustoManutencao();
            System.out.println("");
        }
    }
}
