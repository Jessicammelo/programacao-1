package Lista3;
//J�ssica Melo e Danielle Fernanda Deola
public class ProjetoDeLeiComplementar extends ProjetoDeLei {
	private String artigoLO;
	private int quantVotosFavoraveis;

	
	public String getArtigoLO() {
		return artigoLO;
	}

	public void setArtigoLO(String artigoLO) {
		this.artigoLO = artigoLO;
	}

	public int getQuantVotosFavoraveis() {
		return quantVotosFavoraveis;
	}

	public void setQuantVotosFavoraveis(int quantVotosFavoraveis) {
		this.quantVotosFavoraveis = quantVotosFavoraveis;
	}

	public String mostrar() {
		return this.toString();
	}

	@Override
	public String toString() {
		return " T�tulo : " + this.getTitulo() + " Artigo LO: " + this.getArtigoLO() + " N�mero do projeto: " + 
	this.getNumeroProjeto() + " Quant de votos Favor�veis: " + this.getQuantVotosFavoraveis() + " Data apresenta��o: " + 
				this.getDataApresentacao() + " Data aprova��o: " + this.getDataAprovacao();
				
	}

}
