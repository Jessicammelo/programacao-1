package exercicioNavio;

public class TesteNavio {

	public static void main(String[] args) {
		Navio umNavio = new Navio(5874, 200, "Titanic");
		BoteSalvaVidas umBote = new BoteSalvaVidas(25874, 8, true);
		BoteSalvaVidas doisBotes = new BoteSalvaVidas(6587, 58, false);
		BoteSalvaVidas tresBotes = new BoteSalvaVidas(254, 120, true);
		umNavio.agregacaoBotes(umBote);
		umNavio.agregacaoBotes(doisBotes);
		umNavio.agregacaoBotes(tresBotes);
		
		
		

		System.out.println(umBote.mostrar());
		System.out.println(umNavio.mostrar());
		
	}

}
