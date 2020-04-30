package aula02;

public class Caneta {

	public String modelo;
	public String cor;
	public float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		System.out.println("modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
	}
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro");
		} else {
			System.out.println("Estou rabiscando");
		}
	}
	
	private void tampar() {
		this.tampada = true;
	}
	
	private void destampar() {
		this.tampada = false;
	}
}
