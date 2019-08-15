package data;

import javax.swing.JOptionPane;

public class TrabalhoData {

	public static void tste(String[] args) {
		int dia, mes, ano = 0;
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia:"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês:"));
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));
		boolean validado = true;
		if (dia == 29 && mes == 2 && !(ano % 4 == 0)) {
			validado = false;
		}
		if (validado) {
			if (mes != 2) {
				if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
					if (dia == 30) {
						dia = 1;
						mes++;
						JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
					} else {
						dia++;
						JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
					}
				} else {
					if (dia == 31 && mes == 12) {
						dia = 1;
						mes = 1;
						ano++;
						JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
					} else {
						if (dia < 31) {
							dia++;
							JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
						} else {
							dia = 1;
							mes++;
							JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
						}
					}
				}
			} else {
				if (dia < 28) {
					dia = 1;
					mes++;
					JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
				} else {
					if (ano % 4 == 0) {
						dia = 1;
						mes++;
						JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
					} else {
						dia = 1;
						mes++;
						JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
					}
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "Sua data é inválida!");
		}
	}
}
