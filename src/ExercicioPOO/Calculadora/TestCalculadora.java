package ExercicioPOO.Calculadora;

public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Soma: " + calculadora.somar(5, 3));
        System.out.println("Subtração: " + calculadora.sub(10, 4));
        System.out.println("Multiplicação: " + calculadora.multi(2, 6));
        System.out.println("Divisão: " + calculadora.div(15, 3));
        System.out.println("Potência: " + calculadora.potencia(2, 3));
        System.out.println("Fatorial: " + calculadora.calcFatorial(7));
    }
}
