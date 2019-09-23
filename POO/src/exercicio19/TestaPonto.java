package exercicio19;

import Quadrante.Ponto;

public class TestaPonto {

	public static void main(String[] args) {

		TestaPonto testePonto = new TestaPonto();// para acessar o metodo do main preciso criar um new da classe
		Calculo calculo = new Calculo();
		Ponto vPontos[] = new Ponto[5];
		vPontos[0] = new Ponto(0.5, 25);
		vPontos[1] = new Ponto(1.0, 24);
		vPontos[2] = new Ponto(2.0, 20);
		vPontos[3] = new Ponto(3.0, 18);
		vPontos[4] = new Ponto(4.0, 15);

		double somaX = testePonto.somatorioX(vPontos);
		double somaY = testePonto.somatorioY(vPontos);
		double multiplica = testePonto.somatorioXY(vPontos);
		double x2 = testePonto.somatorioX2(vPontos);
		double a = calculo.calculoA(multiplica, somaX, somaY, x2);
		double b = calculo.calculoB(multiplica, somaX, somaY, x2);

		System.out.println("Ex= " + somaX + "\nEy= " + somaY);
		System.out.println("Exy= " + multiplica);
		System.out.println("Ex2= " + x2);
		System.out.println("a= " + a);
		System.out.println("b= " + b);

	}
	//metodos criados sempre fora do main

	public double somatorioX(Ponto vPontos[]) {// se fosse um void colocaria um sistem
		double somaX = 0;
		for (int i = 0; i < vPontos.length; i++) {
			somaX += vPontos[i].getX();

		}
		return somaX;
	}

	public double somatorioY(Ponto vPontos[]) {
		double somaY = 0;
		for (int i = 0; i < vPontos.length; i++) {

			somaY += vPontos[i].getY();
		}
		return somaY;
	}

	public double somatorioXY(Ponto vPontos[]) {
		double multiplica = 0;
		for (int i = 0; i < vPontos.length; i++) {
			multiplica += vPontos[i].getX() * vPontos[i].getY();
		}
		return multiplica;
	}

	public double somatorioX2(Ponto vPontos[]) {
		double x2 = 0;
		for (int i = 0; i < vPontos.length; i++) {
			x2 += Math.pow(vPontos[i].getX(), 2);
		}
		return x2;
	}
	
	

}