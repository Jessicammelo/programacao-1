package Exercicio;

public class ProfHorista extends Professor{

	private int quantHoras;
	private double valorHora;
	
	public ProfHorista(String nome, int quantHoras, double valorHora) {
		super(nome);
		setQuantHoras(quantHoras);
		setValorHora(valorHora);
	}

	public int getQuantHoras() {
		return quantHoras;
	}

	public void setQuantHoras(int quantHoras) {
		this.quantHoras = quantHoras;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double getSalario() {
		return getQuantHoras() * getValorHora();
	}
	public String toString() {
		return super.toString() + "\nQuant horas: " + getQuantHoras() + "\nValor por hora: " + getValorHora() + "\nSálario: " + getSalario();
	}
}
