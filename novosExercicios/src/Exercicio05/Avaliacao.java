package Exercicio05;

public class Avaliacao {

	protected int quantDePagantes;
	protected String opniaoGeral;

	public Avaliacao(int quantDePagantes, String opniaoGeral) {
		setQuantDePagantes(quantDePagantes);
		setOpniaoGeral(opniaoGeral);
	}

	public int getQuantDePagantes() {
		return quantDePagantes;
	}

	public void setQuantDePagantes(int quantDePagantes) {
		this.quantDePagantes = quantDePagantes;
	}

	public String getOpniaoGeral() {
		return opniaoGeral;
	}

	public void setOpniaoGeral(String opniaoGeral) {
		this.opniaoGeral = opniaoGeral;
	}

}
