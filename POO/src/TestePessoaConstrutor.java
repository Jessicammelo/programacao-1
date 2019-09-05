
public class TestePessoaConstrutor {

	public static void main(String[] args) {
		// tipo primitiva
		// int num = 0;

		// tipo referencia
		PessoaConstrutor umaPessoa = null;
		umaPessoa = new PessoaConstrutor("João", 21, 1.73, 66);
		// criando um objeto do tipo pessoa
		// atribuindo caracteristicas a umaPessoa

		// System.out.println(umaPessoa.getNome()); // Pessoa@15db9742 endereço da
		// memória
		// System.out.println(umaPessoa.getIdade());
		// System.out.println(umaPessoa.getAltura());
		// System.out.println(umaPessoa.getPeso());
		System.out.println(umaPessoa.imprimir());

		PessoaConstrutor outraPessoa = new PessoaConstrutor("MARIA", 23, 1.65, 50);
		System.out.println(outraPessoa.imprimir());
	}

}
