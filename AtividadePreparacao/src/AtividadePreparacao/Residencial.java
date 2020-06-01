package AtividadePreparacao;
//Jéssica Maria de Melo e Danielle Fernanda Deola
public class Residencial extends Telefone {

	protected boolean conexaoInternet;
	protected float valorFixo = 15;

	public boolean isConexaoInternet() {
		return conexaoInternet;
	}

	public void setConexaoInternet(boolean conexaoInternet) {
		this.conexaoInternet = conexaoInternet;
	}
	
	
}
