package Exer02;

public class Produto {

	private String nome;
	private String descricao;
	private double precoUnitario;
	private int desconto;
	
	public Produto(String nome, String descricao,double precoUnitario, int desconto) {
		setNome(nome);
		setDescricao(descricao);
		setPrecoUnitario(precoUnitario);
		setDesconto(desconto);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	
	public String toString() {
		String str = "Nome: " + getNome() + 
				"\nDescrição: " + getDescricao() + 
				"\nPreço unitário: " + getPrecoUnitario() + 
				"\nDesconto: " + getDesconto();
		
		return str;
	}
}
