package aula04;

public class Caneta {

	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public Caneta(String m, String c, float p) {
		this.modelo = m;
		this.cor = c;
		this.setPonta(p);
		this.tampar();
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("Sobre a caneta: ");
		System.out.println("modelo: " + this.modelo);
		System.out.println("ponta: " + this.ponta);
		System.out.println("cor: " + this.cor);
		System.out.println("tampada: " + this.tampada);
	}
	
}
