package Quadrante;

public class Ponto {

	private double x;
	private double y;
	
	public Ponto() {
		
	}

	public Ponto(double x, double y) {
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

	public int verificarQuadrante() {
		if (getX() >= 0 && getY() > 0) {
			return 1;
		} else {
			if (getX() > 0 && getY() <= 0) {
				return 2;
			} else {
				if (getX() <= 0 && getY() < 0) {
					return 3;
				} else {
					if (getX() < 0 && getY() >= 0) {
						return 4;
					}
				}
			}
		}
		return 0;

	}

}
