package ExercicioPOO.Areas;

public class TesteConversaoDeUnidadesDeArea {
    public static void main(String[] args) {

        ConversaoDeUnidadesDeArea Conversao = new ConversaoDeUnidadesDeArea();

        System.out.println("1 metro quadrado: " + ConversaoDeUnidadesDeArea.metrosQuadrado(1.0) + " Pés Quadrados ");
        System.out.println("1 Pé quadrado: " + ConversaoDeUnidadesDeArea.centrimetrosQuadrados(1.0) + " Centimetros Quadrados ");
        System.out.println("1 Milha Quadrada: " + ConversaoDeUnidadesDeArea.milhasQuadrados(1.0) + " Acres ");
        System.out.println("1 Acre Quadrado: " + ConversaoDeUnidadesDeArea.acresQuadrados(1.0) + " Pés Quadrados ");
    }
}
