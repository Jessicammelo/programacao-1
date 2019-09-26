package exercicio12;

import java.io.ObjectInputStream.GetField;

public class PrincipalApolice {


	public static void main(String[] args) {
	
		Apolice apolice = new Apolice();
		
		//a)Para cada atributo da classe  atribuir um valor; 
		apolice.setNome("Jessica Melo");
		apolice.setIdade(27);
		apolice.setValorPremio(900.0);
		
		//b)Executar o método imprimir() e analisar o que será impresso na tela;
		System.out.println(apolice.imprimir());
		
		
		//c)Em seguida, executar o método calcularPremio(); 
		apolice.calcularPremio(apolice.getIdade(), apolice.getValorPremio());
		
		//d)executar imprimir
		System.out.println(apolice.imprimir());
		
		//e)Exercutar metodo oferecerDesconto()
		apolice.oferecerDesconto("Blumenau");
		
		System.out.println(apolice.imprimir());
		
		
	}

}
