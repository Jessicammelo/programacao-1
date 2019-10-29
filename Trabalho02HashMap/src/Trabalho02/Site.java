package Trabalho02;

//nome: Jessica Melo
public class Site {

	private String nome;
	private String endereco;
	private boolean status;

	public Site(String nome, String endereco, boolean status) {
		setNome(nome);
		setEndereco(endereco);
		setStatus(status);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String toString() {
		String status;
		if(isStatus() == true) {
			status = "Livre";
		}else {
			status = "Bloqueado";
		}
		return "Nome do site: " + getNome() + " \nEndereço: " + getEndereco() + " \nStatus: " + status;
	}

	public String getSiteOnline() {
		return "Nome do site: " + getNome() + " \nEndereço: " + getEndereco();
	}
}
