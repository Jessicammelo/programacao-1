package exercicio01;

public class Teste {

	public static void main(String[] args) {
		Pessoa umaPessoa = new Pessoa("Jo�o", 21);
		//System.out.println(umaPessoa.imprimir());
		//esta dando erro aqui pq ainda n�o tenho o obj associado!
		Endereco umEndereco = new Endereco("R. Chile", "Blumenau");
		
		//estabelecendo uma associa��o
		umaPessoa.setEnd(umEndereco);
		System.out.println(umaPessoa.imprimir());
	}

}
