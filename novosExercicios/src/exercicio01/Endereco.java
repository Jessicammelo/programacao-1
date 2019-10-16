package exercicio01;

public class Endereco {

	private String rua;
	private String cidade;
	
	public Endereco(String rua, String cidade) {
		setRua(rua);
		setCidade(cidade);
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String imprimir() {
		return "Rua: " + getRua() + "\nCidade: " + getCidade();
	} 
}
