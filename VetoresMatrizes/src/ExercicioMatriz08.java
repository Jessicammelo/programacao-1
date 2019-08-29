import javax.swing.JOptionPane;

public class ExercicioMatriz08 {

	public static void main(String[] args) {

		int valorPar = Integer.MAX_VALUE;
		int totalDiagonal = 0;
		int matriz[][] = { { 3, 5, 7, 2 }, { 21, 34, 56, 87 }, { 67, 78, 12, 35 }, { 9, 34, 57, 86 } };

		// realizando somatório da diagonal principal
		// ou seja, índice da linha e coluna são iguais

		for (int i = 0; i < matriz.length; i++) {
			totalDiagonal += matriz[i][i];
		}

		System.out.print("Item a) total diagonal: " + totalDiagonal);

		// encontrando o menor valor par existente na matriz

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				// verificando se o valor do elemento é par
				if (matriz[linha][coluna] % 2 == 0) {
					// verificando se ele é menor do que o menor valor par
					if (matriz[linha][coluna] < valorPar) {
						valorPar = matriz[linha][coluna];
					}

				}
			}

		}
		System.out.print("\nItem b) menor valor par: " + valorPar);

		int linha = Integer.parseInt(JOptionPane.showInputDialog(" Digite valor da linha:"));
		while (linha < 1 || linha > matriz.length) {
			linha = Integer.parseInt(JOptionPane.showInputDialog(" Digite valor da linha:"));
		}
		int coluna = Integer.parseInt(JOptionPane.showInputDialog(" Digite valor da coluna:"));
		while (coluna < 1 || coluna > matriz.length) {
			coluna = Integer.parseInt(JOptionPane.showInputDialog(" Digite valor da coluna:"));
		}
		System.out.print("\nItem c) valor linha e coluna: " + matriz[linha - 1][coluna - 1]);

		int matrizT[][] = new int[matriz.length][matriz.length];
		for (linha = 0; linha < matriz.length; linha++) {
			for (coluna = 0; coluna < matriz[linha].length; coluna++) {
				matrizT[linha][coluna] = matriz[coluna][linha];
			}
		}
		for (linha = 0; linha < matrizT.length; linha++) {
			for (coluna = 0; coluna < matrizT.length; coluna++) {
				System.out.print( matrizT[linha][coluna] + "\n ");
			}
		}
		System.out.print("");
	}
}
