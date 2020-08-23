package Prova03;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventoDriveThru extends EventoBeneficente {

	private LocalTime horaTermino;
	private String nomeLocalRetirada;
	private String enderecoLocalRetirada;

	public EventoDriveThru(String titulo, LocalDate data, LocalTime horaInicio) {
		super(titulo, data, horaInicio);
	}

	public LocalTime getHoraTermino() {
		return horaTermino;
	}

	public void setHoraTermino(LocalTime horaTermino) {
		this.horaTermino = horaTermino;
	}

	public String getNomeLocalRetirada() {
		return nomeLocalRetirada;
	}

	public void setNomeLocalRetirada(String nomeLocalRetirada) {
		this.nomeLocalRetirada = nomeLocalRetirada;
	}

	public String getEnderecoLocalRetirada() {
		return enderecoLocalRetirada;
	}

	public void setEnderecoLocalRetirada(String enderecoLocalRetirada) {
		this.enderecoLocalRetirada = enderecoLocalRetirada;
	}

}
