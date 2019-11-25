package trabalhoPolimorfismo;
//Jéssica Melo
public class Vilao extends Personagem{

	private int tempoDePrisao;
	
	public Vilao(String nome, String nomeVidaReal, int tempoDePrisao) {
		super(null, nome, nomeVidaReal);
		setTempoDePrisao(tempoDePrisao);
	}

	public int getTempoDePrisao() {
		return tempoDePrisao;
	}

	public void setTempoDePrisao(int tempoDePrisao) {
		this.tempoDePrisao = tempoDePrisao;
	}
	
	
}
