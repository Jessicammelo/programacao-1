package Lista3;
//Jéssica Melo e Danielle Fernanda Deola
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
		return " Título : " + this.getTitulo() + " Artigo LO: " + this.getArtigoLO() + " Número do projeto: " + 
	this.getNumeroProjeto() + " Quant de votos Favoráveis: " + this.getQuantVotosFavoraveis() + " Data apresentação: " + 
				this.getDataApresentacao() + " Data aprovação: " + this.getDataAprovacao();
				
	}

}
