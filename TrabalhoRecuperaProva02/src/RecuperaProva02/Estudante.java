package RecuperaProva02;

public class Estudante extends Passageiro{

	protected String RA;
	
	public Estudante(String RA, double taxa, String nome) {
		super(taxa, nome);
		setRA(RA);
	}

	public String getRA() {
		return RA;
	}

	public void setRA(String rA) {
		RA = rA;
	}
	
}

