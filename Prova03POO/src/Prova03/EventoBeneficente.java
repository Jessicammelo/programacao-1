package Prova03;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public abstract class EventoBeneficente {

	private String titulo;
	private LocalDate data;
	private LocalTime horaInicio;
	private List<Entidade> Container = new ArrayList<>();

	public EventoBeneficente(String titulo, LocalDate data, LocalTime horaInicio) {
		this.titulo = titulo;
		this.data = data;
		this.horaInicio = horaInicio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public void addEntidade(Entidade entidade) {
		this.Container.add(entidade);
	}

}
