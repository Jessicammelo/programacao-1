package exercicio02;

import exercicio01.Endereco;

public class Concorrente {

	private String nome;
	private String area;
	private int inscricao;
	private Endereco umEndereco;

	
	public Concorrente(String nome, String area, int inscricao, Endereco umEndereco) {
		setNome(nome);
		setArea(area);
		setInscricao(inscricao);
		setUmEndereco(umEndereco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getInscricao() {
		return inscricao;
	}

	public void setInscricao(int inscricao) {
		this.inscricao = inscricao;
	}
	
	public Endereco getUmEndereco() {
		return umEndereco;
	}

	public void setUmEndereco(Endereco umEndereco) {
		this.umEndereco = umEndereco;
	}

	public String imprimir() {
		return "Nome: " + getNome() + "\nArea:" + getArea() + "\nInscrição:" + getInscricao()+ "\n" + getUmEndereco().imprimir();
	}

}
