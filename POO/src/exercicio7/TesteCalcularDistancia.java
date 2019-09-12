package exercicio7;
//7.  É  necessário  desenvolver  um  método  para  calcular  a  distância  de  dois
//pontos  em  um  sistema  de  coordenadas cartesiano. Este valor é dado pela equação: 
//d = raiz[ (x1 – x2)2 + (y1 – y2)2  ]
//onde:  x1  e  y1  são  as  coordenadas  do  ponto  1  e  x2  e  y2  as  do  ponto  2,
//que  devem  ser  passadas  como  argumentos  para calcular a distância entre os dois pontos.
//Retorne o valor em double e responda: a distância pode ser negativa? Sim/Não e por quê?
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
