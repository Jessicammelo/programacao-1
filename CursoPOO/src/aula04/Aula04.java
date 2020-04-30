package aula04;

public class Aula04 {

	public static void tste(String[] args) {
		Caneta c1 = new Caneta("nic", "amarelo", 0.4f);
		//c1.setModelo("Bic");
		c1.modelo = "bic";
		c1.setPonta(0.5f);//mais com o set eu posso acessar
		//c1.ponta = 0.5f//ponta é private não posso mexer
		//c1.status();
		c1.destampar();
		
		System.out.println("tenho uma caneta " + c1.getModelo() + " de ponta "+ c1.getPonta());
		c1.status();
	}

}
