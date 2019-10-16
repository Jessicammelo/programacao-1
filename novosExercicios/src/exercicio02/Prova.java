package exercicio02;


public class Prova {

	private double nota;
	private Concorrente concorrente;
	

	public Concorrente getConcorrente() {
		return concorrente;
	}

	public void setConcorrente(Concorrente concorrente) {
		this.concorrente = concorrente;
	}

	public Prova(double nota, Concorrente concorrente) {
		setNota(nota);
		setConcorrente(concorrente);
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public String imprimir() {
		return getConcorrente().imprimir() + "\nNota: " + getNota();
		
		
	}
			
}