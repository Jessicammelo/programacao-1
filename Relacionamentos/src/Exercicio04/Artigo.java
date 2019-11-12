package Exercicio04;

import java.util.ArrayList;

public class Artigo {
	//é um todo lozango que significa que é o todo

	private String titulo,autor;
	private ArrayList<Revisor> revisores; // agregação
		
	public Artigo(String titulo,String autor) {
		setTitulo(titulo);
		setAutor(autor);
		revisores = new ArrayList<Revisor>();
	}

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	//metodo para adicionar/agregar revisor ao artigo
	public void adicionarRevisor(Revisor umRevisor) {
		revisores.add(umRevisor);
	}
	
	public String toString() {
		String str = "Título: " + getTitulo() + 
				"Autor: " + getAutor();
		for(Revisor umRevisor: revisores) { // varrendo revisores
			str += "\n" + umRevisor;
		}
		return str;
	}
}
