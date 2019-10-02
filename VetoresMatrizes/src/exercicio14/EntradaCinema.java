package exercicio14;

public class EntradaCinema {

	
	private String dataFilme;
	private int horario;
	private String sala;
	private double valor;
	private String valorDesconto;
	
	

	public String getDataFilme() {
		return dataFilme;
	}

	public void setDataFilme(String dataFilme) {
		this.dataFilme = dataFilme;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double CalculaDesconto(String dataNasc, String data) {
		int idade = Integer.parseInt(data - dataNasc);	
		if(idade <= 12) {
	 double valorDesconto = getValor() / 2;
		}
		return valorDesconto;
	}
	
	public double CalculaDesconto(String dataNasc, int numCarteiraEstudante) {
		
	}
	
	public double CalculaDescontoHorario() {
		
	}
	
	public String Imprimir() {
		
	}
}
