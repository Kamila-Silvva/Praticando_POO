package ExercicioPOO.Calculadora;

public class Calculadora {

        public double somar(double a, double b) {
            return a + b;
        }

        public double sub(double a, double b) {
            return a - b;
        }
        public double multi(double a, double b) {
            return a * b;
        }

        public double div(double a, double b) {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("Divisão por zero não permitida.");
            }
        }

        public double potencia(double base, int expoente) {
            return Math.pow(base, expoente);
        }

        public long calcFatorial(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("O fatorial não está definido para negativos.");
            }
            long resultado = 1;
            for (int i = 1; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
