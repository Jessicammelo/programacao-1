package exercicio15;

public class Carro {

	private double velocidade;

	public Carro() {

	}

	public void setCarro(double velocidade) {
		this.setVelocidade(velocidade);
	}

	public String getCarro() {
		this.getVelocidade();
		return "A velocidade atual do carro � de " + getVelocidade();
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public void acelerar(double velocidade) {
		if (this.velocidade >= 0 && this.velocidade < 20) {
			double totalVelocidade = velocidade + this.getVelocidade();
			this.setVelocidade(totalVelocidade);
		} else {
			System.out.println("N�o foi poss�vel acelerar");
		}
	}

		public void reduzir(double velocidade) {
			if (this.velocidade >= 0 && this.velocidade < 30) {
				double totalVelocidade = velocidade - this.getVelocidade();
				this.setVelocidade(totalVelocidade);
			}else {
				System.out.println("N�o foi poss�vel reduzir");
			}
		}
	}

