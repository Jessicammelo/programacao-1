package prova03;

public class Plano {
//jessica melo
	protected String nomeDoPlano;
	protected int ano;
	protected int quantDependentes;
	
	public Plano(String nomeDoPlano, int ano, int quantDependentes) {
		setNomeDoPlano(nomeDoPlano);
		setAno(ano);
		setQuantDependentes(quantDependentes);
	}

	public String getNomeDoPlano() {
		return nomeDoPlano;
	}

	public void setNomeDoPlano(String nomeDoPlano) {
		this.nomeDoPlano = nomeDoPlano;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getQuantDependentes() {
		return quantDependentes;
	}

	public void setQuantDependentes(int quantDependentes) {
		this.quantDependentes = quantDependentes;
	}
	
	public String toString() {
		return"";
	}
}
