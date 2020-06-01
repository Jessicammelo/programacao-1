package Questao02;

import java.util.Date;
//Jessica Melo
public class ArtigoImportante extends Artigo {
// heranca de artigo
	
	private int fatorImpacto;
	
	public ArtigoImportante(String titulo, String periodo, Date dataPublicacao, char qualis, int fatorImpacto) {
		super(titulo, periodo, dataPublicacao, qualis);
		setFatorImpacto(fatorImpacto);
	}

	public int getFatorImpacto() {
		return fatorImpacto;
	}

	public void setFatorImpacto(int fatorImpacto) {
		this.fatorImpacto = fatorImpacto;
	}
	
	public String exibirDados() {
		return exibirDadosAbstratos() + "\nFator importante: " + getFatorImpacto();
	}
	
	public String mostrar() {
		
		
		return "";
	}
}
