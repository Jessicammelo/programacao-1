package carro;

public class Carro {
	private String marca;
	private int ano, localizacao;
	private double preco;
	
	public Carro (String marca, int ano, int localizacao, double preco) {
		setMarca(marca);
		setAno(ano);
		setLocalizacao(localizacao);
		setPreco(preco);
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(int localizacao) {
		this.localizacao = localizacao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String exibirInfo() {
		return "\nMarca: " + getMarca() + "\nAno: " + getAno() + " \nPreço: " + getPreco() + "\nLocalização: " + getLocalizacao();
				
				
	}
}
