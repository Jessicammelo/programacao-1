package Exer02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto produto01 = new Produto("caderno", "Caderno em espiral tamanho m�dio", 4.50, 15);
		Produto produto02 = new Produto("esquadro", "Esquadro de acr�lico 20 cm", 2.35, 10);
		Produto produto03 = new Produto("caneta", "Caneta esferogr�fica 5mm", 1.20, 2);
		
		System.out.println(produto01);
		System.out.println(produto02);
		System.out.println(produto03);
	}

}
