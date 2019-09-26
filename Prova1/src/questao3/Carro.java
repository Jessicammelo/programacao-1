package questao3;

public class Carro {
//Jessica melo
	private String modelo;
	private String marca;
	private String placa;
	private String cor;
	private int ano;
	private double preco;
	private int localizacao;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(int localizacao) {
		this.localizacao = localizacao;
	}

	public String imprimir() {
		return "Carro mais caro: " + getPreco() + "\nMarca: " + getMarca()+
				"\nTodos os carros:" + getLocalizacao() + 
				"\nmais caro " + getPreco() + "\nmais barato " + getPreco();// n terminei
	}
}
