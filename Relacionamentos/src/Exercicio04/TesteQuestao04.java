package Exercicio04;

import java.util.HashMap;
import java.util.Map;

public class TesteQuestao04 {

	public static void main(String[] args) {
		 Artigo umArtigo = new Artigo("Manual do usuário 2 ", "João");

		 umArtigo.adicionarRevisor(new Revisor("Pedro ","Erro do português ", false));
		 umArtigo.adicionarRevisor(new Revisor("Moises ", "Erros conceituais ", false));
		 umArtigo.adicionarRevisor(new Revisor("Judas ", "Exelente referência ", true));
		 System.out.println(umArtigo);
		 
		 HashMap<String, Artigo> artigosSubmetidos = new HashMap<String, Artigo>();
		 artigosSubmetidos.put(umArtigo.getTitulo(), umArtigo);
		 System.out.println(artigosSubmetidos.get("Manual do usuário 2"));
		 
		 for(String chave : artigosSubmetidos.keySet()){//key set retorna conjunto de chaves
			 System.out.println(artigosSubmetidos.get(chave));// mostra um vetor com todos
		 }
		 //for(Map.Entry<String, Artigo> par : artigosSubmetidos.entrySet()) {
			// System.out.println(par.getKey());
			// System.out.println(par.getValue()); mostrar chave e ou valor
		// }
	}

}
