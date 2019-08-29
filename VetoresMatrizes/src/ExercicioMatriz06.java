// Soma elementos da linha
//somatorio total
public class ExercicioMatriz06 {

	public static void main(String[] args) {

		int matriz[][] = new int[2][4];
		// linha/coluna
		matriz[0][0] = 11;
		matriz[0][1] = 15;
		matriz[0][2] = 9;
		matriz[0][3] = 5;

		matriz[1][0] = 3;
		matriz[1][1] = 8;
		matriz[1][2] = 4;
		matriz[1][3] = 13;

		int total = 0;
		int totalLinha = 0;
		for (int linha = 0; linha < matriz.length; linha++) {
			totalLinha = 0;
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				totalLinha = totalLinha + matriz[linha][coluna];
			}
			total = total + totalLinha;
			System.out.print("\nItem a) Total linha:" + totalLinha);
		}
		System.out.print("\nItem b) Total:" + total);
	}

}
