package RecuperaProva02;

public class Passageiro {

	protected double taxa;
	protected String nome;
	
	public Passageiro(double taxa, String nome) {
		setTaxa(taxa);
		setNome(nome);
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
