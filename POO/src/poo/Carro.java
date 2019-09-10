package poo;

public class Carro {
	private String marca;
	private String placa;
	private String cor;

	public Carro(String marca, String placa, String cor) {
		setMarca(marca);
		setPlaca(placa);
		setCor(cor);
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
		this.placa = placa.toUpperCase();
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	public String imprimir() {
		return "Seu carro é da marca " + this.getMarca() + " com a placa " + "[" + this.getPlaca() + "]" + " e cor " + this.getCor();
	}
}
