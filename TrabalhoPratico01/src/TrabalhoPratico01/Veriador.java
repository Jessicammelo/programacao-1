package TrabalhoPratico01;

import java.util.ArrayList;

public class Veriador {

	private String nome;
	private Partido partido;
	private ArrayList<Projetos> projetos;

	public Veriador(String nome, Partido partido, ArrayList<Projetos> projetos) {
		setNome(nome);
		setPartido(partido);
		setProjetos(projetos);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public ArrayList<Projetos> getProjetos() {
		return projetos;
	}

	public void setProjetos(ArrayList<Projetos> projetos) {
		this.projetos = projetos;
	}

	public double desempenho() {
		if(indiceProjetos() == 0) {
			return 0;
		}
		return (projetosAprovados() / getProjetos().size()) * indiceProjetos();

	}

	public int projetosAprovados() {
		ArrayList<Projetos> projetos = new ArrayList<Projetos>();
		for (Projetos p : getProjetos()) {
			if (p.isStatus()) {
				projetos.add(p);
			}
		}
		return projetos.size();
	}

	public double indiceProjetos() {
		double indiceTrabalho = 0.0;
		if (getProjetos().size() < 6) {
			indiceTrabalho = 0.8;
		} else if (getProjetos().size() > 6 && getProjetos().size() < 10) {
			indiceTrabalho = 1;
		} else if (getProjetos().size() > 11 && getProjetos().size() < 17) {
			indiceTrabalho = 1.08;
		} else if (getProjetos().size() > 17) {
			indiceTrabalho = 1.22;
		} else if (getProjetos().size() == 0) {
			indiceTrabalho = 0;
		}
		return indiceTrabalho;
	}

	public String toString() {
		return "Nome: " + getNome() + "\n" + getPartido().toString() +
				"\nDesempenho:" + desempenho() + "\nTotal de projetos apresentados: " 
				+ getProjetos().size() + "\nProjetos aprovados: " + projetosAprovados() + "\n";
	}
	
}
