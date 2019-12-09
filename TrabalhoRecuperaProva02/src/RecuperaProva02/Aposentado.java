package RecuperaProva02;

public class Aposentado extends Passageiro{

	protected String RG;
	
	public Aposentado(String RG, double taxa, String nome) {
		super(taxa, nome);
		setRG(RG);
		
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	
	
}
