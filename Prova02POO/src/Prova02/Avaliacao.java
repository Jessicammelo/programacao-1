package Prova02;
//J�ssica Melo, J�ssica Strutz
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
