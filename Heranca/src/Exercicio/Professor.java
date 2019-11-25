package Exercicio;

public class Professor {
//pai

	private String nome;

	public Professor(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "Nome: " + getNome();
	}
}
