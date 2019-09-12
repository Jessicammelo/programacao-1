package exercicio7;
//7.  �  necess�rio  desenvolver  um  m�todo  para  calcular  a  dist�ncia  de  dois
//pontos  em  um  sistema  de  coordenadas cartesiano. Este valor � dado pela equa��o: 
//d = raiz[ (x1 � x2)2 + (y1 � y2)2  ]
//onde:  x1  e  y1  s�o  as  coordenadas  do  ponto  1  e  x2  e  y2  as  do  ponto  2,
//que  devem  ser  passadas  como  argumentos  para calcular a dist�ncia entre os dois pontos.
//Retorne o valor em double e responda: a dist�ncia pode ser negativa? Sim/N�o e por qu�?
//metodo de classe e de instancia

import javax.swing.JOptionPane;

public class TesteCalcularDistancia {

	public static void main(String[] args) {
		//entrada de valores
		double x = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para x1"));
		double y = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para y1"));

		//criando objeto do tipo CalcularDistancia
		CalcularDistancia umPonto = new CalcularDistancia(x, y);
		
		//populando jeito antigo
		//umPonto.setX(x);
		//umPonto.setY(y);
		//System.out.println("X: " + umPonto.getX() + "Y: " + umPonto.getY());

		System.out.println(umPonto.imprimir());

		CalcularDistancia segundoPonto = new CalcularDistancia(1.0, 3.0);
		System.out.println(segundoPonto.imprimir());

		System.out.println("Distancia: " + umPonto.calcular(segundoPonto));
	}

}
