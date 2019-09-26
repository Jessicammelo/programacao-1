package exercicio9Matriz;

public class Compromisso {

	private String descricao;
	private String local;

	//contrutror
	public Compromisso(String descricao, String local) {
		setDescricao(descricao);
		setLocal(local);
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String imprimir() {
		return "Descrição: " + getDescricao()+
				"\nLocal: " + getLocal();
	}
}
