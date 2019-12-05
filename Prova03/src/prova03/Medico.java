package prova03;
//jessica melo
import java.util.ArrayList;

public class Medico extends Pessoa{

	protected String CRM;
	protected String especialidade;
	
	public Medico(ArrayList<Consulta>consultas, String nome, String CRM, String especialidade) {
		super(consultas, nome);
		setCRM(CRM);
		setEspecialidade(especialidade);
		
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String toString() {
		return"";
	}

	
	
}
