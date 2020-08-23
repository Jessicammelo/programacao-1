package Prova02;
//Jéssica Melo, Jéssica Strutz
abstract class  Avaliacao  {

	private String descricao;
	
	
	public Avaliacao (String descricao) {
		this.descricao = descricao;
	}


	public String getDescricao() {
		return descricao;
	}
	
	public abstract Float getNota();
		
	
}
