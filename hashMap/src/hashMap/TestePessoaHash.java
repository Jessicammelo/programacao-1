package hashMap;
//trabalho exercicio 4
import java.util.HashMap;

public class TestePessoaHash {

	public static void inserirPessoaHash(PessoaX pessoa, HashMap<String, PessoaX> pessoas) {
		//add ao hashMap um obj pessoa utilizando o cpf como chave
		pessoas.put(pessoa.getCpf(), pessoa);
	}

	public static void imprimirPessoasHash(HashMap<String, PessoaX> pessoas) {
		for(String chaveCPF : pessoas.keySet()) {
			System.out.println(pessoas.get(chaveCPF));
		}
	}
	public static void main(String[] args) {
		// criando objetos
		PessoaX umaPessoa = new PessoaX("João", "123456789");
		PessoaX outraPessoa = new PessoaX("Maria", "258741369");

		// criando hashMap para armazenar
		HashMap<String, PessoaX> pessoas = new HashMap<String, PessoaX>();
		// add obj pessoa as hashMap de pessoas
		inserirPessoaHash(umaPessoa, pessoas);
		inserirPessoaHash(outraPessoa, pessoas);
		
		System.out.println(pessoas.size());
		//chamando metodo para imprimir todas as pessoas armazenadas
		System.out.println(pessoas);
	}

}
