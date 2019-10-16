package exercicio01;

public class Pessoa {
	// declarando atributos
	private String nome;
	private int idade;
	private Endereco end; // associação

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	// definir um construtor para inicializar os atributos
	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}

	// metodos acessores e modificadores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String imprimir() {
		return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\n" + getEnd().imprimir();
	}

}
