package hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class ExemploHash {

	public static void main(String[] args) {
		HashMap<String, String> pessoas = new HashMap<String, String>();
		//set são as chaves e collection os valores
		//hasnext diz que tem alguma coisa
		//net pega o obj
		//iterator faz uma sequencia de objetos
		
		pessoas.put("123", "João");
		pessoas.put("456", "Maria");
		pessoas.put("789", "Pedro");
		pessoas.put("035", "Marta");
		pessoas.put("157", "Matheus");
		pessoas.put("536", "Madalena");
		pessoas.put("541", "Abigaíl");
		
		//System.out.println(pessoas.put("035", "Madalena"));//o segundo valor sobscreve o ultimo
		//System.out.println(pessoas.put("035", "Abigaíl"));
		
		//System.out.println(pessoas.get("035"));
		
		//excluir
		//System.out.println("tamanho antes: " + pessoas.size());
		//System.out.println(pessoas.remove("456"));
		//System.out.println("tamanho depois: " + pessoas.size());
		
		Iterator itPessoas = pessoas.values().iterator();
		while(itPessoas.hasNext()) {
			System.out.println(itPessoas.next());
		}
		System.out.println(" outra forma de varrer");
		for(String chave : pessoas.keySet()) {
			System.out.println(pessoas.get(chave));
		}
	}
}
