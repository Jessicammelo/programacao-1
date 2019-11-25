package Exercicio;

public class ProfDE extends Professor{

	private double salario;
	
	public ProfDE(String nome, double salario) {
		super(nome);
		setSalario(salario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return super.toString() + "\nSalário: " + getSalario();
	}
}
