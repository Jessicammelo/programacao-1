package questao3;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;
//Jessica Melo
public class TesteCarro {

	public static void main(String[] args) {
		//int vetor[] =  new int[5];
		//ArrayList lista = new ArrayList();
		//lista.add(5);
		//lista.add(9);
		//associação
		//varias pessoas compoe uma família usar arraylist
		
		
		
		Scanner ler = new Scanner(System.in);
		
		//fazer uma string rebece informaçoes do carro tipo o imprimir
		Carro carro = new Carro();
		String c = " ";
		//String vetorCarros[] = new String[c];
		
		//for (int i=0; i<c; i++) {
		      //System.out.printf("Informe modelo: ", (i+1), c);
		      //vetorCarros[i] = ler.next();
		    //}
		
		//int soma = 0;
	    //int menor = vetorCarros[0]; // v[0] = 1o. valor armazenador no vetor "v"
	    //int maior = vetorCarros[0];
	   // for (int i=0; i<c; i++) {
	      //soma = soma + vetorCarros[i];
	 
	     // if (vetorCarros[i] < menor)
	        // menor = vetorCarros[i];
	 
	      //if (vetorCarros[i] > maior)
	         //maior = vetorCarros[i];
	    //}
	    //System.out.printf("\n");
	    //for (int i=0; i<c; i++) {
	      //if (vetorCarros[i] == menor)
	        //System.out.printf("v[%d] = %2d <--- menor valor\n", i, vetorCarros[i]);
	     // else if (vetorCarros[i] == maior)
	        //      System.out.printf("v[%d] = %2d <--- maior valor\n", i, vetorCarros[i]);
	         //  else System.out.printf("v[%d] = %2d\n", i, vetorCarros[i]);
	    
	 
	   // System.out.printf("\nSoma = %d\n", soma);
	  
		carro.setModelo("palio");
		carro.setMarca("fiat");
		carro.setPlaca("mHf1254");
		carro.setCor("vermelha");
		carro.setAno(2010);
		carro.setPreco(17000);
		carro.setLocalizacao(1);
		
		carro.setModelo("uno");
		carro.setMarca("fiat");
		carro.setPlaca("mH1528");
		carro.setCor("preto");
		carro.setAno(2006);
		carro.setPreco(7000);
		carro.setLocalizacao(2);
		
		carro.setModelo("argo");
		carro.setMarca("fiat");
		carro.setPlaca("mjf2547");
		carro.setCor("branco");
		carro.setAno(2017);
		carro.setPreco(55000);
		carro.setLocalizacao(3);
		
		System.out.println(carro.imprimir());
	}

}
