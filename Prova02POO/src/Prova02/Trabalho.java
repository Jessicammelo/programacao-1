package Prova02;
//Jéssica Melo, Jéssica Strutz
public class Trabalho  extends Avaliacao{

	private char conceito;

	public Trabalho(String descricao, char conceito) {
		super(descricao);
		this.conceito = conceito;
	}

	public char getConceito() {
		return conceito;
	}

	@Override
	public Float getNota() {
		switch (conceito) {
		case 'A':
			return 10f;
		case 'B':
			return 9f;
		case 'C':
			return 7.5f;
		case 'D':
			return 5f;
		default:
			return 2f;
		}
	}
	
	
}
