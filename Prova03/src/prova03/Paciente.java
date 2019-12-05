package prova03;
//jessica melo
import java.util.ArrayList;

public class Paciente extends Pessoa{

	protected Plano plano;
	
	public Paciente(Plano plano,ArrayList<Consulta>consultas, String nome) {
		super(consultas, nome);
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	public String toString() {
		return "";
	}
	
	
	
}
