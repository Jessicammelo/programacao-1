package exercicio14;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class PrincipalCinema {

	public static void main(String[] args) {
	
		EntradaCinema cinema = new EntradaCinema();
		
		String dataNasc = JOptionPane.showInputDialog("Digite data de nascimento (sem barra):");
		int numCarteiraEstudante = Integer.parseInt(JOptionPane.showInputDialog("Digite data de nascimento (sem barra):"));
		Calendar c = Calendar.getInstance();
        c.set(2019, Calendar.OCTOBER , 2);
        Date data = c.getTime();
        DateFormat formataData = DateFormat.getDateInstance();
        System.out.println("Data atual com formatação: "+ formataData.format(data));
		System.out.println("data nasc" + dataNasc);

	}

}
