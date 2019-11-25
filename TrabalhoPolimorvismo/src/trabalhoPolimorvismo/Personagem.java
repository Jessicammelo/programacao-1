package trabalhoPolimorvismo;

import java.util.ArrayList;

public class Personagem {

	private ArrayList<SuperPoder> superPoder;
	private String nome;
	private String nomeVidaReal;

	public Personagem(ArrayList<SuperPoder> superPoder, String nome, String nomeVidaReal) {
		setSuperPoder(superPoder);
		setNome(nome);
		setNomeVidaReal(nomeVidaReal);
	}

	public ArrayList<SuperPoder> getSuperPoder() {
		return superPoder;
	}

	public void setSuperPoder(ArrayList<SuperPoder> superPoder) {
		this.superPoder = superPoder;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeVidaReal() {
		return nomeVidaReal;
	}

	public void setNomeVidaReal(String nomeVidaReal) {
		this.nomeVidaReal = nomeVidaReal;
	}

	public void adicionaSuperPoder(SuperPoder sp) {
		if (this.superPoder == null) {
			this.superPoder = new ArrayList<SuperPoder>();
		}
		this.superPoder.add(sp);
	}

	public int getPoderTotal() {
		if (getSuperPoder() != null) {
			int poderTotal = 0;
			for (SuperPoder poder : getSuperPoder()) {
				poderTotal += poder.getCategoria();
			}
			return poderTotal;
		}
		return 0;
	}
}
