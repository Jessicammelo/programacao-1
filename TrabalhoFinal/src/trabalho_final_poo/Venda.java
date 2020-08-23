package trabalho_final_poo;

import java.time.LocalDate;

public class Venda {
	private LocalDate data;
	private double valor;
	private String formaDeVenda;
	private Comprador comprador;
	private ObraDeArte obra;

	public Venda() {
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getFormaDeVenda() {
		return formaDeVenda;
	}

	public void setFormaDeVenda(String formaDeVenda) {
		this.formaDeVenda = formaDeVenda;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	public ObraDeArte getObra() {
		return obra;
	}

	public void setObra(ObraDeArte obra) {
		this.obra = obra;
	}

}
