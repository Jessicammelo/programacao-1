package aula02;

public class aula02 {

	public static void teste(String[] args) {
		
		Caneta c1 = new Caneta();
		c1.modelo = "bic cristal";
		c1.cor = "azul";
		c1.ponta = 0.5f;
		c1.carga = 80;
		c1.tampada = true;
		c1.status();
		c1.rabiscar();

	}

}
