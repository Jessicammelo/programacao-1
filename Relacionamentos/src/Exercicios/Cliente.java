package Exercicios;

public class Cliente {

	private String nome;
	
	public Cliente(String nome) {
		setNome(nome);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//metodo para visualiza��o
	public String toString() {
		return "Cliente: " + getNome();
	}
}
