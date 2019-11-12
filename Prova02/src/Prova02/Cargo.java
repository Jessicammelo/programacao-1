package Prova02;

public class Cargo {

	private int codigo;
	private String descricao;
	private double salarioBase;

	public Cargo(int codigo, String descricao, double salarioBase) {
		setCodigo(codigo);
		setDescricao(descricao);
		setSalarioBase(salarioBase);
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

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}


	
	
	
}
