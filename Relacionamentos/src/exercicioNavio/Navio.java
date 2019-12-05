package exercicioNavio;

import java.util.ArrayList;

public class Navio extends Embarcacao {

	protected String nome;
	protected ArrayList<BoteSalvaVidas> botess = new ArrayList<BoteSalvaVidas>();

	public Navio(int registroCapitania, int quantPessoas, String nome) {
		super(registroCapitania, quantPessoas);
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void agregacaoBotes(BoteSalvaVidas umBote) {
		botess.add(umBote);
	}

	private boolean verificarSecuranca() {
		int totalPessoas = 0;
		for (BoteSalvaVidas b : botess) {
			totalPessoas += b.getQuantPessoas();
		}
		return totalPessoas >= getQuantPessoas();
	}

	public String mostrar() {
		String str = "Reg. capitania: " + getRegistroCapitania() + "\nQuantidade de pessoas: " + getQuantPessoas()
				+ "\nNome: " + getNome();

		for (int i = 0; i < botess.size(); i++) {
			str += "\nBote " + (i + 1) + "\n" + botess.get(i).mostrar();
		}
		if (verificarSecuranca()) {
			return str += "\nNavio atende as normas de segurança";
		} else {
			return str += "\nNavio não atende as normas de segurança";
		}
	}
}
