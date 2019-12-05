package exercicioNavio;

public class BoteSalvaVidas extends Embarcacao {

	protected boolean inflavel;
	
	public BoteSalvaVidas(int registroCapitania, int quantPessoas, boolean inflavel) {
		super(registroCapitania, quantPessoas);
		setInflavel(inflavel);
	}
	
	public boolean isInflavel() {
		return inflavel;
	}

	public void setInflavel(boolean inflavel) {
		this.inflavel = inflavel;
	}
	
	public String mostrar() {
		return "Reg. capitania: " + getRegistroCapitania() + "\nQuantidade de pessoas: " + getQuantPessoas() + "\nInflavel: " + isInflavel();
	}
	
}
