package questao3;

import javax.swing.JOptionPane;

public class TesteCarro {

	public static void main(String[] args) {

		Carro carro = new Carro();
		
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
