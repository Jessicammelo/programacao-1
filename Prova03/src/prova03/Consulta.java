package prova03;
//Jessica melo
import java.util.Date;

public class Consulta {

	protected int codigo;
	protected Paciente paciente;
	protected Medico medico;
	protected Date data;
	protected double valorConsulta;
	
	public Consulta(int codigo, Paciente paciente, Medico medico, Date data, double valorConsulta) {
		setCodigo(codigo);
		setPaciente(paciente);
		setMedico(medico);
		setData(data);
		setValorConsulta(valorConsulta);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}
	
	public String toString() {
		return"";
	}
}
