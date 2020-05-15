package AtividadePreparacao;

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
