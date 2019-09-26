package exercicio12;

public class Apolice {

	// declarando atributos
	private String nome;
	private int idade;
	private double valorPremio;

	// metodos modificadores/acessores (sets e gets)
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

	public double getValorPremio() {
		return valorPremio;
	}

	public void setValorPremio(double valorPremio) {
		this.valorPremio = valorPremio;
	}

	// metodos para mostraras informaçoes da classe
	public String imprimir() {
		return "Imprimindo os dados inicializados" + "\nNome: " + getNome() + "\nIdade: " + getIdade()
				+ "\nValor Premio: " + getValorPremio();
	}

	// metodo pra calcular premio
	public void calcularPremio(int idade, double valorPremio) {
		if (getIdade() > 36) {
			setValorPremio(getValorPremio() * 1.1);
		} else {
			if (getIdade() > 25) {
				setValorPremio(getValorPremio() * 1.15);
			} else {
				if (getIdade() >= 18) {
					setValorPremio(getValorPremio() * 1.2);
				}
			}
		}
	}

	public void oferecerDesconto(String cidade) {
		if (cidade.equalsIgnoreCase("Ihota")) {
			setValorPremio(getValorPremio() * 0.95);
		} else {
			if (cidade.equalsIgnoreCase("Blumenau")) {
				setValorPremio(getValorPremio() * 0.97);
			} else {
				if (cidade.equalsIgnoreCase("Itajai")) {
					setValorPremio(getValorPremio() * 0.99);
				}
			}
		}
	}
}
