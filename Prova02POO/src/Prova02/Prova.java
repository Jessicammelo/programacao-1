package Prova02;
//Jéssica Melo, Jéssica Strutz
public class Prova extends Avaliacao {

	private float nota;

	public Prova(String descricao,float f) {
		super(descricao);
		this.nota = f;
	}

	public Float getNota() {
		return nota;
	}
	
	
	
}
