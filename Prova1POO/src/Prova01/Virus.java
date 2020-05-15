package Prova01;
//Jéssica Maria de Melo e Danielle Fernanda Deola
public class Virus {

	private String RNA;
	
	public Virus(String rna) throws Exception {
		this.setRNA(rna);
	}

	public String getRNA() {
		return RNA;
	}

	public void setRNA(String rNA) throws Exception {
		if (rNA.length() != 11) {
			throw new Exception("RNA diferente de 11");
		}
		RNA = rNA;
	}
	
}
