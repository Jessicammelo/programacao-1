package exercicio01;

public class Teste {

	public static void main(String[] args) {
		Pessoa umaPessoa = new Pessoa("João", 21);
		//System.out.println(umaPessoa.imprimir());
		//esta dando erro aqui pq ainda não tenho o obj associado!
		Endereco umEndereco = new Endereco("R. Chile", "Blumenau");
		
		//estabelecendo uma associação
		umaPessoa.setEnd(umEndereco);
		System.out.println(umaPessoa.imprimir());
	}

}
