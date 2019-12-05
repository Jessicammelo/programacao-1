package Exercicio05;

import java.util.Date;

public class ShowMusical extends Evento{

	protected String artista;
	protected String estiloMusical;
	
	public ShowMusical(String artista, String estiloMusical, String titulo, double valorIngresso, Date data, Avaliacao avaliacao ) {
		super(titulo, valorIngresso, data, avaliacao);
		setArtista(artista);
		setEstiloMusical(estiloMusical);
		
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getEstiloMusical() {
		return estiloMusical;
	}

	public void setEstiloMusical(String estiloMusical) {
		this.estiloMusical = estiloMusical;
	}
	
	public String mostrar() {
		return "Titulo: " + getTitulo() + "\nValor ingresso: " + getValorIngresso() + "\nData: " + getData() + 
				"\nArtista: " + getArtista() + 
				"\nEstilo Musical: " + getEstiloMusical();
	}

}
