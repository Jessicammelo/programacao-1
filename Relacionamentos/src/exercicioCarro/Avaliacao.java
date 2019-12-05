package exercicioCarro;

public class Avaliacao {

	private String descricao;
	private String aval;
	
	public Avaliacao(String descricao,String aval) {
		setDescricao(descricao);
		setAval(aval);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAval() {
		return aval;
	}

	public void setAval(String aval) {
		this.aval = aval;
	}
	
	public String toString() {
		return "Descrição mecanica : " + getDescricao() + "\nAval: " + getAval();
	}
}
