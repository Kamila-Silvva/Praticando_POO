package ExercicioPOO.Contador;

public class Contador {

    private static int contador;

    public Contador (){
        contador++;
    }

    public static void Zerar() {
        contador = 0;
    }

    public static void Incrementar()  {
        contador++;
    }

    public static int getContador() {
        return contador;
    }
}