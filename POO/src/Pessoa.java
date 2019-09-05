
public class Pessoa {

	// definindo caracteristicas das pessoas

	// [modificador] [tipo] [nome atributo]
	// private
	// public
	
	private String nome;
	private int idade;
	private double altura;
	private double peso;

	//[modificador][tipo retorno][nome]([lista parametros])
	public void setNome(String nome) {// setNome pra receber um nome
		//System.out.println("setNome" + nome);
		this.nome = nome;
	}
	public String getNome() { //getNome pra pegar o nome
		return nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() { //getNome pra pegar o nome
		return idade;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() { //getNome pra pegar o nome
		return altura;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() { //getNome pra pegar o nome
		return peso;
	}
	//ou
	public String imprimir() {
		return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nAltura: " + getAltura() + "\nPeso: " + getPeso();
	}
	
}
