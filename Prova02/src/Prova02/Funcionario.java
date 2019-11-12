package Prova02;

public class Funcionario {

	private int codigo,quantFilhos;
	private String nome;
	private double horasExtras;
	private boolean fluenciaIdioma;
	private Cargo cargo;
	
	public Funcionario(int codigo, int quantFilhos, String nome, double horasExtras, boolean fluenciaIdioma, Cargo cargo) {
		setCodigo(codigo);
		setQuantFilhos(quantFilhos);
		setNome(nome);
		setHorasExtras(horasExtras);
		setFluenciaIdioma(fluenciaIdioma);
		setCargo(cargo);
	}

	public Cargo getCargo() {
		return cargo;
	}


	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantFilhos() {
		return quantFilhos;
	}

	public void setQuantFilhos(int quantFilhos) {
		this.quantFilhos = quantFilhos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}

	public boolean isFluenciaIdioma() {
		return fluenciaIdioma;
	}

	public void setFluenciaIdioma(boolean fluenciaIdioma) {
		this.fluenciaIdioma = fluenciaIdioma;
	}
	
	public double beneficiosAgregados() {
		double valorPorFilho = 250.0,valorHoraExtra = getCargo().getSalarioBase()/ 220,outroIdioma = 100;
		return (valorPorFilho * getQuantFilhos()) + (valorHoraExtra * getHorasExtras()) + 
				(outroIdioma);
	}
	
	public double desconto() {
		double desconto = (11 / 100) * getCargo().getSalarioBase();
		return getCargo().getSalarioBase() - desconto;

	}

	public double salarioBruto() {
		return getCargo().getSalarioBase() + beneficiosAgregados();
	}
	
	public double salarioLiquido() {
		return(getCargo().getSalarioBase() + beneficiosAgregados()) - desconto();
	}
	
	public String toString() {
		String str = "Nome funcionario: " + getNome() + "Salario Bruto: " + salarioBruto() + "Salario liquido: " + salarioLiquido();
		return str;
	}
	
}
