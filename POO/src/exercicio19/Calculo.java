package exercicio19;

public class Calculo {

	
	public double calculoA(double multiplica, double somaX, double somaY, double x2) {
		double a = 0;
		a = (5 * multiplica - (somaX * somaY)) / (5 * x2 - (Math.pow(somaX, 2)));
		return a;
	}
	
	public double calculoB(double multiplica, double somaX, double somaY, double x2 ) {
		double b = 0;
		b = (somaY * x2 - (multiplica * somaX)) / (5 * x2 - (Math.pow(somaX, 2)));
		return b;
	}
	
	
}
