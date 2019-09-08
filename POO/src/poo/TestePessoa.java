package poo;

public class TestePessoa {

	public static void main(String[] args) {
		// tipo primitiva
		// int num = 0;

		// tipo referencia
		Pessoa umaPessoa = new Pessoa();
		// criando um objeto do tipo pessoa
		// atribuindo caracteristicas a umaPessoa
		umaPessoa.setNome("João");
		umaPessoa.setIdade(21);
		umaPessoa.setAltura(1.73);
		umaPessoa.setPeso(66);
		//System.out.println(umaPessoa.getNome()); // Pessoa@15db9742 endereço da memória
		//System.out.println(umaPessoa.getIdade());
		//System.out.println(umaPessoa.getAltura());
		//System.out.println(umaPessoa.getPeso());
		System.out.println(umaPessoa.imprimir());
		
		
		
		Pessoa outraPessoa = new Pessoa();
		outraPessoa.setNome("Maria");
		System.out.println(outraPessoa.getNome());
	}

}
