package hashMap;

public class PessoaX {

	
	private String nome;
	private String cpf;
	
	public PessoaX (String nome, String cpf) {
		setNome(nome);
		setCpf(cpf);
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {
		return "Nome: " + getNome() + "CPF: " + getCpf();
	}
}
