package exercicioNavio;

public abstract class Embarcacao {

	protected int registroCapitania;
	protected int quantPessoas;

	public Embarcacao(int registroCapitania, int quantPessoas) {
		setRegistroCapitania(registroCapitania);
		setQuantPessoas(quantPessoas);
	}
	public int getRegistroCapitania() {
		return registroCapitania;
	}

	public void setRegistroCapitania(int registroCapitania) {
		this.registroCapitania = registroCapitania;
	}

	public int getQuantPessoas() {
		return quantPessoas;
	}

	public void setQuantPessoas(int quantPessoas) {
		this.quantPessoas = quantPessoas;
	}

	public abstract String mostrar();
}
