package ultra;

public class Lutador {

	private String nome;
	private String nascionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;
	
	public void apresentar() {
		System.out.println("Chegou a hora!" + this.getNome());
		System.out.println("Diretamente de " + this.getNascionalidade());
		System.out.println("com" + this.getIdade() + "anos e " + this.getAltura());
		System.out.println("pesando " + this.getPeso());
		System.out.println(this.getVitorias() + "Votórias");
		System.out.println(this.getDerrotas() + "derrotas e ");
		System.out.println(this.getEmpates() + "empates!");
	}
	
	public void status() {
		System.out.println(this.getNome() + " é um peso " + this.getCategoria() );
		System.out.println("ganhou " + this.getVitorias() + " vezes");
		System.out.println("perdeu " + this.getDerrotas() + " vezes");
		System.out.println("empatou " + this.getEmpates() + " vezes");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
		
	}
		
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

	public Lutador(String nome, String nascionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		this.nome = nome;
		this.nascionalidade = nascionalidade;
		this.idade = idade;
		this.altura = altura;
		setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascionalidade() {
		return nascionalidade;
	}

	public void setNascionalidade(String nascionalidade) {
		this.nascionalidade = nascionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		if ( this.peso < 52.2) {
			this.categoria = "invalido";
		}else if (this.peso <=70.3) {
			this.categoria = "Leve";
		}else if (this.peso <=80.9) {
			this.categoria = "Médio";
		}else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria =  "Invalido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
	
}

