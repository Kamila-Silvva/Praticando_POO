package ExercicioPOO.Tempo;

public class ConversaoDeUnidadeDeTempo {

    public static double segParaMin (double segundos) {
        return segundos / 60;
    }

    public static double minParaHoras (double minutos) {
        return minutos / 60;
    }

    public static double horasParaDias (double horas) {
        return horas / 24;
    }

    public static double diasParaSemana (double dias) {
        return dias / 7;
    }

    public static double diasParaMeses (double meses) {
        return meses / 30;
    }

    public static double diasParaAnos (double anos) {
        return anos / 365.25;
    }
}
