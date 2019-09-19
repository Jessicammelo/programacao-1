package exercicio19;

public class TestaPonto {

	public static void main(String[] args) {

		Ponto vPontos[] = new Ponto[5];
		vPontos[0] = new Ponto(0.5, 25);
		vPontos[1] = new Ponto(1.0, 24);
		vPontos[2] = new Ponto(2.0, 20);
		vPontos[3] = new Ponto(3.0, 18);
		vPontos[4] = new Ponto(4.0, 15);

		double somaX = 0;
		double somaY = 0;
		for (int i = 0; i < vPontos.length; i++) {
			somaX += vPontos[i].getX();
			somaY += vPontos[i].getY();
		}
		System.out.println("Ex= " + somaX + "\nEy= " + somaY);

		double multiplica = 0;
		for (int i = 0; i < vPontos.length; i++) {
			multiplica += vPontos[i].getX() * vPontos[i].getY();
		}
		System.out.println("Exy= " + multiplica);

		double x2 = 0;
		for (int i = 0; i < vPontos.length; i++) {
			x2 += Math.pow(vPontos[i].getX(), 2);
		}
		System.out.println("Ex2= " + x2);

		double a = (5 * multiplica - (somaX * somaY)) / (5 * x2 - (Math.pow(somaX, 2)));
		System.out.println("a= " + a);
		double b = (somaY * x2 - (multiplica * somaX)) / (5 * x2 - (Math.pow(somaX, 2)));
		System.out.println("b= " + b);
	}

}