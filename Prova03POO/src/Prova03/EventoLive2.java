package Prova03;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventoLive2 extends EventoBeneficente{

public EventoLive2(String titulo, LocalDate data, LocalTime horaInicio) {
		super(titulo, data, horaInicio);
		// TODO Auto-generated constructor stub
	}

private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
}
