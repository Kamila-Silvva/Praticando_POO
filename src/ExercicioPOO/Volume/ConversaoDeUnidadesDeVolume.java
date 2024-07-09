package ExercicioPOO.Volume;

public class ConversaoDeUnidadesDeVolume {

    public static double litrosParaCentimetrosCubicos(double litros) {
        return litros * 1000;
    }

    public static double metrosCubicosParaLitros(double metrosCubicos) {
        return metrosCubicos * 1000;
    }

    public static double metrosCubicosParaPesCubicos(double metrosCubicos) {
        return metrosCubicos * 35.32;
    }

    public static double galoesParaPolegadasCubicas(double galoes) {
        return galoes * 231;
    }

    public static double galoesParaLitros(double galoes) {
        return galoes * 3.785;
    }

    public static double centimetrosCubicosParaLitros(double centimetrosCubicos) {
        return centimetrosCubicos / 1000;
    }

    public static double litrosParaMetrosCubicos(double litros) {
        return litros / 1000;
    }

    public static double pesCubicosParaMetrosCubicos(double pesCubicos) {
        return pesCubicos / 35.32;
    }

    public static double polegadasCubicasParaGaloes(double polegadasCubicas) {
        return polegadasCubicas / 231;
    }

    public static double litrosParaGaloes(double litros) {
        return litros / 3.785;
    }
}
