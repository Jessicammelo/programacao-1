package Prova02;
//Jéssica Melo, Jéssica Strutz
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

public class Aluno {

	private String nome;
	ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

	void addAvaliacao(Avaliacao avaliacao) {
		avaliacoes.add(avaliacao);
	}

	float getMedia() {
		float media = 0;

		for (Avaliacao avaliacao : avaliacoes)
			media += avaliacao.getNota();

		media /= avaliacoes.size();

		return media;
	}

	String exibeBoletim() {
		String boletim = "";
		boletim += nome + " obteve a média " + getMedia() + " em função das avaliações: ";
		for (Avaliacao avaliacao : avaliacoes) {
			boletim += "\nDescrição: " + avaliacao.getDescricao();
			boletim += "\nNota: " + avaliacao.getNota() + "\n\n";
		}

		return boletim;
	}

	void setNome(String nome) {
		if ("".equals(nome)) {
			throw new RuntimeErrorException(null,"Nome não pode ser vazio!");
		}
		this.nome = nome;
		
	}
}
