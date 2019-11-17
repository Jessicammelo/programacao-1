package heranca;

public class Publicacao {

	private String nome, editores;
	
	public Publicacao(String nome, String editores) {
		setNome(nome);
		setEditores(editores);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEditores() {
		return editores;
	}

	public void setEditores(String editores) {
		this.editores = editores;
	}
	
	public String toString() {
		return "Nome: " + getNome()+ "\nEditores: " + getEditores();
	}
}
