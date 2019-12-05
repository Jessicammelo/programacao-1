package Exercicio05;

import java.util.Date;

public class Evento {

	protected String titulo;
	protected double valorIngresso;
	protected Date data;
	private Avaliacao avaliacao;

	public Evento(String titulo, double valorIngresso,Date data, Avaliacao avaliacao) {
		setTitulo(titulo);
		setValorIngresso(valorIngresso);
		setData(data);
		setAvaliacao(avaliacao);
	}

	public Evento(String string, double d, String string2) {
		// TODO Auto-generated constructor stub
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getValorIngresso() {
		return valorIngresso;
	}

	public void setValorIngresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void avaliar(Avaliacao umaAvaliacao) {
		
	}
	public String mostrar() {
		return "Titulo: " + getTitulo() + "\nValor ingresso: " + getValorIngresso() + "\nData: " + getData() + 
				"\nquant pessoas: " + getAvaliacao().getQuantDePagantes() + "\nOpnião Geral: " + getAvaliacao().getOpniaoGeral();
	}
}
