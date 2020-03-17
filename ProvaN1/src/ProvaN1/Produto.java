package ProvaN1;

public class Produto {

	private int codigo;
	private String descricao;
	private double valor;
	private int quantEstoque;
	
	public Produto(int codigo, String descricao, double valor, int quantEstoque) {
		setCodigo(codigo);
		setDescricao(descricao);
		setValor(valor);
		setQuantEstoque(quantEstoque);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantEstoque() {
		return quantEstoque;
	}

	public void setQuantEstoque(int quantEstoque) {
		this.quantEstoque = quantEstoque;
	}
	
	
}
