package Lista3;

import java.util.Date;

public class ProjetoDeLei {
	
	private String titulo;
	private Date dataApresentacao;
	private Date dataAprovacao;
	private int numeroProjeto;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getDataApresentacao() {
		return dataApresentacao;
	}
	public void setDataApresentacao(Date dataApresentacao) {
		this.dataApresentacao = dataApresentacao;
	}
	public Date getDataAprovacao() {
		return dataAprovacao;
	}
	public void setDataAprovacao(Date dataAprovacao) {
		this.dataAprovacao = dataAprovacao;
	}
	public int getNumeroProjeto() {
		return numeroProjeto;
	}
	public void setNumeroProjeto(int numeroProjeto) {
		this.numeroProjeto = numeroProjeto;
	}
	
	
	public String mostrar() {
		return this.toString();
	}
	
	@Override
	public String toString() {
		return "titulo = " + titulo + ", dataApresentacao = " + dataApresentacao + ", dataAprovacao = "
				+ dataAprovacao + ", numeroProjeto = " + numeroProjeto;
	}
	
	
}
