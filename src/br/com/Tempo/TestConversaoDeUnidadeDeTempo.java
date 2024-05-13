package br.com.Tempo;

public class TestConversaoDeUnidadeDeTempo {
    public static void main(String[] args) {

        ConversaoDeUnidadeDeTempo Conversao = new ConversaoDeUnidadeDeTempo();

        System.out.println("Segundos: " + ConversaoDeUnidadeDeTempo.segParaMin(1200));
        System.out.println("Minutos: " + ConversaoDeUnidadeDeTempo.minParaHoras(180));
        System.out.println("Horas: " + ConversaoDeUnidadeDeTempo.horasParaDias(60));
        System.out.println("Dias: " + ConversaoDeUnidadeDeTempo.horasParaDias(50));
        System.out.println("Semanas: " +  ConversaoDeUnidadeDeTempo.diasParaSemana(30));
        System.out.println("Meses: " + ConversaoDeUnidadeDeTempo.diasParaMeses(5));
        System.out.println("Anos: " + ConversaoDeUnidadeDeTempo.diasParaAnos(500));

    }
}
