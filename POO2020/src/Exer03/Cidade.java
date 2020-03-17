package Exer03;

public class Cidade {

	private String nome;
	private String UF;
	private int popMasculina;
	private int popFeminina;
	private boolean calculado;
	
	public Cidade(String nome, String UF, int popMasculina, int popFeminina,boolean calculado ) {
		setNome(nome);
		setUF(UF);
		setPopMasculina(popMasculina);
		setPopFeminina(popFeminina);
		setCalculado(calculado);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public int getPopMasculina() {
		return popMasculina;
	}

	public void setPopMasculina(int popMasculina) {
		this.popMasculina = popMasculina;
	}

	public int getPopFeminina() {
		return popFeminina;
	}

	public void setPopFeminina(int popFeminina) {
		this.popFeminina = popFeminina;
	}

	public boolean isCalculado() {
		return calculado;
	}

	public void setCalculado(boolean calculado) {
		this.calculado = calculado;
	}
	
	public String toString() {
		String str = "Nome: " + getNome() + 
				"\nUf: " + getUF() + 
				"\nPop masc: " + getPopMasculina() + 
				"\nPopFem: " + getPopFeminina() + 
				"\nCalculado: " + true;
		
		return str;
	}
}
