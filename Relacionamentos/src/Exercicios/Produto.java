package Exercicios;

public class Produto {

	private String descricao;
	private double precoUnitario;
	
	public Produto(String descricao, double precoUnutario) {
		setDescricao(descricao);
		setPrecoUnitario(precoUnitario);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	public String toString() {
		return "Descrição: " + getDescricao() + "Preço: " + getPrecoUnitario();
	}
}
