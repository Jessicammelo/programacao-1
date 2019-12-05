package exercicioCarro;

import java.util.ArrayList;

public class Carro {

	private String placa;
	private int ano, combustivel;// 1 alcool - 2 gasolina
	private double potencia;
	protected ArrayList<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();

	public Carro(String placa, int ano, int combustivel, double potencia) {
		setPlaca(placa);
		setAno(ano);
		setCombustivel(combustivel);
		setPotencia(potencia);
	}

	public ArrayList<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public void agregarAvaliacoes(Avaliacao umaAvaliacao) {
		avaliacoes.add(umaAvaliacao);// agregacao
	}

	public double calcularRendimento() {
		if (getCombustivel() == 1)
			return 10 / (getPotencia() * 0.7);
		return 12 / (getPotencia() * 0.6);

	}
	
	public String toString() {
		String str = "Placa: " + getAno() + "\nAno: "  + getAno() + "\n Combustivel: (1- alcool/ 2- gasolina)" + getCombustivel() + 
				"\nPotência: " + getPotencia() + "\nRendimento: " + calcularRendimento();
		
		for(Avaliacao a : avaliacoes) {
			str += "\n"  + a.toString();
		}
		return str;
	}

}
