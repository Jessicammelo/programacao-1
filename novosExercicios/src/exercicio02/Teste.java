package exercicio02;

import java.util.ArrayList;

import exercicio01.Endereco;
import exercicio01.Pessoa;

public class Teste {

	public static void main(String[] args) {

		Endereco umEndereco = new Endereco("Alemanha","Blumenau");
		Concorrente concorrente = new Concorrente("Jessica", "adm", 0123,umEndereco);
		Prova prova = new Prova(8.6, concorrente);
			
		//System.out.println(prova.imprimir());
		

		ArrayList lista = new ArrayList();
		lista.add("Jessica");
		lista.add("Maria");
		lista.add("Pedro");
		lista.add(1);
		lista.add(new Pessoa("João", 21));
		
		for(int i = 0; i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
	}

}
