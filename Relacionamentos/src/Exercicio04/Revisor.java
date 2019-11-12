package Exercicio04;

public class Revisor {

	private String nome, parecer;
	private boolean status;

	public Revisor(String nome, String parecer, boolean status) {
		setNome(nome);
		setParecer(parecer);
		setStatus(status);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getParecer() {
		return parecer;
	}

	public void setParecer(String parecer) {
		this.parecer = parecer;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String toString() {
		String str = "Revisor: " + getNome() + "Parecer: " + getParecer();
		if (isStatus()) 
			return str + "Status: Aprovado";
			return str + "Status: Reprovado";
		
		
	}

}
