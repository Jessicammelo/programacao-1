package TrabalhoPratico01;

//Jessica Melo
public class Projetos {

	private String titulo;
	private boolean status;

	public Projetos(String titulo, boolean status) {
		setTitulo(titulo);
		setStatus(status);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
