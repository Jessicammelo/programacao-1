package Questao02;
//Jessica Melo
public class Professor {
	// arrayprofessor

	private String nome;
	private String area;
	private Artigo artigo;

	public Professor(String nome, String area, Artigo artigo) {
		setNome(nome);
		setArea(area);
		setArtigo(artigo);
	}

	public Artigo getArtigo() {
		return artigo;
	}

	public void setArtigo(Artigo artigo) {
		this.artigo = artigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String toString() {
		return "Nome: " + getNome() + "\n¡rea: " +getArea() + "\nArtigo: " + getArtigo().exibirDados();
	}
	public String mostrarEstatistica() {
		return toString();
	}

}
