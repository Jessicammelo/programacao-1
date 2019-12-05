package prova03;
//Jessica melo
import java.util.ArrayList;


public abstract class Pessoa {

	protected ArrayList<Consulta> consultas;
	protected String nome;
	
	public Pessoa(ArrayList<Consulta>consultas, String nome) {
		setConsultas(consultas);
		setNome(nome);
	}

	public ArrayList<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(ArrayList<Consulta> consultas) {
		this.consultas = consultas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionarConsulta(Consulta consultas) {
		if (this.consultas == null) {
			this.consultas = new ArrayList<Consulta>();
		}
		this.consultas.add(consultas);
	}
	
	public String toString() {
		return"";
	}
}
