package RecuperaProva02;

public class Motorista extends Passageiro{

	protected String CNH;
	
	public Motorista(double taxa, String nome, String CNH) {
		super(taxa, nome);
		setCNH(CNH);
	}

	public String getCNH() {
		return CNH;
	}

	public void setCNH(String cNH) {
		CNH = cNH;
	}
	
}
