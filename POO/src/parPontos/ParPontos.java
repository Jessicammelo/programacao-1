package parPontos;

import exercicio7.CalcularDistancia;

public class ParPontos {

	public static void main(String[] args) {
		CalcularDistancia vetorPontos[] = new CalcularDistancia[4];

		vetorPontos[0] = new CalcularDistancia(1.0, 1.0);// p1
		vetorPontos[1] = new CalcularDistancia(3.0, 1.0);// p2
		vetorPontos[2] = new CalcularDistancia(2.0, 4.0);// p3
		vetorPontos[3] = new CalcularDistancia(3.0, 4.0);// p4

		double menorDistancia = Double.MAX_VALUE;
		CalcularDistancia p1, p2;
		double d;
		for (int i = 0; i < vetorPontos.length - 1; i++) {
			for (int j = i + 1; j < vetorPontos.length; j++) {

				// pegando a referencia dos pontos
				p1 = vetorPontos[i];
				p2 = vetorPontos[j];

				// chamando metodo que calcula a distancia entre dois pontos
				d = p1.calcular(p2);

				// verificar a menor distancia
				if (d < menorDistancia) {
					// guardando a menor distancia
					menorDistancia = d;
				}
			}
		}
		System.out.println("menor distancia: " + menorDistancia);

	}

}
