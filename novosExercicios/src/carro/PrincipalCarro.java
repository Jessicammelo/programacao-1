package carro;

import java.util.ArrayList;

public class PrincipalCarro {

	public static void main(String[] args) {
		ArrayList<Carro> carros = new ArrayList<Carro>();
		carros.add(new Carro("VW", 2015, 2, 20.000));
		carros.add(new Carro("Fiat", 2015, 2, 17.000));
		carros.add(new Carro("GM", 2017, 1, 25.000));

		for (int i = 0; i < carros.size(); i++) {
			Carro umCarro = carros.get(i);// retorna um carro pq no arraylist é carro
			// imprimindo as informações do objeto carro
			System.out.println(umCarro.exibirInfo());
			System.out.println("-----------------");
		}

		// 1 varrer a lista carros
		// 2 comparar os valores dos carros
		// 3 armazenar o valor

		double maiorValor = 0.0;
		String str = " ";
		// listar carros com maior preço
		for (int i = 0; i < carros.size(); i++) {
			// pegando o carro de uma posição
			Carro umCarro = carros.get(i);
			// comparando valor para estabelecer o maior valor
			if (umCarro.getPreco() > maiorValor) {
				maiorValor = umCarro.getPreco();
				str = umCarro.exibirInfo();
			} else {
				if (umCarro.getPreco() == maiorValor) {
					str = str + "\n\n" + umCarro.exibirInfo();
				}
			}

		}
		System.out.println("Carros com maior valor");
		System.out.println(str);
		// 1 informacoes Marca, valor X, valor Y
		// 2varrer a lista de carros
		// 3 comparar se o carro é da marca desejada
		// e se o valor do carro esta entre x e y
		// 4armazenar as informações do objeto carro

		String marca = "fiat";
		double valorX = 17000;
		double valorY = 27000;
		String str2 = " ";
		
		for(int i = 0;i<carros.size();i++){
			Carro umCarro = carros.get(i);
			if (umCarro.getMarca().equalsIgnoreCase(marca)) {
				if(umCarro.getPreco() > valorX && umCarro.getPreco() < valorY) {
					str2 = str2  + umCarro.exibirInfo() + "\n\n";
				}
					
			}
		}
		System.out.println(" ");
		System.out.println("carros entre os valor X e Y");
		System.out.println(str2);
	}
	
}
