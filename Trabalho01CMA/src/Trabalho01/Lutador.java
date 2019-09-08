package Trabalho01;

public class Lutador {

	private double peso;
	private String categoria;
	private String nome;

	public Lutador(String nome,double peso) {
		setPeso(peso);
		setNome(nome);
	}

	public void defineCategoria() {
		if (this.getPeso() <= 54) {
			this.setCategoria("Pluma");
		} else if (this.getPeso() <= 60) {
			this.setCategoria("Leve");
		} else if (this.getPeso() <= 75) {
			this.setCategoria("Meio-Leve");
		} else if (this.getPeso() > 75) {
			this.setCategoria("Pesado");
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String imprimir() {
		return "O lutador " + this.getNome() + " está na categoria " + "[" + this.getCategoria() + "]";
	}

}
