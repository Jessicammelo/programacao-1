package data;

import javax.swing.JOptionPane;

public class Data {

	public static void main1(String[] args) {
		int dia, mes, ano = 0;
		dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o dia!"));
		mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o mês!"));
		ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano!"));

		if (dia + 1 < 28) {
			JOptionPane.showMessageDialog(null, (dia + 1) + "/" + mes + "/" + ano);
		} else {
			if (mes == 2) {
				if (ano % 4 == 0) {
					JOptionPane.showMessageDialog(null, (dia + 1) + "/" + mes + "/" + ano);
				} else {
					JOptionPane.showMessageDialog(null, 01 + "/" + (mes + 1) + "/" + ano);
				}
			}
			switch (mes) {
			case 4:
			case 6:
			case 9:
			case 11:
				if (dia + 1 > 30) {
					JOptionPane.showMessageDialog(null, 01 + "/" + (mes + 1) + "/" + ano);
				} else {
					JOptionPane.showMessageDialog(null, (dia + 1) + "/" + mes + "/" + ano);
				}
				break;

			default:
				if (dia + 1 > 31) {
					if (mes == 12) {
						JOptionPane.showMessageDialog(null, 01 + "/" + 01 + "/" + (ano + 1));
					} else {
						JOptionPane.showMessageDialog(null, 01 + "/" + (mes + 1) + "/" + ano);
					}
				} else {
					JOptionPane.showMessageDialog(null, (dia + 1) + "/" + mes + "/" + ano);
				}
				break;
			}
		}

	}

}
