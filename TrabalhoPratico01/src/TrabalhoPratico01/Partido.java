package TrabalhoPratico01;

public class Partido {

	private String nome;
	private int numero;

	public Partido(String nome, int numero) {
		setNome(nome);
		setNumero(numero);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String toString() {
		return "Nome do partido: " + getNome(); 
		}

}
