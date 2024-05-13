package br.com.Volume;

public class TestConversaoDeUnidadesDeVolume {
    public static void main(String[] args) {

        ConversaoDeUnidadesDeVolume Conversao = new ConversaoDeUnidadesDeVolume();

        System.out.println("Conversão de Litros para Centímetros Cúbicos: " + ConversaoDeUnidadesDeVolume.litrosParaCentimetrosCubicos(1.0));
        System.out.println("Conversão de Metros Cúbicos para Litros: " + ConversaoDeUnidadesDeVolume.metrosCubicosParaLitros(5.0));
        System.out.println("Conversão de Metros Cúbicos para Pés Cúbicos: " + ConversaoDeUnidadesDeVolume.metrosCubicosParaPesCubicos(1.0));
        System.out.println("Conversão de Galões para Polegadas Cúbicas: " + ConversaoDeUnidadesDeVolume.galoesParaPolegadasCubicas(5.0));
        System.out.println("Conversão de Galões para Litros: " + ConversaoDeUnidadesDeVolume.galoesParaLitros(1.0));
        System.out.println("Conversão de Centímetros Cúbicos para Litros: " + ConversaoDeUnidadesDeVolume.centimetrosCubicosParaLitros(5.0));
        System.out.println("Conversão de Litros para Metros Cúbicos: " + ConversaoDeUnidadesDeVolume.litrosParaMetrosCubicos(1.0));
        System.out.println("Conversão de Pés Cúbicos para Metros Cúbicos: " + ConversaoDeUnidadesDeVolume.pesCubicosParaMetrosCubicos(5.0));
        System.out.println("Conversão de Polegadas Cúbicas para Galões: " + ConversaoDeUnidadesDeVolume.polegadasCubicasParaGaloes(1.0));
        System.out.println("Conversão de Litros para Galões: " + ConversaoDeUnidadesDeVolume.litrosParaGaloes(5.0));

    }
}
