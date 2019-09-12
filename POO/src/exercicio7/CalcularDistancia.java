package exercicio7;

public class CalcularDistancia {

	private double x;
	private double y;

	public CalcularDistancia(double x, double y) {
		setX(x);
		setY(y);
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getX() {
		return this.x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getY() {
		return this.y;
	}

	// metodo que calcula distancia
	public double calcular(CalcularDistancia segundoPonto) {
		return Math.sqrt(Math.pow((this.getX() - segundoPonto.getX()), 2)
				+ Math.pow((this.getY() - segundoPonto.getY()), 2));
	}

	public String imprimir() {
		return " X: " + getX() + " Y: " + getY();
	}
}
